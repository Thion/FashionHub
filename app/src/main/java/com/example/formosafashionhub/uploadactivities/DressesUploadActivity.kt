package com.example.formosafashionhub.uploadactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formosafashionhub.R
import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formosafashionhub.classes.Product
import com.example.formosafashionhub.clothesactivities.ProductsActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DressesUploadActivity : AppCompatActivity() {
    private lateinit var itemTitleEditText: EditText
    private lateinit var itemDescriptionEditText: EditText
    private lateinit var itemPriceEditText: EditText
    private lateinit var itemImageView: ImageView
    private lateinit var saveItemButton: Button
    private lateinit var updateItem: Button
    private lateinit var databaseReference: DatabaseReference
    private val PICK_IMAGE_REQUEST = 1
    private lateinit var imageUris: MutableList<Uri>
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImageAdapter
    private lateinit var progressDialog: ProgressDialog



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dresses_upload)


        imageUris = mutableListOf()
        recyclerView = findViewById(R.id.dressesrecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        adapter = ImageAdapter(imageUris)
        recyclerView.adapter = adapter

        itemTitleEditText = findViewById(R.id.mEdtDressesName)
        itemDescriptionEditText = findViewById(R.id.mEdtDescriptionDresses)
        itemPriceEditText = findViewById(R.id.mEdtPriceDresses)
        itemImageView = findViewById(R.id.DressesimageView)
        saveItemButton = findViewById(R.id.DressesBtnSave)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Uploading")
        progressDialog.setMessage("Please wait...")


        itemImageView.setOnClickListener {openGallery() }

        saveItemButton.setOnClickListener {
            saveProduct()

        }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
        intent.type = "image/*"
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data?.clipData != null) {
                val count = data.clipData!!.itemCount
                for (i in 0 until count) {
                    val imageUri = data.clipData!!.getItemAt(i).uri
                    imageUris.add(imageUri)
                }
            } else {
                val imageUri = data?.data
                imageUris.add(imageUri!!)
            }
            adapter.notifyDataSetChanged()
        }
    }
    inner class ImageAdapter(private val imageUris: List<Uri>) :
        RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

        inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
            return ImageViewHolder(view)
        }

        override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
            val imageView = holder.itemView.findViewById<ImageView>(R.id.imageView)
            imageView.setImageURI(imageUris[position])
        }

        override fun getItemCount() = imageUris.size
    }

    private fun saveProduct() {
        val name = itemTitleEditText.text.toString().trim()
        val price = itemPriceEditText.text.toString().trim()
        val description = itemDescriptionEditText.text.toString().trim()

        if (name.isEmpty() || price.isEmpty() || description.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        val databaseRef = FirebaseDatabase.getInstance().getReference("dresses").push()
        val productId = databaseRef.key

        progressDialog.show()

        val product = Product(productId, name, price, description, imageUris.map { it.toString() })
        databaseRef.setValue(product)

            .addOnSuccessListener {
                Toast.makeText(this, "Product saved successfully", Toast.LENGTH_SHORT).show()
                // Clear fields and imageUris
                itemTitleEditText.setText("")
                itemPriceEditText.setText("")
                itemDescriptionEditText.setText("")
                imageUris.clear()
                adapter.notifyDataSetChanged()
                progressDialog.dismiss()
            }
            .addOnFailureListener {
                Toast.makeText(this, "Failed to save product", Toast.LENGTH_SHORT).show()
                progressDialog.dismiss()
            }
    }
}
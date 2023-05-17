package com.example.formosafashionhub.clothesactivities

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.formosafashionhub.R
import com.example.formosafashionhub.adapters.ShirtsAdapter
import com.example.formosafashionhub.classes.Shirts
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ShirtsActivity : AppCompatActivity() {

    lateinit var shirtsList: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shirts)
        shirtsList = findViewById(R.id.mListShirts)
        var shirts:ArrayList<Shirts> = ArrayList()
        var myAdapter = ShirtsAdapter(applicationContext,shirts)
        var progress = ProgressDialog(this)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")

        //Access the table in the database

        var my_db = FirebaseDatabase.getInstance().reference.child("shirts")
        //Start retrieving data
        progress.show()
        my_db.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                //Get the data and put it on the arraylist users
                shirts.clear()
                for (snap in p0.children){
                    var shirt = snap.getValue(Shirts::class.java)
                    shirts.add(shirt!!)
                }
                //Notify the adapter that data has changed
                myAdapter.notifyDataSetChanged()
                progress.dismiss()
            }

            override fun onCancelled(p0: DatabaseError) {
                progress.dismiss()
                Toast.makeText(applicationContext,"The database is inaccessible", Toast.LENGTH_LONG).show()
            }
        })

        shirtsList.adapter = myAdapter
    }
}
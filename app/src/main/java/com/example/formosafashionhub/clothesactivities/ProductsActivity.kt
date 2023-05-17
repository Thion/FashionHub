package com.example.formosafashionhub.clothesactivities

import android.app.ProgressDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formosafashionhub.R
import com.google.firebase.database.*
import com.example.formosafashionhub.adapters.ProductsAdapter

class ProductsActivity : AppCompatActivity() {

    lateinit var database: DatabaseReference

    lateinit var adapter: ProductsAdapter
    lateinit var progressDialog: ProgressDialog
    lateinit var listProducts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)


    }
}







package com.example.formosafashionhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.formosafashionhub.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var welcomeTextView: TextView
    lateinit var categoriesCardView: CardView
    lateinit var contactUsCardView: CardView
    lateinit var signOutCardView: CardView
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeTextView = findViewById(R.id.mTvWelcome)
        categoriesCardView = findViewById(R.id.cardView_categories)
        contactUsCardView = findViewById(R.id.cardView_contactus)
        signOutCardView = findViewById(R.id.cardView_signout)

        categoriesCardView.setOnClickListener {
            val intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent)

        }
        contactUsCardView.setOnClickListener {
            val intent = Intent(this, ContactUsActivity::class.java)
            startActivity(intent)

        }
        signOutCardView.setOnClickListener {

            startActivity(Intent(this, LoginActivity::class.java))
            finish()

        }

    }
}
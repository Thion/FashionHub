package com.example.formosafashionhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.formosafashionhub.uploadactivities.DressesUploadActivity
import com.example.formosafashionhub.uploadactivities.JacketsUploadActivity
import com.example.formosafashionhub.uploadactivities.OthersUploadActivity
import com.example.formosafashionhub.uploadactivities.ShirtsUploadActivity
import com.example.formosafashionhub.uploadactivities.SportswearUploadActivity
import com.example.formosafashionhub.uploadactivities.TrousersUploadActivity

class ClothesUploadActivity : AppCompatActivity() {
    lateinit var shirtsUploadCardView: CardView
    lateinit var jacketsUploadCardView: CardView
    lateinit var trousersUploadCardView: CardView
    lateinit var sportsWearUploadCardView: CardView
    lateinit var dressesUploadCardView: CardView
    lateinit var othersUploadCardView: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothes_upload)

        shirtsUploadCardView = findViewById(R.id.cardView_shirtsupload)
        jacketsUploadCardView = findViewById(R.id.cardView_jacketsupload)
        trousersUploadCardView = findViewById(R.id.cardView_trousersupload)
        sportsWearUploadCardView = findViewById(R.id.cardView_sportswearupload)
        dressesUploadCardView = findViewById(R.id.cardView_dressesupload)
        othersUploadCardView = findViewById(R.id.cardView_othersupload)

        shirtsUploadCardView.setOnClickListener {
            val intent = Intent(this, ShirtsUploadActivity::class.java)
            startActivity(intent)
        }
        jacketsUploadCardView.setOnClickListener {
            val intent = Intent(this, JacketsUploadActivity::class.java)
            startActivity(intent)
        }
        trousersUploadCardView.setOnClickListener {
            val intent = Intent(this, TrousersUploadActivity::class.java)
            startActivity(intent)
        }
        sportsWearUploadCardView.setOnClickListener {
            val intent = Intent(this, SportswearUploadActivity::class.java)
            startActivity(intent)
        }
        dressesUploadCardView.setOnClickListener {
            val intent = Intent(this, DressesUploadActivity::class.java)
            startActivity(intent)
        }
        othersUploadCardView.setOnClickListener {
            val intent = Intent(this, OthersUploadActivity::class.java)
            startActivity(intent)
        }
    }
}
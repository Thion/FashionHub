package com.example.formosafashionhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.formosafashionhub.clothesactivities.ProductsActivity
import com.example.formosafashionhub.clothesactivities.ShirtsActivity

class CategoriesActivity : AppCompatActivity() {
    lateinit var shirtsCardView: CardView
    lateinit var jacketsCardView: CardView
    lateinit var dressesCardView: CardView
    lateinit var sportswearCardView: CardView
    lateinit var trousersCardView: CardView
    lateinit var othersCardView: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        shirtsCardView = findViewById(R.id.cardview_shirts)
        jacketsCardView = findViewById(R.id.cardview_jacket)
        dressesCardView = findViewById(R.id.cardview_dresses)
        sportswearCardView = findViewById(R.id.cardview_sportswear)
        trousersCardView = findViewById(R.id.cardview_trousers)
        othersCardView = findViewById(R.id.cardview_others)

        shirtsCardView.setOnClickListener {
            val intent = Intent(this, ShirtsActivity::class.java)
            startActivity(intent)
        }

    }
}
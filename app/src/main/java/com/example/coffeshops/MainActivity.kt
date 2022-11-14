package com.example.coffeshops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recView = findViewById<RecyclerView>(R.id.RecyclerCoffeShops)

        val shopList = arrayListOf(
            CoffeShopItem("Antico Caffè Greco", R.drawable.images, "St. Italy, Rome"),
            CoffeShopItem("Coffee Room", R.drawable.images1,"St. Germany, Berlin"),
            CoffeShopItem("Coffee Ibiza", R.drawable.images2, "St. Colon, Madrid"),
            CoffeShopItem("Pudding Coffee Shop", R.drawable.images3, "St. Diagonal, Barcelona", ),
            CoffeShopItem("L'Express", R.drawable.images4, "St. Picadilly Circus, London"),
            CoffeShopItem("Coffee Corner",R.drawable.images5, "St. Àngel Guimerà, Valencia"),
            CoffeShopItem("Sweet Cup", R.drawable.images6, "St.Kinkerstraat, Amsterdam"),
        )

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        recView.setHasFixedSize(true)
        val adapter = RecAdapter(shopList)

        recView.adapter = adapter
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
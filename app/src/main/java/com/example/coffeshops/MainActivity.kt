package com.example.coffeshops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ShopList = findViewById<RecyclerView>(R.id.RecyclerCoffeShops)

        val shopList = arrayListOf(
            CoffeShopItem("Antico Caffè Greco", R.drawable.images,  3.5f, "St. Italy, Rome"),
            CoffeShopItem("Coffee Room", R.drawable.images1, 4.5f,"St. Germany, Berlin"),
            CoffeShopItem("Coffee Ibiza", R.drawable.images2,1.5f, "St. Colon, Madrid"),
            CoffeShopItem("Pudding Coffee Shop", R.drawable.images3, 3f, "St. Diagonal, Barcelona", ),
            CoffeShopItem("L'Express", R.drawable.images4, 3f, "St. Picadilly Circus, London"),
            CoffeShopItem("Coffee Corner",R.drawable.images5, 3f, "St. Àngel Guimerà, Valencia"),
            CoffeShopItem("Sweet Cup", R.drawable.images6, 3f, "St.Kinkerstraat, Amsterdam"),
        )

        val adapter = RecAdapter(shopList)
        ShopList.adapter = adapter
        ShopList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
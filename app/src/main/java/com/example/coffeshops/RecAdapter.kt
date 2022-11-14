package com.example.coffeshops

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class CoffeShopItem(
    val title: String,
    val imgItem: Int,
    val address: String
)

class RecAdapter(var items: ArrayList<CoffeShopItem>) :
    RecyclerView.Adapter<RecAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        var shopImg: ImageView = itemView.findViewById(R.id.coffeShopImg)
        var title: TextView = itemView.findViewById(R.id.coffeShopName)
        var address: TextView = itemView.findViewById(R.id.coffeShopName2)
        val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)
        val points: TextView = itemView.findViewById(R.id.textView)

        fun bindItem(t: CoffeShopItem) = with(itemView) {
            shopImg.setImageResource(t.imgItem)
            title.text = t.title
            address.text = t.address
            ratingBar.onRatingBarChangeListener =
                RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                    points.text = rating.toString()
                }
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclercoffeshoplayout, viewGroup, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, pos: Int) {
        val itemCard = items[pos]
        viewHolder.bindItem(itemCard)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
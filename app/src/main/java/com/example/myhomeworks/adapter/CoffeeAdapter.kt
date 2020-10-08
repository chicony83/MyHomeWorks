package com.example.myhomeworks.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myhomeworks.R
import com.example.myhomeworks.dto.Coffee
import kotlinx.android.synthetic.main.item_coffee.view.*

class CoffeeAdapter (private val coffeeSet: List<Coffee>):
        RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    class CoffeeViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coffee, parent, false)
        return CoffeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coffeeSet.size
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {

        holder.itemView.coffeeName.text = coffeeSet[position].name
        Glide.with(holder.itemView.context).load(coffeeSet[position].photoURL).into(holder.itemView.coffeePhoto)

    }
}
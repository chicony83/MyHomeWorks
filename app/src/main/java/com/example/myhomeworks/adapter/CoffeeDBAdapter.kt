package com.example.myhomeworks.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myhomeworks.DataBase.Entity.Coffee
import com.example.myhomeworks.R
import kotlinx.android.synthetic.main.item_coffee_dz8.view.*

class CoffeeDBAdapter (private val coffeeDBSet:List<Coffee>):
    RecyclerView.Adapter<CoffeeDBAdapter.CoffeeDBViewHolder>(){

    class CoffeeDBViewHolder (view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeDBViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coffee_dz8,parent,false)
        return CoffeeDBViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coffeeDBSet.size
    }

    override fun onBindViewHolder(holder: CoffeeDBViewHolder, position: Int) {
        holder.itemView.textView_sort_of_coffee.text = coffeeDBSet[position].sort_name
        holder.itemView.textView_price_per_kilo.text = coffeeDBSet[position].price.toString()
        Glide.with(holder.itemView.context).load(coffeeDBSet[position].link).into(holder.itemView.imageView_coffee_url)
    }


}

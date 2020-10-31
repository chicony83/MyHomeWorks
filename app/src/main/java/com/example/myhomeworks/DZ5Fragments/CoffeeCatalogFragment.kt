package com.example.myhomeworks.DZ5Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myhomeworks.R
import com.example.myhomeworks.adapter.CoffeeAdapter
import com.example.myhomeworks.dto.coffeeDataBase
import kotlinx.android.synthetic.main.fragment_coffee_catalog.*

class CoffeeCatalogFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_coffee_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = CoffeeAdapter(coffeeDataBase.catalogCoffee)

        coffeeRecycler.adapter = adapter
        coffeeRecycler.layoutManager = LinearLayoutManager(view.context)
        coffeeRecycler.hasFixedSize()

    }



}
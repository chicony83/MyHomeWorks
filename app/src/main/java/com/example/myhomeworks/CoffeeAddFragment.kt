package com.example.myhomeworks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhomeworks.dto.Coffee
import com.example.myhomeworks.dto.coffeerSet
import kotlinx.android.synthetic.main.fragment_coffee_add.*

class CoffeeAddFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_coffee_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        addCoffeeInBD.setOnClickListener {
            coffeerSet.addInCoffeeCatalog(
                addSortCoffee.text.toString(),
                addURLCoffeePicture.text.toString()
            )
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
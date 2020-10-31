package com.example.myhomeworks.dz8Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.myhomeworks.DataBase.CoffeeDataBase
import com.example.myhomeworks.DataBase.Dao.CoffeeDao
import com.example.myhomeworks.DataBase.Db
import com.example.myhomeworks.DataBase.Entity.Coffee
import com.example.myhomeworks.DataBase.Util.launchIO
import com.example.myhomeworks.R

class DataBaseAddInBaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_base_add_in_base, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val db: CoffeeDao = Db.getDB(requireContext()).coffeeDao()

        val addInDBButton = view.findViewById<Button>(R.id.add_in_DB_button)

        val enteredSort = view.findViewById<EditText>(R.id.enteredSortOfCoffee)
        val enteredPrice = view.findViewById<EditText>(R.id.enteredPriceOfCoffee)
        val enteredURL = view.findViewById<EditText>(R.id.enteredURL)
        addInDBButton.setOnClickListener {
            if (enteredSort.text.isNotEmpty()
                and enteredPrice.text.isNotEmpty()
                and enteredURL.text.isNotEmpty()
            ) {
                val sort = enteredSort.toString()
                val price = enteredPrice.toString().toDouble()
                val url = enteredURL.toString()

                val coffee = Coffee(
                    sort_name = sort,
                    price = price,
                    link = url
                )

                launchIO {
                    db.addCoffee(coffee)
                }
            }
        }
    }
}
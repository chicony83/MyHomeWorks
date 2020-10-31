package com.example.myhomeworks.dz8Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myhomeworks.DataBase.Dao.CoffeeDao
import com.example.myhomeworks.DataBase.Entity.Coffee
import com.example.myhomeworks.DataBase.Util.launchIO
import com.example.myhomeworks.DataBase.Util.launchUI
import com.example.myhomeworks.DataBase.Db
import com.example.myhomeworks.R

import com.example.myhomeworks.adapter.CoffeeDBAdapter
import kotlinx.android.synthetic.main.fragment_data_base_catalog.*

@Suppress("UNREACHABLE_CODE")
class DataBaseCatalogFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_data_base_catalog, container, false)

        val db: CoffeeDao = Db.getDB(requireContext()).coffeeDao()

            launchIO {
                val result:List<Coffee> = db.getAllCoffee()
                launchUI {
                    val adapter = CoffeeDBAdapter(result)
                    coffeeDBRecycler.adapter = adapter
                    coffeeDBRecycler.layoutManager = LinearLayoutManager(view?.context)
                    coffeeDBRecycler.hasFixedSize()
                }
            }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}
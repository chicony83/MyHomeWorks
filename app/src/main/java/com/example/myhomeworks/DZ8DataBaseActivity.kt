package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.myhomeworks.dz8Fragments.DataBaseAddInBaseFragment
import com.example.myhomeworks.dz8Fragments.DataBaseCatalogFragment
import com.example.myhomeworks.dz8Fragments.DataBaseSettingsFragment

class DZ8DataBaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_8_data_base)

        val addInDataBaseButton = findViewById<Button>(R.id.to_fragment_add_in_data_base_button)
        val coffeeDataBaseCatalogButton = findViewById<Button>(R.id.coffee_data_base_catalog_button)
        val settingsDataBaseButton = findViewById<ImageButton>(R.id.settings_data_base_button)


        val dataBaseAddInBaseFragment = DataBaseAddInBaseFragment()
        val dataBaseCatalogFragment = DataBaseCatalogFragment()
        val dataBaseSettingsFragment = DataBaseSettingsFragment()

        fragmentManagerTransaction(dataBaseCatalogFragment)

        buttonListeners(addInDataBaseButton, dataBaseAddInBaseFragment)
        buttonListeners(coffeeDataBaseCatalogButton, dataBaseCatalogFragment)
        imageButtonListeners(settingsDataBaseButton,dataBaseSettingsFragment)
    }

    private fun buttonListeners(
        button: Button,
        fragment: Fragment
    ) {
        button.setOnClickListener {
            fragmentManagerTransaction(fragment)
        }
    }

    private fun imageButtonListeners(
        imageButton:ImageButton,
        fragment: Fragment
    ){
        imageButton.setOnClickListener {
            fragmentManagerTransaction(fragment)
        }
    }

    private fun fragmentManagerTransaction(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.parent_fragment_DataBase, fragment)
            .commit()
    }
}
package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DZ8DataBaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_8_data_base)

        val dataBaseMainFragment = DataBaseMainFragment()
        val  dataBaseAddInBaseFragment = DataBaseAddInBaseFragment()

        supportFragmentManager.beginTransaction().replace(R.id.perent_fragment_DataBase, dataBaseMainFragment).commit()
    }
}
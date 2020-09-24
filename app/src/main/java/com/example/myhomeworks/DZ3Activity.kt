package com.example.myhomeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_d_z3.*

class DZ3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_z3)
        buttonFlags.setOnClickListener{
            val intent = Intent(this,FlagsActivity::class.java)
            startActivity(intent)
        }
        buttonAnimation.setOnClickListener{
            val intent = Intent(this,AnimationActivity::class.java)
            startActivity(intent)
        }
    }
}
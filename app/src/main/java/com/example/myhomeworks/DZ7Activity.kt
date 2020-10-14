package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class DZ7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_7)

        val dZ7SplashFragment = DZ7SplashFragment()
        val dZ7CardFragment = DZ7CardFragment()

        supportFragmentManager.beginTransaction().add(R.id.fragment_layout,dZ7SplashFragment).commit()

//        supportFragmentManager.beginTransaction().replace(R.id.fragment_layout, dZ7SplashFragment).commit()
//        button_start_anim_congratulation.setOnClickListener {
//            YoYo.with(Techniques.FadeOutUp)
//                .duration(1000)
//                .playOn(button_start_anim_congratulation)
//            YoYo.with(Techniques.FadeOutDown)
//                .duration(1000)
//                .onEnd{
//                    nextFrame()
//                }
//                .playOn(text_on_button_start_anim_congratulation)
//
//
//        }
    }

    private fun nextFrame() {

    }
}
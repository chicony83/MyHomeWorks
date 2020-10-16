package com.example.myhomeworks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.fragment_dz_7_splash.*
import androidx.fragment.app.FragmentManager as FragmentManager

class DZ7SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dz_7_splash, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button_start_anim_congratulation.setOnClickListener {
            YoYo.with(Techniques.FadeOutUp)
                .duration(1000)
                .playOn(button_start_anim_congratulation)
            YoYo.with(Techniques.FadeOutDown)
                .duration(1000)
                .onEnd {
                    nextFrame()
                }
                .playOn(text_on_button_start_anim_congratulation)
        }
    }

    private fun nextFrame() {
        val dZ7CardFragment = DZ7CardFragment()
        activity
            ?.supportFragmentManager
            ?.beginTransaction()
            ?.setCustomAnimations(R.anim.enter,R.anim.exit)
            ?.replace(R.id.fragment_layout, dZ7CardFragment)
            ?.commit()
    }
}
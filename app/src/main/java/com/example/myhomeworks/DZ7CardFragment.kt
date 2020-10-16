package com.example.myhomeworks

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.fragment_dz_7_card.*

class DZ7CardFragment : Fragment() {

    private val time = 2000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dz_7_card, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bear_massage.visibility = View.INVISIBLE
        super.onViewCreated(view, savedInstanceState)
        button_bear.setOnClickListener {
            YoYo.with(Techniques.Pulse)
                .duration(time.toLong())
                .playOn(button_bear)

            bear_massage.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeIn)
                .duration(time.toLong())
                .onEnd { fadeOut()}
                .playOn(bear_massage)
        }
        button_grass.setOnClickListener{
            YoYo.with(Techniques.RubberBand)
                .duration(1000)
                .playOn(button_grass)
            YoYo.with(Techniques.Tada)
                .duration(1000)
                .playOn(button_bear)
        }
    }

    private fun fadeOut() {
        YoYo.with(Techniques.FadeOut)
            .duration(time.toLong())
            .playOn(bear_massage)
    }
}
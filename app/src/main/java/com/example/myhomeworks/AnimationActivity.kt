package com.example.myhomeworks

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation.*


class AnimationActivity : AppCompatActivity() {
    private var mAnimationDrawable: AnimationDrawable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        var animation = imageView_catAnimation
        animation.setBackgroundResource(R.drawable.anim)
        mAnimationDrawable = imageView_catAnimation.background as AnimationDrawable
        mAnimationDrawable!!.start()
    }
}
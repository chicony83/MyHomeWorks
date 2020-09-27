package com.example.myhomeworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dz_1.*
import com.squareup.picasso.Picasso

class DZ1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz_1)

        button_load_img.setOnClickListener{showIMG()}
    }

    private fun showIMG(){

        if(url_img.text.isEmpty()){
            url_img.setText(R.string.valid_url)
        }
        Picasso.with(this).load(url_img.text.toString()).into(imageView)
    }
}
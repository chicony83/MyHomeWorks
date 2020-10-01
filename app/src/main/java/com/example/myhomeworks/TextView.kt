package com.example.myhomeworks

import kotlinx.android.synthetic.main.activity_dz_4_harvesting.*

class TextView : DZ4HarvestingAktivity() {

    var company1_potato:Int? = textView_company1_potato.text.toString().toInt()
    var company1_wheat:Int? = textView_company1_wheat.text.toString().toInt()
    var company1_corn :Int?= textView_company1_corn.text.toString().toInt()

    var company2_potato:Int? = textView_company2_potato.text.toString().toInt()
    var company2_wheat:Int? = textView_company2_wheat.text.toString().toInt()
    var company2_corn:Int? = textView_company2_corn.text.toString().toInt()

    var company3_potato:Int? = textView_company3_potato.text.toString().toInt()
    var company3_wheat:Int? = textView_company3_wheat.text.toString().toInt()
    var company3_corn:Int? = textView_company3_corn.text.toString().toInt()

}
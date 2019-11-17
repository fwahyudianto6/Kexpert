package com.fwahyudianto.kexpert.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.fwahyudianto.kexpert.R
import com.fwahyudianto.kexpert.businesslogiclayer.Person

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class IntentMoveObjectActivity : AppCompatActivity() {
    // Declaration Variable/Object
    companion object {
        const val oExtraPerson = "extra_person"
    }

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_move_object)
        this.title = "Intent - Move Activity With Object"

        val tvDataReceived: TextView = findViewById(R.id.tv_moveactivityobject)
        val oPerson = intent.getParcelableExtra(oExtraPerson) as Person
        val oResult = "Developer Name \t: \t" + oPerson.vPersonName.toString() +
                "\nAge  \t\t\t\t\t\t: \t" + oPerson.vPersonAge.toString() +
                "\nEmail  \t\t\t\t\t: \t" + oPerson.vEmail.toString() +
                "\nCity \t\t\t\t\t\t: \t" + oPerson.vCity.toString()
        tvDataReceived.text = oResult
    }
}
package com.fwahyudianto.kexpert.intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class IntentMoveDataActivity : AppCompatActivity() {
    // Declaration Variable/Object
    companion object {
        const val strExtraName = "extra_name"
        const val strExtraNik = "extra_nik"
        const val strExtraAge = "extra_age"
    }

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_move_data)
        this.title = "Intent - Move Activity With Data"

        val tvDataReceived: TextView = findViewById(R.id.tv_moveactivitydata)
        val strName = intent.getStringExtra(strExtraName)
        val strNik = intent.getStringExtra(strExtraNik)
        val iAge = intent.getIntExtra(strExtraAge, 0)

        val strResult = "Name \t: \t" + strName +
                "\nNIK  \t\t: \t" + strNik +
                "\nAge \t\t: \t" + iAge
        tvDataReceived.text = strResult
    }
}

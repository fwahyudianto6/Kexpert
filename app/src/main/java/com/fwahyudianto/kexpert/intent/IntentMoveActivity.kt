package com.fwahyudianto.kexpert.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class IntentMoveActivity : AppCompatActivity() {

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_move)
        this.title = "Intent - Move Activity"
    }
}
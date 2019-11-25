package com.fwahyudianto.kexpert.debugging

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class MainDebuggingActivity : AppCompatActivity() {
    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_debugging)
        this.title = "Debugging Module"
    }
}
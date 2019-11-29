package com.fwahyudianto.kexpert.debugging

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class MainDebuggingActivity : AppCompatActivity(), View.OnClickListener {
    // Declaration Variable/Object
    private lateinit var btnDebugAlpha: Button

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_debugging)
        this.title = "Debugging Module"

        btnDebugAlpha = findViewById(R.id.main_debugging_btn_debug_alpha)
        btnDebugAlpha.setOnClickListener(this)
    }

    // Implement Interface - onClick(OnClickListener)
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.main_debugging_btn_debug_alpha -> {
                val iAlpha = Intent(this@MainDebuggingActivity, DebuggingAlphaActivity::class.java)
                startActivity(iAlpha)
            }
        }
    }
}
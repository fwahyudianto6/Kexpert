package com.fwahyudianto.kexpert.list

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

class MainListActivity : AppCompatActivity(), View.OnClickListener {
    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)
        this.title = "List Module"

        val btnArray: Button = findViewById(R.id.main_list_btn_array_adapter)
        btnArray.setOnClickListener(this)
    }

    // Implement Interface - onClick(OnClickListener)
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.main_list_btn_array_adapter -> {
                val iArray = Intent(this@MainListActivity, ListArrayAdapterActivity::class.java)
                startActivity(iArray)
            }
        }
    }
}
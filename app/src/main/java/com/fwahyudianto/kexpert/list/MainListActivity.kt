package com.fwahyudianto.kexpert.list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class MainListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)
        this.title = "List Module"
    }
}
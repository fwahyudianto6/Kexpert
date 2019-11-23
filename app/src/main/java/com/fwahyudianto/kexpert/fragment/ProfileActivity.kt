package com.fwahyudianto.kexpert.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class ProfileActivity : AppCompatActivity() {
    // Declaration Variable/Object
    companion object {
        var STR_PROFILE_NAME = "extra_profile_name"
    }

    lateinit var tvProfileName: TextView

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        this.title = intent.getStringExtra(STR_PROFILE_NAME) + "'s Profile"

        tvProfileName = findViewById(R.id.profile_fm_tv_dtl_category_title)
        tvProfileName.text = intent.getStringExtra(STR_PROFILE_NAME)
    }
}
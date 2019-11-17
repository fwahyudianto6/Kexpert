package com.fwahyudianto.kexpert

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.fwahyudianto.kexpert.fragment.MainFragmentActivity
import com.fwahyudianto.kexpert.intent.MainIntentActivity
import com.fwahyudianto.kexpert.volume.MainVolumeActivity

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVolume: Button = findViewById(R.id.main_btn_volume)
        btnVolume.setOnClickListener(this)

        val btnIntent: Button = findViewById(R.id.main_btn_intent)
        btnIntent.setOnClickListener(this)

        val btnFragment: Button = findViewById(R.id.main_btn_fragment)
        btnFragment.setOnClickListener(this)
    }

    // Implement Interface
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.main_btn_volume -> {
                val iBarVolume = Intent(this@MainActivity, MainVolumeActivity::class.java)
                startActivity(iBarVolume)
            }
            R.id.main_btn_intent -> {
                val iIntent = Intent(this@MainActivity, MainIntentActivity::class.java)
                startActivity(iIntent)
            }
            R.id.main_btn_fragment -> {
                val iFragment = Intent(this@MainActivity, MainFragmentActivity::class.java)
                startActivity(iFragment)
            }
        }
    }
}
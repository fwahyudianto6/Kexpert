package com.fwahyudianto.kexpert.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class MainFragmentActivity : AppCompatActivity() {
    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)
        this.title = "Fragment Module"

        val m_FragmentManager = supportFragmentManager
        val m_MainFragment = MainFragment()
        val ofragment = m_FragmentManager.findFragmentByTag(MainFragment::class.java.simpleName)

        if (ofragment !is MainFragment) {
            Log.d("MainFragment", "Fragment Name :" + MainFragment::class.java.simpleName)
            m_FragmentManager
                .beginTransaction()
                .add(R.id.frame_container, m_MainFragment, MainFragment::class.java.simpleName)
                .commit()
        }
    }
}
package com.fwahyudianto.kexpert.debugging

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.fwahyudianto.kexpert.R
import java.lang.StringBuilder

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class DebuggingAlphaActivity : AppCompatActivity(), View.OnClickListener {
    // Declaration Variable/Object
    private lateinit var tvResult: TextView
    private lateinit var btnSetValue: Button
    private lateinit var imgPreview: ImageView

    private var m_strNames = ArrayList<String>()

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debugging_alpha)
        this.title = "Debugging - #1"

        /*
            Error List
            ============================================================================================================
            Caused by:
                kotlin.UninitializedPropertyAccessException: lateinit property btnSetValue has not been initialized
            Solution:
                btnSetValue = findViewById(R.id.alpha_dbg_btn_set_value)
            ------------------------------------------------------------------------------------------------------------
            Caused by:
                java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
            Solution:
                for (i in 0..2) {
                    strName.append(m_strNames[i]).append("\n")
                }
            ------------------------------------------------------------------------------------------------------------
            Caused by:
                java.lang.OutOfMemoryError: Failed to allocate a 413249340 byte allocation with 1613482 free bytes and 253MB until OOM
            Solution:

         */

        tvResult = findViewById(R.id.alpha_dbg_tv_result)
        btnSetValue = findViewById(R.id.alpha_dbg_btn_set_value)
        imgPreview = findViewById(R.id.alpha_dbg_img_preview)

        btnSetValue.setOnClickListener(this)
//        imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big))
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview)

        m_strNames.add("Alpha")
        m_strNames.add("Beta")
        m_strNames.add("Charlie")
    }

    // Implement Interface - onClick(OnClickListener)
    override fun onClick(v: View?) {
        if (v?.id == R.id.alpha_dbg_btn_set_value) {
//            tvResult.text = "6"
            val strName = StringBuilder()
            for (i in 0..3) {
                strName.append(m_strNames[i]).append("\n")
            }

            tvResult.text = strName.toString()
        }
    }
}
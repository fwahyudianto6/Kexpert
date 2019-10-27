package com.fwahyudianto.kexpert.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class MainIntentActivity : AppCompatActivity(), View.OnClickListener {

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_intent)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveDataActivity: Button = findViewById(R.id.btn_move_activitydata)
        btnMoveDataActivity.setOnClickListener(this)
    }

    // Implement Interface
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val iIntentMove = Intent(this@MainIntentActivity, IntentMoveActivity::class.java)
                startActivity(iIntentMove)
            }
            R.id.btn_move_activitydata -> {
                val iIntentMoveData = Intent(this@MainIntentActivity, IntentMoveDataActivity::class.java)
                //  Set Value to Send Other Activity
                iIntentMoveData.putExtra(IntentMoveDataActivity.strExtraName, "Fajar Wahyudianto")
                iIntentMoveData.putExtra(IntentMoveDataActivity.strExtraNik, "3302262511920001")
                iIntentMoveData.putExtra(IntentMoveDataActivity.strExtraAge, 27)
                startActivity(iIntentMoveData)
            }
        }
    }
}

package com.fwahyudianto.kexpert.intent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.fwahyudianto.kexpert.R
import com.fwahyudianto.kexpert.businesslogiclayer.Person

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

        val btnMoveObjectActivity: Button = findViewById(R.id.btn_moveactivityobject)
        btnMoveObjectActivity.setOnClickListener(this)

        val btnDialNumber: Button = findViewById(R.id.btn_dialnumber)
        btnDialNumber.setOnClickListener(this)
    }

    // Implement Interface
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val iIntentMove = Intent(this@MainIntentActivity, IntentMoveActivity::class.java)
                //  start Activity
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
            R.id.btn_moveactivityobject -> {
                //  Set Value on Person Object
                val oDeveloper = Person(
                    "Fajar Wahyudianto",
                    27,
                    "fwahyudi06@gmail.com",
                    "Bekasi"
                )
                val iIntentMoveObject = Intent(this@MainIntentActivity, IntentMoveObjectActivity::class.java)
                //  Set Value to Send Other Activity
                iIntentMoveObject.putExtra(IntentMoveObjectActivity.oExtraPerson, oDeveloper)
                startActivity(iIntentMoveObject)
            }
            R.id.btn_dialnumber -> {
                val valPhoneNumber = "085747117005"
                val valDialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$valPhoneNumber"))
                startActivity(valDialPhoneIntent)
            }
        }
    }
}

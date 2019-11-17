package com.fwahyudianto.kexpert.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class IntentMoveResultActivity : AppCompatActivity(), View.OnClickListener {
    // Declaration Variable/Object
    private lateinit var btnChoose: Button
    private lateinit var rdgNumber: RadioGroup
    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE = 110
    }

    //  Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_move_result)
        this.title = "Intent - Move Activity With Result"

        //  Set Variable
        btnChoose = findViewById(R.id.btn_result_choose)
        rdgNumber = findViewById(R.id.rdg_result_number)

        btnChoose.setOnClickListener(this)
    }

    // Implement Interface
    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_result_choose) {
            if (rdgNumber.checkedRadioButtonId != 0) {
                var value = 0
                when (rdgNumber.checkedRadioButtonId) {
                    R.id.rb_result_50 -> value = 50
                    R.id.rb_result_100 -> value = 100
                    R.id.rb_result_150 -> value = 150
                    R.id.rb_result_200 -> value = 200
                }
                val valResult = Intent()
                valResult.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, valResult)
                finish()
            }
        }
    }
}
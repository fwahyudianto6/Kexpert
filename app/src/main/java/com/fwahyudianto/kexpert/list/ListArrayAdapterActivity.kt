package com.fwahyudianto.kexpert.list

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class ListArrayAdapterActivity : AppCompatActivity() {
    // Declaration Variable/Object
    private val arPlayerName = arrayOf(
        "GK - Dida", "CB - Nesta", "CB - Maldini", "LB - Cafu", "RB - Serginho",
        "CMF - Pirlo", "RMF - Gattuso", "LMF - Seedorf", "AMF - Rui Costa",
        "CF - Shevchenko", "CF - Inzaghi"
    )

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_array_adapter)
        this.title = "List - Array Adapter"

        val lsPlayer: ListView = findViewById(R.id.array_list_lv_list)
        val oArrayAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            arPlayerName
        )
        lsPlayer.adapter = oArrayAdapter
    }
}
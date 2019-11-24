package com.fwahyudianto.kexpert.list

import android.content.res.TypedArray
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.fwahyudianto.kexpert.R
import com.fwahyudianto.kexpert.businesslogiclayer.Player
import com.fwahyudianto.kexpert.controllers.PlayerAdapter

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class ListCustomAdapterActivity : AppCompatActivity() {
    // Declaration Variable/Object
    private lateinit var m_oPlayerAdapter: PlayerAdapter
    private lateinit var strPlayerName: Array<String>
    private lateinit var strPlayerDescription: Array<String>
    private lateinit var iPlayerPhoto: TypedArray
    private var oPlayers = arrayListOf<Player>()

    // Method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_custom_adapter)
        this.title = "List - Custom Adapter"

        val oPlayerList: ListView = findViewById(R.id.custom_list_lv_list)
        m_oPlayerAdapter = PlayerAdapter(this)
        oPlayerList.adapter = m_oPlayerAdapter

        prepare()
        addItem()

        oPlayerList.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this@ListCustomAdapterActivity, oPlayers[position].m_strPlayerName, Toast.LENGTH_SHORT).show()
        }
    }

    // Create function prepare(madebyOwner)
    private fun prepare() {
        strPlayerName = resources.getStringArray(R.array.data_playar_name)
        strPlayerDescription = resources.getStringArray(R.array.data_player_description)
        iPlayerPhoto = resources.obtainTypedArray(R.array.data_player_photo)
    }

    // Create function addItem(madebyOwner)
    private fun addItem() {
        for (iIndex in strPlayerName.indices) {
            val oPlayer = Player(
                iPlayerPhoto.getResourceId(iIndex, -1),
                strPlayerName[iIndex],
                strPlayerDescription[iIndex]
            )
            oPlayers.add(oPlayer)
        }
        m_oPlayerAdapter.oAcMilanPlayer = oPlayers
    }
}
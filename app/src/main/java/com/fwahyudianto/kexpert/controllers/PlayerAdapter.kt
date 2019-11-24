package com.fwahyudianto.kexpert.controllers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.fwahyudianto.kexpert.R
import com.fwahyudianto.kexpert.businesslogiclayer.Player

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class PlayerAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var oAcMilanPlayer = arrayListOf<Player>()

    // Implement - getItem(BaseAdapter)
    override fun getItem(iPosition: Int): Any {
        return oAcMilanPlayer[iPosition]
    }

    // Implement - getItemId(BaseAdapter)
    override fun getItemId(iPosition: Int): Long {
        return iPosition.toLong()
    }

    // Implement - getCount(BaseAdapter)
    override fun getCount(): Int {
        return oAcMilanPlayer.size
    }

    /*
        Shortcut
        -------------------------------------------------------------------------
        override fun getCount(): Int = oAcMilanPlayer.size
        override fun getItem(iPosition: Int): Any = oAcMilanPlayer[iPosition]
        override fun getItemId(iPosition: Int): Long = iPosition.toLong()
    */


    // Implement - getView(BaseAdapter)
    override fun getView(iPosition: Int, convertView: View?, parent: ViewGroup?): View? {
        var oView = convertView
        if (oView == null) {
            oView = LayoutInflater.from(context).inflate(R.layout.activity_list_custom_item, parent, false)
        }

        val oViewHolder = ViewHolder(oView as View)
        val player = getItem(iPosition) as Player

        oViewHolder.bind(player)

        return oView
    }

    private inner class ViewHolder internal constructor(view: View) {
        private val strPlayerName: TextView = view.findViewById(R.id.custom_list_tv_playar_name)
        private val strPlayerDescription: TextView = view.findViewById(R.id.custom_list_tv_playar_description)
        private val imgPlayerPhoto: ImageView = view.findViewById(R.id.custom_list_img_playar_photo)

        internal fun bind(p_strPlayer: Player) {
            strPlayerName.text = p_strPlayer.m_strPlayerName
            strPlayerDescription.text = p_strPlayer.m_strDescription
            imgPlayerPhoto.setImageResource(p_strPlayer.m_iPhoto)
        }
    }
}
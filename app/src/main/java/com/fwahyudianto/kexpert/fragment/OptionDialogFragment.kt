package com.fwahyudianto.kexpert.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class OptionDialogFragment : DialogFragment(), View.OnClickListener {
    // Declaration Variable/Object
    private lateinit var btnChoose: Button
    private lateinit var btnClose: Button
    private lateinit var rgOptions: RadioGroup
    private lateinit var rbKilpin: RadioButton
    private lateinit var rbSacchi: RadioButton
    private lateinit var rbAncelotti: RadioButton
    private lateinit var rbCapello: RadioButton
    private lateinit var rbRocco: RadioButton
    private var optionDialogListener: OnOptionDialogListener? = null

    // Method onCreateView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog, container, false)
    }

    // Implement Interface - onViewCreated(Fragment)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnChoose = view.findViewById(R.id.dialog_fm_btn_choose)
        btnClose = view.findViewById(R.id.dialog_fm_btn_close)

        rgOptions = view.findViewById(R.id.dialog_fm_rdg_options)
        rbKilpin = view.findViewById(R.id.dialog_fm_rb_kilpin)
        rbSacchi = view.findViewById(R.id.dialog_fm_rb_sacchi)
        rbAncelotti = view.findViewById(R.id.dialog_fm_rb_ancelotti)
        rbCapello = view.findViewById(R.id.dialog_fm_rb_capello)
        rbRocco = view.findViewById(R.id.dialog_fm_rb_rocco)

        btnChoose.setOnClickListener(this)
        btnClose.setOnClickListener(this)
    }

    // Implement Interface - onClick(OnClickListener)
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.dialog_fm_btn_close -> dialog?.cancel()
            R.id.dialog_fm_btn_choose -> {
                val checkedRadioButtonId = rgOptions.checkedRadioButtonId
                if (checkedRadioButtonId != -1) {
                    var strCoachName: String? = null
                    when (checkedRadioButtonId) {
                        R.id.dialog_fm_rb_kilpin -> strCoachName = rbKilpin.text.toString().trim()
                        R.id.dialog_fm_rb_sacchi -> strCoachName = rbSacchi.text.toString().trim()
                        R.id.dialog_fm_rb_ancelotti -> strCoachName = rbAncelotti.text.toString().trim()
                        R.id.dialog_fm_rb_capello -> strCoachName = rbCapello.text.toString().trim()
                        R.id.dialog_fm_rb_rocco -> strCoachName = rbRocco.text.toString().trim()
                    }
                    if (optionDialogListener != null) {
                        optionDialogListener?.onOptionChosen(strCoachName)
                    }
                    dialog?.dismiss()
                }
            }
        }
    }

    // Implement Interface - onAttach()
    override fun onAttach(context: Context) {
        super.onAttach(context)
        val fragment = parentFragment
        if (fragment is DetailCategoryFragment) {
            val detailCategoryFragment = fragment as DetailCategoryFragment?
            this.optionDialogListener = detailCategoryFragment?.optionDialogListener
        }
    }

    // Implement Interface - onDetach()
    override fun onDetach() {
        super.onDetach()
        this.optionDialogListener = null
    }

    // Create Interface - OnOptionDialogListener()
    interface OnOptionDialogListener {
        fun onOptionChosen(text: String?)
    }
}
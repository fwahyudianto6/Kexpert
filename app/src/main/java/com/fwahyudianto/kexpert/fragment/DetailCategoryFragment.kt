package com.fwahyudianto.kexpert.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class DetailCategoryFragment : Fragment(), View.OnClickListener {
    // Declaration Variable/Object
    var strDescription: String? = null

    companion object {
        var STR_EXTRA_NAME = "extra_name"
        var STR_EXTRA_DESCRIPTION = "extra_description"
    }

    lateinit var tvDetailCategoryName: TextView
    lateinit var tvDetailCategoryDescription: TextView
    lateinit var btnProfile: Button
    lateinit var btnDialog: Button

    //  Method onCreateView(Fragment)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }

    // Implement Interface - onViewCreated(Fragment)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvDetailCategoryName = view.findViewById(R.id.dtl_category_fm_tv_category_title)
        tvDetailCategoryDescription = view.findViewById(R.id.dtl_category_fm_tv_category_description)
        btnProfile = view.findViewById(R.id.dtl_category_fm_btn_profile)
        btnDialog = view.findViewById(R.id.dtl_category_fm_btn_dialog)

        btnProfile.setOnClickListener(this)
        btnDialog.setOnClickListener(this)
    }

    // Implement Interface - onClick(OnClickListener)
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.dtl_category_fm_btn_profile -> {
                val iDetailProfile = Intent(activity, ProfileActivity::class.java)
                iDetailProfile.putExtra(ProfileActivity.STR_PROFILE_NAME, tvDetailCategoryName.text)
                startActivity(iDetailProfile)
            }
            R.id.dtl_category_fm_btn_dialog -> {
                val m_OptionDialogFragment = OptionDialogFragment()
                val m_FragmentManager = childFragmentManager
                m_OptionDialogFragment.show(m_FragmentManager, OptionDialogFragment::class.java.simpleName)
            }
        }
    }

    // Implement Interface - onActivityCreated(Fragment)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (savedInstanceState != null) {
            val alDescriptionFromBundle = savedInstanceState.getString(STR_EXTRA_DESCRIPTION)
            strDescription = alDescriptionFromBundle
        }

        if (arguments != null) {
            val alCategoryName = arguments?.getString(STR_EXTRA_NAME)
            tvDetailCategoryName.text = alCategoryName
            tvDetailCategoryDescription.text = strDescription
        }
    }

    internal var optionDialogListener: OptionDialogFragment.OnOptionDialogListener =
        object : OptionDialogFragment.OnOptionDialogListener {
            override fun onOptionChosen(text: String?) {
                Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()
            }
        }
}

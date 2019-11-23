package com.fwahyudianto.kexpert.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.fwahyudianto.kexpert.R

/**
 *  This software, all associated documentation, and all copies are CONFIDENTIAL INFORMATION of Kalpawreska Teknologi Indonesia
 *  http://www.fwahyudianto.id
 *  ® Wahyudianto, Fajar
 *  Email 	: fwahyudi06@gmail.com
 */

class CategoryFragment : Fragment(), View.OnClickListener {
    // Method onCreateView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    // Implement Interface - onViewCreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPopular: Button = view.findViewById(R.id.category_fm_btn_popular_brands)
        val btnLuxe: Button = view.findViewById(R.id.category_fm_btn_kalpa_luxe)
        val btnLifstyle: Button = view.findViewById(R.id.category_fm_btn_lifestyle)

        btnPopular.setOnClickListener(this)
        btnLuxe.setOnClickListener(this)
        btnLifstyle.setOnClickListener(this)
    }

    // Implement Interface - onClick(OnClickListener)
    override fun onClick(v: View?) {
        // Declaration Detail Object
        val m_oDetailCategoryFragment = DetailCategoryFragment()
        val m_Bundle = Bundle()
        val m_FragmentManager = fragmentManager as FragmentManager

        if (v?.id == R.id.category_fm_btn_popular_brands) {
            m_Bundle.putString(DetailCategoryFragment.STR_EXTRA_NAME, "Popular Brands")
            val alDescription =
                "Popular Brands - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec volutpat nunc enim, ac viverra ante consectetur vulputate. Vestibulum nec volutpat libero. Nullam eu auctor metus. Pellentesque non libero aliquam, vehicula elit non, auctor nisi. Nam tristique suscipit gravida. Donec lorem arcu, lobortis id arcu vel, dictum placerat nibh. Nam ut."

            // Set Value
            m_oDetailCategoryFragment.arguments = m_Bundle
            m_oDetailCategoryFragment.strDescription = alDescription

            m_FragmentManager
                .beginTransaction()
                .replace(R.id.frame_container, m_oDetailCategoryFragment, DetailCategoryFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
        else if (v?.id == R.id.category_fm_btn_kalpa_luxe) {
            m_Bundle.putString(DetailCategoryFragment.STR_EXTRA_NAME, "Kalpa Luxe")
            val alDescription =
                "Kalpa Luxe - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec volutpat nunc enim, ac viverra ante consectetur vulputate. Vestibulum nec volutpat libero. Nullam eu auctor metus. Pellentesque non libero aliquam, vehicula elit non, auctor nisi. Nam tristique suscipit gravida. Donec lorem arcu, lobortis id arcu vel, dictum placerat nibh. Nam ut."

            // Set Value
            m_oDetailCategoryFragment.arguments = m_Bundle
            m_oDetailCategoryFragment.strDescription = alDescription


            m_FragmentManager
                .beginTransaction()
                .replace(R.id.frame_container, m_oDetailCategoryFragment, DetailCategoryFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
        else if (v?.id == R.id.category_fm_btn_lifestyle) {
            m_Bundle.putString(DetailCategoryFragment.STR_EXTRA_NAME, "Lifestyle")
            val alDescription =
                "Lifestyle - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec volutpat nunc enim, ac viverra ante consectetur vulputate. Vestibulum nec volutpat libero. Nullam eu auctor metus. Pellentesque non libero aliquam, vehicula elit non, auctor nisi. Nam tristique suscipit gravida. Donec lorem arcu, lobortis id arcu vel, dictum placerat nibh. Nam ut."

            // Set Value
            m_oDetailCategoryFragment.arguments = m_Bundle
            m_oDetailCategoryFragment.strDescription = alDescription


            m_FragmentManager
                .beginTransaction()
                .replace(R.id.frame_container, m_oDetailCategoryFragment, DetailCategoryFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }
}

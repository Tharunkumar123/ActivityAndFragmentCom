package com.example.activityandfragmentcom.views.activity_to_fragment

import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_layout_af.*

open class FragmentAF : BaseFragment() {
    override fun setLayout(): Int {
        return R.layout.fragment_layout_af
    }

    override fun initView(savedInstanceState: Bundle?) {
        val data: String = this.arguments?.getString("activityData").toString()
        fragmentEditText.setText(data)
    }

//    fun getDataFromActivity(message:String?) {
//        fragmentEditText.setText(message)
//
//    }
}
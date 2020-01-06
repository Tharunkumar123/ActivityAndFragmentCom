package com.example.activityandfragmentcom.views.activity_to_fragment

import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseActivity
import kotlinx.android.synthetic.main.activity_to_fragment.*


class ActivityToFragment : BaseActivity() {
 lateinit var fragmentFirst:FragmentAF
    override fun setLayout(): Int {
        return R.layout.activity_to_fragment
    }

    override fun initView(savedInstanceState: Bundle?) {

        sendBtnActivity.setOnClickListener {

//            fragmentFirst.getDataFromActivity( passActivityData.text.toString())
            sendDataToFragment()
        }
    }

    private fun sendDataToFragment() {
        val bundle = Bundle()
        val data= passActivityData.text.toString()
        bundle.putString("activityData",data)
        fragmentFirst  = FragmentAF()
        fragmentFirst.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.loadsFragment,fragmentFirst).commit()



        passActivityData.setText("")


    }
}
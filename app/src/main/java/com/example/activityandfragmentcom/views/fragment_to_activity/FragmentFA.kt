package com.example.activityandfragmentcom.views.fragment_to_activity


import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_layout_fa.*

class FragmentFA : BaseFragment() {

    override fun setLayout(): Int {
        return R.layout.fragment_layout_fa
    }

    override fun initView(savedInstanceState: Bundle?) {
//        fragmentEditTextFA
        clickListener()

        (activity )
    }

  private fun clickListener() {
        btnFragFA.setOnClickListener {
            val editTextData = fragmentEditTextFA.text.toString()
            if(activity is SendDataToActivity){
                (activity as SendDataToActivity).sendData(editTextData)
            }
            fragmentEditTextFA.setText("")
        }
    }


    interface SendDataToActivity {
        fun sendData(message: String)
    }
}
package com.example.activityandfragmentcom.views.fragmenttofragment

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_reply.*

class FragmentToFragmentReply : BaseFragment() {

    override fun setLayout(): Int {
        return R.layout.fragment_reply
    }

    override fun initView(savedInstanceState: Bundle?) {
        clickListener()
        getBundleData()

    }

    private fun getBundleData() {
        val data: String = this.arguments?.getString("sendingDataToFragmentReply").toString()
        sendDataReceivedScreen.text = data
    }

    private fun clickListener() {
        replyBtnFF.setOnClickListener {
            val editTextInputFromReply = replyDataFF.text.toString()
            val fragmentSend = FragmentToFragmentSend()
            val bundle = Bundle()
            bundle.putString("sendingDataToFragmentSend", editTextInputFromReply)
            fragmentSend.arguments = bundle
            val fm = activity?.supportFragmentManager
            fm?.beginTransaction()
                ?.replace(R.id.fragmentToFragmentContainer, fragmentSend)
                ?.addToBackStack(null)
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                ?.commit()
        }
    }
}
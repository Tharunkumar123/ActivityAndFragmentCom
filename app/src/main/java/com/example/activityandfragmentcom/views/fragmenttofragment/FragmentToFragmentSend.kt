package com.example.activityandfragmentcom.views.fragmenttofragment


import android.os.Bundle
import android.view.View
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_send.*

class FragmentToFragmentSend : BaseFragment() {

    override fun setLayout(): Int {
        return R.layout.fragment_send
    }

    override fun initView(savedInstanceState: Bundle?) {
        clickListener()
        getBundleData()
    }

    private fun getBundleData() {
        val data: String? = this.arguments?.getString("sendingDataToFragmentSend").toString()
        if (data.isNullOrEmpty()) {
            replyDataReceivedScreen.visibility = View.GONE
            replyReceivedTxtFF.visibility = View.GONE
        } else {
            replyDataReceivedScreen.text = data
            replyReceivedTxtFF.visibility = View.VISIBLE
        }
    }

    private fun clickListener() {
        sendBtnFF.setOnClickListener {
            val fm = activity?.supportFragmentManager
            val fragmentReply = FragmentToFragmentReply()
            val bundle = Bundle()
            val editTextInputFromSend = sendDataFF.text.toString()
            bundle.putString("sendingDataToFragmentReply", editTextInputFromSend)
            fragmentReply.arguments = bundle
            fm?.beginTransaction()
                ?.replace(R.id.fragmentToFragmentContainer, fragmentReply)
                ?.addToBackStack(null)
                ?.commit()
        }

    }
}
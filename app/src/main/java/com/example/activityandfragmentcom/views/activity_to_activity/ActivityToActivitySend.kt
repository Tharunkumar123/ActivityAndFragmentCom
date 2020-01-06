package com.example.activityandfragmentcom.views.activity_to_activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseActivity
import kotlinx.android.synthetic.main.activity_to_activity_send.*

class ActivityToActivitySend : BaseActivity() {

    override fun setLayout(): Int {
        return R.layout.activity_to_activity_send
    }

    override fun initView(savedInstanceState: Bundle?) {

        val editTxtDataReply =intent.getStringExtra("reply_data")
        if (editTxtDataReply==null){
            replyReceivedTxt.visibility = View.GONE
        }else {
            replyReceivedTxt.visibility = View.VISIBLE
            replyDataReceivedScreen.text = editTxtDataReply
        }
        clickListener()
    }

    private fun clickListener() {
        sendBtn.setOnClickListener {
            val intent = Intent(this@ActivityToActivitySend, ActivityToActivityReply::class.java)
            val editTxtDataSend = sendData.text.toString()
            intent.putExtra("send_data", editTxtDataSend)
            startActivityForResult(intent, 1)
//            startActivity(intent)
//            finish()
        }
    }

    private fun getDataFromActivityTwo(data: Intent?) {
        val editTxtDataReply = data?.getStringExtra("reply_data")
        replyReceivedTxt.visibility = View.VISIBLE
        replyDataReceivedScreen.text = editTxtDataReply
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                getDataFromActivityTwo(data)
            }
        }
    }
}
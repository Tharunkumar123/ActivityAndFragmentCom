package com.example.activityandfragmentcom.views.activity_to_activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseActivity
import com.example.activityandfragmentcom.views.fragmenttofragment.FragmentToFragmentActivity
import kotlinx.android.synthetic.main.activity_to_activity_reply.*
import kotlinx.android.synthetic.main.fragment_send.*

class ActivityToActivityReply : BaseActivity() {

    private var editTxtDataSend: String? = null
    override fun setLayout(): Int {
        return R.layout.activity_to_activity_reply
    }

    override fun initView(savedInstanceState: Bundle?) {
        clickListener()
        getDataFromActivityOne()
    }

    private fun getDataFromActivityOne() {
        editTxtDataSend = intent.getStringExtra("send_data")
        sendDataReceivedScreen.text = editTxtDataSend
    }

    private fun clickListener() {
        replyBtn.setOnClickListener {
            val editTxtDataReply = replyData.text.toString()
            val intent = Intent(this@ActivityToActivityReply, ActivityToActivitySend::class.java)
            intent.putExtra("reply_data", editTxtDataReply)
            setResult(Activity.RESULT_OK, intent)
//            startActivity(intent)
            finish()
        }
//        replyBtn.setOnLongClickListener {
//            val intent = Intent(this@ActivityToActivityReply, FragmentToFragmentActivity::class.java)
//            startActivity(intent)
//            true
//        }
    }
}
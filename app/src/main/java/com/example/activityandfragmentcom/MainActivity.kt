package com.example.activityandfragmentcom

import android.content.Intent
import android.os.Bundle
import com.example.activityandfragmentcom.base.BaseActivity
import com.example.activityandfragmentcom.views.activity_to_activity.ActivityToActivitySend
import com.example.activityandfragmentcom.views.activity_to_fragment.ActivityToFragment
import com.example.activityandfragmentcom.views.fragment_to_activity.FragmentToActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView(savedInstanceState: Bundle?) {
        clickListeners()
    }

    private fun clickListeners() {
        activityToActivityBtn.setOnClickListener {
            val intent=Intent(this@MainActivity, ActivityToActivitySend::class.java)
            startActivity(intent)
        }
        activityToFragmentBtn.setOnClickListener {
            val intent=Intent(this@MainActivity, ActivityToFragment::class.java)
            startActivity(intent)
        }
        fragmentToActivityBtn.setOnClickListener {
            val intent=Intent(this@MainActivity, FragmentToActivity::class.java)
            startActivity(intent)
        }
        fragmentToFragmentBtn.setOnClickListener {
            val intent=Intent(this@MainActivity, ActivityToActivitySend::class.java)
            startActivity(intent)
        }
    }
}

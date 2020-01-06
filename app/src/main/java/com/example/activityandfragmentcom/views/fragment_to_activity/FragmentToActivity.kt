package com.example.activityandfragmentcom.views.fragment_to_activity

import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseActivity
import kotlinx.android.synthetic.main.fragment_to_activity.*

class FragmentToActivity : BaseActivity(), FragmentFA.SendDataToActivity {

    override fun setLayout(): Int {
        return R.layout.fragment_to_activity
    }

    override fun initView(savedInstanceState: Bundle?) {
        loadFragment()
    }

    private fun loadFragment() {
        val fragmentFA = FragmentFA()

        supportFragmentManager.beginTransaction().replace(R.id.loadsFragmentFA, fragmentFA).commit()



    }

    override fun sendData(message: String) {
        passActivityDataFA.setText(message)
    }
}
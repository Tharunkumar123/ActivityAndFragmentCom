package com.example.activityandfragmentcom.views.fragmenttofragment

import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseActivity

class FragmentToFragmentActivity : BaseActivity(){

    override fun setLayout(): Int {
        return R.layout.fragment_to_fragment_activity
    }
    override fun initView(savedInstanceState: Bundle?) {
        val data=""
        val fragmentSend = FragmentToFragmentSend()
        val bundle = Bundle()
        bundle.putString("sendingDataToFragmentSend", data)
        fragmentSend.arguments = bundle
        val ft = supportFragmentManager.beginTransaction()
        val fragmentTransaction = ft.replace(R.id.fragmentToFragmentContainer, fragmentSend)
        fragmentTransaction.addToBackStack(fragmentSend.javaClass.name).commit()
    }
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }


}
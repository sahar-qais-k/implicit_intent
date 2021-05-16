package com.sahar.implicitintent.ui

import android.os.Bundle
import android.view.LayoutInflater
import com.sahar.implicitintent.util.Constant
import com.sahar.implicitintent.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySecondBinding =ActivitySecondBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding?.apply {
            secondText.text = intent.getStringExtra(Constant.extraName)
        }
    }
}



















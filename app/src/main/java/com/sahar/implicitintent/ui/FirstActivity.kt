package com.sahar.implicitintent.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.sahar.implicitintent.util.Constant
import com.sahar.implicitintent.databinding.ActivityFirstBinding

class FirstActivity : BaseActivity<ActivityFirstBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showSecondActivity()
    }
    override val bindingInflater: (LayoutInflater) -> ActivityFirstBinding =ActivityFirstBinding::inflate

    private fun showSecondActivity() {

        binding?.apply {
            button.setOnClickListener{
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Constant.extraName, textView.text)
                startActivity(intent)
            }
        }
    }

}










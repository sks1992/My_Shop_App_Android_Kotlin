package sk.sandeep.shopappandroid.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import sk.sandeep.shopappandroid.R
import sk.sandeep.shopappandroid.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_forget_password)

        setUpActionBar()
    }

    //to create a backPress Button in toolbar
    private fun setUpActionBar() {
        setSupportActionBar(binding.toolbarForgotPasswordActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        binding.toolbarForgotPasswordActivity.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}
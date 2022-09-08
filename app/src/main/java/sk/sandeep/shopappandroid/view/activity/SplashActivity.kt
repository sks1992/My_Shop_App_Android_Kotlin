package sk.sandeep.shopappandroid.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sk.sandeep.shopappandroid.R
import sk.sandeep.shopappandroid.databinding.ActivitySplashBinding

class SplashyActivity : AppCompatActivity() {
    private val coroutineScope = lifecycleScope
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        runWait()

//        val typeface: Typeface = Typeface.createFromAsset(assets, "montserrat_bold.ttf")
//        binding.tvAppName.typeface = typeface
    }

    private fun runWait() {
        coroutineScope.launch {
            wait()
        }
    }

    private suspend fun wait() {
        delay(2000L)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
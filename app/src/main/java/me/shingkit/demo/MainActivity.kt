package me.shingkit.demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import me.shingkit.ui.SdkMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nav2Sdk(view: View) {
        SdkMainActivity.startActivity(this)
    }
}
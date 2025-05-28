package com.ferhat.pomocred

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ferhat.pomocred.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bin: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bin = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bin.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var viewCoin = layoutInflater.inflate(R.layout.layout_coin_info, bin.frameCoin, false)
        bin.frameCoin.addView(viewCoin)

        var viewTimer = layoutInflater.inflate(R.layout.layout_timer, bin.frameTimer, false)
        bin.frameTimer.addView(viewTimer)

        var viewFooter = layoutInflater.inflate(R.layout.layout_footer, bin.frameFooter, false)
        bin.frameFooter.addView(viewFooter)
    }
}
package com.example.flato

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo

import android.graphics.Color
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {

    val activity = this as Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Define a orientação do aplicativo para retrato
        activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT


        supportActionBar?.hide()
        //window.statusBarColor = Color.parseColor("#AE7502AF")
        window.statusBarColor = Color.parseColor("Black")
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,HomeNew::class.java)
            startActivity(intent)
            finish()
        },2500)
    }
}
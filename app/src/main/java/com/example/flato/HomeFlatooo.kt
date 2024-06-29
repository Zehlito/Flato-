package com.example.flato

import android.app.Activity
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.media.*
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

private const val TAG = "HomeFlatooo"

class HomeFlatooo : AppCompatActivity() {

    private lateinit var botao1: AppCompatButton
    private lateinit var botao2: AppCompatButton
    private lateinit var botao3: AppCompatButton
    private lateinit var botao4: AppCompatButton
    private lateinit var botao5: AppCompatButton
    private lateinit var botao6: AppCompatButton
    private lateinit var botao7: AppCompatButton
    private lateinit var botao8: AppCompatButton
    private lateinit var botao9: AppCompatButton
    private lateinit var botao10: AppCompatButton
    private lateinit var botao11: AppCompatButton
    private lateinit var botao12: AppCompatButton


    private lateinit var soundPool: SoundPool
    private var soundStreamBotao1: Int = 0
    private var soundStreamBotao2: Int = 0
    private var soundStreamBotao3: Int = 0
    private var soundStreamBotao4: Int = 0
    private var soundStreamBotao5: Int = 0
    private var soundStreamBotao6: Int = 0
    private var soundStreamBotao7: Int = 0
    private var soundStreamBotao8: Int = 0
    private var soundStreamBotao9: Int = 0
    private var soundStreamBotao10: Int = 0
    private var soundStreamBotao11: Int = 0
    private var soundStreamBotao12: Int = 0
    val activity = this as Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_flatooo)
        // Define a orientação do aplicativo para retrato
        activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        supportActionBar?.hide()
        //window.statusBarColor = Color.parseColor("#AE7502AF")
        window.statusBarColor = Color.parseColor("Black")

        botao1 = findViewById(R.id.botao1)
        botao2 = findViewById(R.id.botao2)
        botao3 = findViewById(R.id.botao3)
        botao4 = findViewById(R.id.botao4)
        botao5 = findViewById(R.id.botao5)
        botao6 = findViewById(R.id.botao6)
        botao7 = findViewById(R.id.botao7)
        botao8 = findViewById(R.id.botao8)
        botao9 = findViewById(R.id.botao9)
        botao10 = findViewById(R.id.botao10)
        botao11 = findViewById(R.id.botao11)
        botao12 = findViewById(R.id.botao12)

        soundPool = SoundPool.Builder().build()
        val soundIdBotao1 = soundPool.load(this, R.raw.pumzao, 1)
        val soundIdBotao2 = soundPool.load(this, R.raw.peidinho, 1)
        val soundIdBotao3 = soundPool.load(this, R.raw.grandepum2, 1)
        val soundIdBotao4 = soundPool.load(this, R.raw.defininho, 1)
        val soundIdBotao5 = soundPool.load(this, R.raw.flato, 1)
        val soundIdBotao6 = soundPool.load(this, R.raw.longopum, 1)
        val soundIdBotao7 = soundPool.load(this, R.raw.mediumpum, 1)
        val soundIdBotao8 = soundPool.load(this, R.raw.peido, 1)
        val soundIdBotao9 = soundPool.load(this, R.raw.peidozinho, 1)
        val soundIdBotao10 = soundPool.load(this, R.raw.pum, 1)
        val soundIdBotao11 = soundPool.load(this, R.raw.qpum, 1)
        val soundIdBotao12 = soundPool.load(this, R.raw.secagou, 1)

        botao1.setOnClickListener {
            //Log.i(TAG, "PUMZÃO!")
            Log.i(TAG, "PUMZÃO")

            if (soundStreamBotao1 == 0) {
                soundStreamBotao1 = soundPool.play(soundIdBotao1, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao1)
                0
            }
            soundStreamBotao1 = 0
        }


        botao2.setOnClickListener {
            Log.i(TAG, "Peidinho")

            if (soundStreamBotao2 == 0) {
                soundStreamBotao2 = soundPool.play(soundIdBotao2, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao2)
                0
            }
            soundStreamBotao2 = 0

        }
        botao3.setOnClickListener {
            Log.i(TAG, "Grande pum!")

            if (soundStreamBotao3 == 0) {
                soundStreamBotao3 = soundPool.play(soundIdBotao3, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao3)
                0
            }
            soundStreamBotao3 = 0


        }
        botao4.setOnClickListener {
            //Log.i(TAG, "PUMZÃO!")
            Log.i(TAG, "De fininho")

            if (soundStreamBotao4 == 0) {
                soundStreamBotao4 = soundPool.play(soundIdBotao4, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao4)
                0
            }
            soundStreamBotao4 = 0
        }


        botao5.setOnClickListener {
            Log.i(TAG, "Peidinho")

            if (soundStreamBotao5 == 0) {
                soundStreamBotao5 = soundPool.play(soundIdBotao5, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao5)
                0
            }
            soundStreamBotao5 = 0

        }
        botao6.setOnClickListener {
            Log.i(TAG, "Grande pum!")

            if (soundStreamBotao6 == 0) {
                soundStreamBotao6 = soundPool.play(soundIdBotao6, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao6)
                0
            }
            soundStreamBotao6 = 0


        }
        botao7.setOnClickListener {
            //Log.i(TAG, "PUMZÃO!")
            Log.i(TAG, "PUMZÃO")

            if (soundStreamBotao7 == 0) {
                soundStreamBotao7 = soundPool.play(soundIdBotao7, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao7)
                0
            }
            soundStreamBotao7 = 0
        }


        botao8.setOnClickListener {
            Log.i(TAG, "Peidinho")

            if (soundStreamBotao8 == 0) {
                soundStreamBotao8 = soundPool.play(soundIdBotao8, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao8)
                0
            }
            soundStreamBotao8 = 0

        }
        botao9.setOnClickListener {
            Log.i(TAG, "Grande pum!")

            if (soundStreamBotao9 == 0) {
                soundStreamBotao9 = soundPool.play(soundIdBotao9, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao9)
                0
            }
            soundStreamBotao9 = 0


        }
        botao10.setOnClickListener {
            //Log.i(TAG, "PUMZÃO!")
            Log.i(TAG, "PUMZÃO")

            if (soundStreamBotao10 == 0) {
                soundStreamBotao10 = soundPool.play(soundIdBotao10, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao10)
                0
            }
            soundStreamBotao10 = 0
        }


        botao11.setOnClickListener {
            Log.i(TAG, "Peidinho")

            if (soundStreamBotao11 == 0) {
                soundStreamBotao11 = soundPool.play(soundIdBotao11, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao11)
                0
            }
            soundStreamBotao11 = 0

        }
        botao12.setOnClickListener {
            Log.i(TAG, "Grande pum!")

            if (soundStreamBotao12 == 0) {
                soundStreamBotao12 = soundPool.play(soundIdBotao12, 1F, 1F, 0, 0, 1F)
                Toast.makeText(this.applicationContext, "Peidando...", Toast.LENGTH_SHORT).show()
            } else {
                soundPool.pause(soundStreamBotao12)
                0
            }
            soundStreamBotao12 = 0


        }
    }




}
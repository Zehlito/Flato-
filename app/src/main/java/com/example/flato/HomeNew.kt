package com.example.flato



import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import com.example.flato.databinding.ActivityHomeNewBinding

private lateinit var binding: ActivityHomeNewBinding
private lateinit var mediaPlayer: MediaPlayer


class HomeNew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //troca a cor da barra
        supportActionBar?.hide()
        window.statusBarColor = Color.BLACK

        // Cria o MediaPlayer e define a música
         //mediaPlayer = MediaPlayer.create(this, R.raw.flato)


        binding.botao1.setOnClickListener {
            binding.seekBar.max = 3000
            mediaPlayer = MediaPlayer.create(this, R.raw.flato)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao2.setOnClickListener {
            binding.seekBar.max = 6000
            mediaPlayer = MediaPlayer.create(this, R.raw.defininho)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao3.setOnClickListener {
            binding.seekBar.max = 2000
            mediaPlayer = MediaPlayer.create(this,R.raw.grandepum2)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()
        }

        binding.botao4.setOnClickListener {
            binding.seekBar.max = 11000
            mediaPlayer = MediaPlayer.create(this, R.raw.longopum)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao5.setOnClickListener {
            binding.seekBar.max = 2000
            mediaPlayer = MediaPlayer.create(this, R.raw.mediumpum)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao6.setOnClickListener {
            binding.seekBar.max = 400
            mediaPlayer = MediaPlayer.create(this,R.raw.peidinho)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()
        }

        binding.botao7.setOnClickListener {
            binding.seekBar.max = 600
            mediaPlayer = MediaPlayer.create(this, R.raw.peido)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao8.setOnClickListener {
            binding.seekBar.max = 4500
            mediaPlayer = MediaPlayer.create(this, R.raw.peidozinho)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao9.setOnClickListener {
            binding.seekBar.max = 22500
            mediaPlayer = MediaPlayer.create(this,R.raw.pum)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()
        }

        binding.botao10.setOnClickListener {
            binding.seekBar.max = 1000
            mediaPlayer = MediaPlayer.create(this, R.raw.pumzao)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao11.setOnClickListener {
            binding.seekBar.max = 1000
            mediaPlayer = MediaPlayer.create(this, R.raw.qpum)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()

        }

        binding.botao12.setOnClickListener {
            binding.seekBar.max = 4000
            mediaPlayer = MediaPlayer.create(this,R.raw.secagou)
            Toast.makeText(this.applicationContext, R.string.app_name1, Toast.LENGTH_LONG).show()
            verifica()
        }


        // Define o listener para a mudança na posição da barra de progresso
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    // Atualiza a posição da música
                    mediaPlayer.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
    private fun startProgressUpdate() {
        // Cria uma thread para atualizar a barra de progresso
        val thread = Thread {
            while (mediaPlayer.isPlaying) {
                // Atualiza a posição da barra de progresso
                //binding.seek.progress = mediaPlayer.currentPosition
                binding.seekBar.progress = mediaPlayer.currentPosition

                // Espera 1 milissegundos antes de atualizar novamente
                Thread.sleep(1)
                //fazer calibração com a seekbar na activity... 1 segundo = 1000
            }
        }

        // Inicia a thread
        thread.start()
    }
    override fun onDestroy() {
        super.onDestroy()

        // Libera os recursos do MediaPlayer
        mediaPlayer.release()


    }

    private fun verifica(){
        //verifica se a musica esta tocando
        if (mediaPlayer.isPlaying){
            //pausa a musica
            mediaPlayer.pause()
        }else{
            //inicia a musica
            mediaPlayer.start()
            // Inicia a atualização da barra de progresso
            startProgressUpdate()
        }

    }
}
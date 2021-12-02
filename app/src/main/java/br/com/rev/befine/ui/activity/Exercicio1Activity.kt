package br.com.rev.befine.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import br.com.rev.befine.R
import com.bumptech.glide.Glide

class Exercicio1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercicio1_activity)
        title = "Exercício de Respiração"

        showGif()
    }

    private fun showGif(){
        val imageView: ImageView = findViewById(R.id.gif_image)
        Glide.with(this).load(R.drawable.respiracao).into(imageView)
    }
}
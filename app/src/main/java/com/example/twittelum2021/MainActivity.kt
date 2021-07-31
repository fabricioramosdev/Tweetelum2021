package com.example.twittelum2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao =  findViewById<Button>(R.id.criar_tweet)
        botao.setOnClickListener(View.OnClickListener{
            publicaTweet()
            finish()
        })
    }


    private fun publicaTweet(){
        val tweetMensagem = findViewById<EditText>(R.id.tweet_mensagem)
        val mensagem: String =  tweetMensagem.text.toString()
        // Log.i("tweet", campMenagesDoTweet.text.toString())
        Toast.makeText(this,mensagem, Toast.LENGTH_LONG).show()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.tweet_menu, menu)
        return true // deve mostrar ou não

    }

}



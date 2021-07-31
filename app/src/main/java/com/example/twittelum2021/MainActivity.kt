package com.example.twittelum2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao =  findViewById<Button>(R.id.criar_tweet)
        botao.setOnClickListener(View.OnClickListener{publicTweet()})
    }

    private fun publicTweet(){
        val tweetMensagem = findViewById<EditText>(R.id.tweet_mensagem)
        val mensagem: String =  tweetMensagem.text.toString()
        // Log.i("tweet", campMenagesDoTweet.text.toString())

        Toast.makeText(this,mensagem, Toast.LENGTH_LONG).show()
    }

}



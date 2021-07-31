package com.example.twittelum2021


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val tweets = listOf("Meu primeiro tweet", "Meu segundo tweet", "Meu terceiro tweet","Meu quarto tweet", "Meu quinto tweet", "Hoje esta frio!" )
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, tweets)
        val lista = findViewById<ListView>(R.id.lista_tweet)

        lista.adapter = adapter
    }
}
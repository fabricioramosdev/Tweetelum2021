package com.example.twittelum2021


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val tweets = listOf("Meu primeiro tweet", "Meu segundo tweet", "Meu terceiro tweet",
            "Meu quarto tweet", "Meu quinto tweet", "Hoje esta frio!", "Meu sexta tweet",
            "Meu setimo tweet", "Hoje esta frio!", "Hoje esta frio!", "Hoje esta frio!",
            "Hoje esta frio!", "Hoje esta frio!", "Hoje esta frio!", "Hoje esta frio!",
            "Hoje esta frio!", "Hoje esta frio!", "Hoje esta frio!", "Hoje esta frio!")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tweets)
        val lista_tweet = findViewById<ListView>(R.id.lista_tweet)

        lista_tweet.adapter = adapter


        val fab_add = findViewById<FloatingActionButton>(R.id.fab_add)
        
        fab_add.setOnClickListener { Snackbar.make(it, "FAB Clicado", Snackbar.LENGTH_LONG).show()}



    }
}
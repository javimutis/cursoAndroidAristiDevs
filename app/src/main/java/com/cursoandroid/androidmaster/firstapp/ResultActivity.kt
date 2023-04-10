package com.cursoandroid.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.cursoandroid.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        //Para navegar entre pantallas se usa el intent, permite lanzar la información,
        //ponemos en la activity principal el intend como un extra, asi le damos la orden de que ingrese el valor
        //que le estoy pidiendo o que que muestre vacio si no hay nada escrito
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $name"

    }
}
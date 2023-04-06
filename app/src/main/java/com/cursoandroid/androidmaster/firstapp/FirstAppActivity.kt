package com.cursoandroid.androidmaster.firstapp

//Los import son codigos a los que puedo acceder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cursoandroid.androidmaster.R

//cada Activity es una clase. Contenedores de funciones
class FirstAppActivity : AppCompatActivity() {
    //Esta es la funcion que se llama cada vez que arranca la pantalla

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Esta parte es la que une el activity con el layout
        setContentView(R.layout.activity_first_app)
    }
}
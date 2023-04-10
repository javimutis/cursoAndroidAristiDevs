package com.cursoandroid.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.cursoandroid.androidmaster.R

//par apoder inicalizar el boton y que se pueda abrir desde una activity, creamos
// la variable y tenemos que indicar que tipo de variable es dentro de los <> ahi
// se pone el tipo de vista, ej Text view, buttom, etc, asi enganchamos el boton
//R hace la referencia al nombre

class FirstAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app_button)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        //setonclickListener es lo que se muestra al momento de dar un click
        btnStart.setOnClickListener {
            //En vez de usar print se usa Log.i
            //Cuando pulse el boton, voy a mostrar un mensaje, y con lo siguiente. Devuelve el valor
            // que está escrito. A etName.text.toString que estaba {} al costado del mensaje lo
            // transforamos en variale para así poder darle un a funcion Log.i("javimutis", "Button Pulsado $name")

            val name = etName.text.toString()

            //Ahora para poder llamar a la otra activity, lo hariamos de esta forma
            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}
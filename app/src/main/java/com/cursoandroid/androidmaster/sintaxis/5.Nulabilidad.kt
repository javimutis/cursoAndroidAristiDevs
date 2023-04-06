package com.cursoandroid.androidmaster

//Hay  que protegerse de los  nulos. Los nulos se escriben en el tipo de variable incluyendo un ?
/**var name: String? = "Javi"
//El 3 significa que va a mostrar el tercer caracter escrito, en este caso seria la "V"
println(name[3])*/

fun main(){
    var name: String? = null

    //Hacer     println(name[3])  o   println(name.get(3)) es lo mismo
    //?:(Elvis) Pero si lo ... es nulo
    println(name?.get(3) ?: "Es nulo")
}
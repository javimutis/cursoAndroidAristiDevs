package com.cursoandroid.androidmaster

//Las funciones que queremos leer van dentro del main
fun main() {
    ifMultipleOR()
}

//Podemos poner mas de una variable dentro y elegir || o && para darle mayor especificidad a la variable
fun ifMultipleOR(){
    var pet = "cat"
    var isHappy = true
    // || = OR
    if (pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un perro o un gato")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermisssion = false
    var imHappy = true

    //&& AND obligatorio
    //
    if(age >= 18 && parentPermisssion && imHappy) {
        println("Puedes beber cerveza")
    }
}

fun ifInt(){
    var age = 18

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

//el ! significa lo contrario
fun ifBoolean(){
    var soyFeliz:Boolean = false

    //sin nada == true
    // con ! al principio == false

    if(!soyFeliz){
        print("Estoy triste :(")

    }
}

//If anidado es un listado de condiciones que van una detrás de otra
fun ifAnidado(){
    val animal = "dolphin"
    if(animal=="dog"){
        println("Es un perrito!")
    }else if(animal == "cat"){
        println("Es un gato")
    }else if(animal == "bird"){
        println("Es un pájaro")
    }else{
        println("No es uno de los animales esperados")
    }
}

fun ifBasico() {
    //(= asigna valores), (== compara)
    //Las condiciones tienen que ser exactamente iguales, ej Javiera, no javiera
    val name = "Javiera"

    if (name == "Javiera") {
        println("La val name es JAVIERA")
    } else {
        println("Este nombre no es Javiera")
    }

}
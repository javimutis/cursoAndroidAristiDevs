package com.cursoandroid.androidmaster

//Camelcase, la primera letra en minuscula y el resto todo juntp con primera en mayúscula
//Los valores (val) no pueden ser reasignados, son inmutables
//Las variales (var) si pueden ser modificadas
//La programación es secuencial, va línea por línea en bajada
fun main() {

    /**
     * Variables Numéricas
     */
    //Int- valor entero (-2,147,483,647 a 2,147,483,647)
    val age: Int = 33
    var age2: Int = 33
    age2 = 29

    //Long (-9,223,372,036,854,775,807 a 9,223,372,036,854,775,807 )
    val example: Long = 33

    //Float (hasta 6 decimales)
    val floatExample: Float = 30.5f

    //Double (14 decimales)
    val doubleExample: Double = 3232.3131313

    /**
     * Operaciones básicas matemáticas
     */

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)

    println("Multiplicar:")
    println(age * age2)

    println("Dividir:")
    println(age / age2)

    println("Modulo:")
    println(age % age2)

    var exampleSuma = age + floatExample

    /**
     * Variables Alfanuméricas
     */
    //Char - Soporta sólo un caradcter
    var charExample1: Char = 'e'
    var charExample2: Char = '2'
    var charExample3: Char = '@'

    //String
    val stringExample1: String = "Javiera Mutis"
    val stringExample2 = "Javiera Mutis"
    val stringExample3 = "4"
    val stringExample4 = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenada)

    //Para transformar de int a string
    val example123: String = age.toString()
    println(example123)

    //En este caso concatena
    println(stringExample3 + stringExample4)
    //en este caso suma el valor, se modifica de string a Int
    println(stringExample3.toInt() + stringExample4.toInt())


    /**
     * Variables Booleanas
     */
    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false


}
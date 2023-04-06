package com.cursoandroid.androidmaster
//para comentar y descomentar un bloque ctrl+alt+/
//para que un val o var se pueda leer en todo el codigo tengo que poner ese valor fuera del codigo,
// no dentro, si no seria una variable de funcion y no de clase
//Si queremos llamar a una funcion dentro de main, hay qeu llamarla escribiendo el nombre de la
// funcion, ejemplo (variablesNumericac())

val age: Int = 33

fun main() {
    showMyName()
    showMyAge()
    add(25, 76)
    val mySubtract = subtract(10, 5)
    subtractCool(26, 4)

}

fun showMyName() {
    println("Me llamo Javiera")
}
//Lo que está en parentesis es un valor por defecto, si llegasen a no poder información,
// se mostraría ese valor por defecto
fun showMyAge(currentAge: Int = 33) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumer: Int) {
    println(firstNumber + secondNumer)
}
fun subtract(firstNumber: Int, secondNumber: Int):Int {
   return firstNumber - secondNumber
    //Todo lo que venga después del return no se va a mostrar ni usar
}
//para funciones pequeñas, se puede usar est formato para que qeude el código en una sola linea
fun subtractCool(firstNumber: Int, secondNumber: Int)= firstNumber - secondNumber




fun variablesAlfanumericas() {

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


}

fun variablesBoolean() {
    /**
     * Variables Booleanas
     */
    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
}

fun variableNumericas() {
    //Int- valor entero (-2,147,483,647 a 2,147,483,647)

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

}

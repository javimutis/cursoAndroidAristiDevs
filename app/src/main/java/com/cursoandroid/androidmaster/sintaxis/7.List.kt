package com.cursoandroid.androidmaster
//Se recomienda usar listas en vez de array eligiendo si es mutable o no
fun main() {
    mutableList()
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekDays)

    //Para agregar un valor a la lista, se usa add, que lo fone de forma automática al final de la lista
    weekDays.add("Dia de la marmota")
    println(weekDays)

    //Para agregar un valor a la lista, y ponerlo en la posición que quiero, se pone el numero del index
    // y luego el String
    weekDays.add(3, "Día de marmota")
    println(weekDays)
    println("------------------")

    //Si quiero resolver los espacios vacíos, y que no haya error en el codigo se puede usar esta forma
    if (weekDays.isEmpty()) {
        //no pasa nada
    } else {
        weekDays.forEach { println(it) }
    }
    println("------------------")

    //O más simple y ordenado, esta otra forma
    if (weekDays.isNotEmpty()) {
        weekDays.forEach { println(it) }
    }
    weekDays.last()

    for (dia in weekDays) {

    }
    weekDays.forEach { }

    println("------------------")

}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    //Tamaño
    println(readOnly.size)
    //Todos los valores de la lista
    println(readOnly)
    //Saber una posición específica
    println(readOnly[0])
    //Conocer el último valor de la lista
    println(readOnly.last())
    //Conocer el primer valor de la lista
    println(readOnly.first())

    /**Para filtrar. it es la iteración(cada uno de los valores en su posición. Se puede usar it o
    designar un nuevo nombre de la siguiente forma ej: weekDay -> println(weekDay), cambiando it por
    weekDay, es lo mismo que println(it), designando un nombre le da más valor al codigo y es más legible*/

    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }

    println("------------------")
}
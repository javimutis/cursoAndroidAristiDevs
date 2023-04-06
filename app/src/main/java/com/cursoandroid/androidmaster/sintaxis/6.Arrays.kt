package com.cursoandroid.androidmaster

//Array-Secuencia de datos, permite almacenar muchos datos en una sola variable, ordena y es más práctico
//No se puede modificar el tamaño

fun main() {
    //Indice de 0 al valor, para acceder a la posición, en este caso seria 6
    //Tamaño del array se cuenta desde 1, en este caso seria 7
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    //Para poder acceder al listado del Array se usa la siguiente formula (weekDays[aquí va la posición]) ej: println(weekDays[0])
    println(weekDays[0])
    println(weekDays.size)

    //Para evitar que explote si se pone algun valor fuera del tamaño del array, se haria de la siguiente forma
    if (weekDays.size >= 8) {
        println(weekDays[7])
    } else {
        println("No hay más valores en el array")
    }
    //Si yo quisiera cambiar el print de alguno de los valores val arraay podria asignarle un valor. ej:
    println(weekDays[0])
    weekDays[0] = "Feliz lunes"
    println(weekDays[0])
    println("--------------")

    //Bucles para Array, recorre el array pasando por cada uno de los valores
    //Esta funciona mejor si queremos conocer sólo la posición
    for(position in weekDays.indices){
        println(weekDays[position])
           }
    println("--------------")

    //Esta es mejor si queremos conocer la posición y el valor
    for((position, value) in weekDays.withIndex()){
        println("La posición $position contiene $value")
         }
    println("--------------")

    //Esta sirve solo si quiero conocer el valor
    for(day in weekDays){
        println("Hoy es $day")
    }
    println("--------------")
    }


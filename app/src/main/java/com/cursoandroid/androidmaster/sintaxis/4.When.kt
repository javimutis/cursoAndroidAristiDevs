package com.cursoandroid.androidmaster

//fun getMonth(month:Int):String, significa que la funcion se le va a dar un Int y nos va a devolver un String

fun main() {
    getSemester(7)
}

//No es recomendable usar Any
fun result(value: Any) {
    when (value) {
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if (value) println("holiwi")
    }
}

//Para poner númer de uno a otro (in numero .. número), para no válido puede ser else, o !
//Para devolver los valores del String, se puede almacenar en una variable, cuando se cumpla una
// condición retorna un resultado

fun getSemester(month: Int) = when (month) {
    in 1..6 -> "Primer Semestre"
    in 7..12 -> "Segundo Semestre"
    !in 1..12 -> "Semestre no válido"
    else -> "Inválido"
}


fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no válido")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Cumpleaños Tia")
        }
        12 -> println("Diciembre")
        else -> println("El mes no existe")
    }
}


//Esto no es lo optimo. mejor usar la opcion when
//fun getMonth(month: Int) {
//    if (month == 1) {
//        println("enero")
//    } else if (month == 2) {
//        println("febrero")
//    } else if (month == 3) {
//        println("marzo")
//    } else if (month == 4) {
//        println("abril")
//    } else if (month == 5) {
//        println("mayo")
//    } else if (month == 6) {
//        println("junio")
//    } else if (month == 7) {
//        println("julio")
//    } else if (month == 8) {
//        println("agosto")
//    } else if (month == 9) {
//        println("septiembre")
//    } else if (month == 10) {
//        println("octubre")
//    } else if (month == 11) {
//        println("noviembre")
//    } else if (month == 12) {
//        println("diciembre")
//    }else{
//        println("El mes no existe")
//    }
//}

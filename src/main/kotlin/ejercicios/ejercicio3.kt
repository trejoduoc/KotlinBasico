package org.example.ejercicios
/*
crear mismo pryecto resolviendo
problematica similar

el programa debe calcular:
- el noombre del mes
- estacion del año que pertence el mes

reglas:
- 12, 1, 2 -> invierno
- 3, 4, 5 -> primavera
- 6, 7 ,6 -> verano
- 9, 10, 11 -> autumn

ejemplo:
- si es 1 devuelve enero e invierno

debo usar:
- readln()
- toInt()
- if
- rangos con in
- when
- else
 */
fun main() {
    // mensaje bienvenida
    println(
        "Ingre el numero del mes" +
                " para el informe"
    )
    // ingresa un numero del 1-12
    val mes = readln().toInt()

    // mes del año
    val mesEscogido = when(mes) {
        1 -> ("Enero")
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Numero no valido"

    }
//    // Mi codigo respuesta
//    val temporada = when(mes){
//        in 1..2 -> "invierno"
//        in 12..12 -> "invierno"
//        in 3..5 -> "primavera"
//        in 6..8 -> "verano"
//        in 9..11 -> "autumn"
//        else -> "no califica temporada"
//    }
//    println("\n== Temporada y mes actual ==\n" +
//            "mes -> $mesEscogido\n" +
//            "temporada -> $temporada")


    // codigo del profe

    if(mes in 1..12){
        val tempo = when(mes){
            12, 1, 2 -> "invierno"
            3, 4, 5 -> "Primavera"
            6, 7, 8 -> "Verano"
            9, 10, 11 -> "Otoño"
            else -> "No valido"
        }
        println("\n== Usando codigo del profe ==\n" +
                "mes -> $mesEscogido\n" +
                "temporada -> $tempo")
    }else{
        print(mes)
    }

}


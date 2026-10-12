package org.example.ejercicios
/*
Crea un programa que pida al usuario un numero
del 1 al 12.

El programa debe convertir ese numero en
 el nombre del mes correspondiente

ejemplo:
- Si el usuario escribe 1
- Si el usuario escribe 5
- Si el usuario escribe 12
- Si el usuario escribe un numero que no esta
entre el 1 y 12, debe mostrar:
 "Numero invalido"

Conceptos que debe utilizar:
- readln()
- toInt()
- when
- else
 */

// mi respuesta
fun main(){
    println("Escribe el mes: ")
    val mes = readln().toInt()

    val mesElegido = when(mes){
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Numero invalido"
    }
        println("Has escogido" +
            ": $mesElegido")
}


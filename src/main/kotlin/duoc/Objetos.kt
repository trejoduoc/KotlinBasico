package org.example.duoc

class Auto(val marca:String, val modelo:String, var anio:Int)

fun main(){
    val miTesla = Auto("Tesla","Model Y",2023)
    val miSuzuki = Auto("Suzuki","Old Truck",1998)
    println("Me he comprado un ${miTesla.marca} modelo ${miTesla.modelo} " +
            "y del anio ${miTesla.anio}")
    println(
        "${miSuzuki.anio} es la marca del auto que compre " +
                "${miSuzuki.modelo} es el modelo y ${miSuzuki.anio} el anio"
    )
}
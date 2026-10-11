package org.example

// Bucle for
fun main(){
//    println("clase 1")
//    println("clase 2")
//    println("clase 3")
//    println("clase 4")
//    println("clase 5")
// esto escrito a mano o..

    // for loop rango in
//    for (claseNumero in 1..10){
//        println("Clase numero $claseNumero")
//    }

    //variables fuera para todo el proyecto
    // variables dentro solo utiles dentro de funcion

//    for (claseNumero in 1..10){
//        var dobleNumero = 2 * claseNumero
//        println("Clase numero x2 $dobleNumero")
//    }

    var primeraClase = 1
    var ultimaClase = 30
    // step -> salta el numero que se indica (2 = 2 en 2)
    for(claseNumero in primeraClase..ultimaClase step 2){
        println("Clase numero $claseNumero")
    }

    // bucle while
}
package org.example

fun main(){
    println("\n== while loop ==")
    var nivelBateria = 100

    // bucle while comprueba luego ejecuta
    while(nivelBateria > -1){
        println("nivel actual de bateria -> $nivelBateria")
        nivelBateria -= 25
    }

    // bucle do while priero ejecuta luego comprueba
//    do{
//        println(nivelBateria)
//        nivelBateria -= 25
//    }while (nivelBateria > 0)

    println("\n== Break ==")
    // BREAK
    var numero = 10
    var numeroFav = 5
    while(numero > 0){
        println(numero)
        if(numero == numeroFav){
            break
        }
        numero -=1
    }
    println("\n== Continue ==")
    // continue (llega al numero 15, no lo imprime y continua
    // con el codigo)
    var numero2 = 20
    var numeroFav2 = 15
    while(numero2 > 0){
        numero2 -= 2
        if(numero2 == numeroFav2){
            continue
        }
        println(numero2+2)
    }
}
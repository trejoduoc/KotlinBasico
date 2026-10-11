package org.example

/*
Operadores logicos
&& es un and
|| al menos una condicion verdadera
!. (invertir el valor)
 */
fun main() {
    val age = 12
    val tieneTicket = true

    val acceso = age >= 12 && tieneTicket
    println("1)El resultado al acceso es: "+acceso)

    val esPro = false
    val esNovato= true
    val competir = esPro || esNovato
    println(competir)

    val valor1 = true
    val valor2 = false

    println("EL valor1 era \"$valor1\", pero ahora es "+!(valor1)+
    " porque usamos -> !(valor1) para invertirlo.")

    val precio = 10.0
    val cantidad = 3
    // uso .toInt para cortar ell decimal sin redondear
    // se le conoce como "Casteo" convierte double en int
    println("El precio total es de ${(precio*cantidad).toInt()} peso.")

    //Casteo
}

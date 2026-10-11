package org.example

/*
Curso de kotlin basico de 0 con youtube, por que?
porque el profe es nuevo enseñando
 */
fun main (){
    // val de value -> inmutable
    val name = "Sebas"
    val age:Int = 27
    println("Hello $name!")
    print("Es tu cumpleaños número $age")

    // var de variable mutable
    var numero =1
    var numero2:Int = 2
    var numero_largo:Long = 20000000
    var numero_float:Float = 3.14F  // F mayuscula al final, almacena algo menos de double
    var numero_double:Double = 3.14252522  // double almacena mas decimal

    // alfanumerica
    var ejemplo:String ="Cadena1$=?:@@"
    var ejemplo1:Char ='A'

    // Boolean
    var ejemplo2:Boolean = true // o false
    var ejemplo3 = false

    val aged = 30
    val treinta = (aged == 30)
    val esAdulto = aged !=30
    val noEsAdulto = aged <=39

    println("\n"+esAdulto)
    println(noEsAdulto)

    val primerNumero = 1
    val segundoNumero = 2

    println("Sumar")
    println("$primerNumero + $segundoNumero = "+(primerNumero+segundoNumero))
    val resultado1 = primerNumero+segundoNumero
    print("Resultado= "+resultado1)


}
package org.example.colecciones

fun main() {
    // Ciclo for
    println("Ciclo for:")
    for (i in 1..10) {
        println(i)
    }

    // Ciclo while
    println("\nCiclo while:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    // Ciclo do while
    println("\nCiclo do while:")
    var x = 0
    do {
        println(x)
        x++
    } while (x <= 10)

    // ponendo a prueba funciones
    // fun 1
    val a = 5
    val b = 9
    // 1. fun tradicional
    val resultado_tradicional = sum1(a,b)
    println("\nEl resultado tradicional de funcion es: ${resultado_tradicional}\n")

    // 2. fun una sola expresion
    val resultado_una_expresion = sum2(a,b)
    println("${resultado_una_expresion} -> Es el resultado de fun. una sola expresion.\n")

    // 3. fun lambda directa
    val resultado_lambda = sum3(a,b)
    println("${resultado_lambda} -> este es el resultado lambda directo\n")

    // 4. fun lambda orden superior
    val resultado_lambda_ordenSuperior = calculate(a,b,sum3)
    println("Resultado de calculate con sum3: ${resultado_lambda_ordenSuperior}\n")

    // pasar una funcion como referencia
    val resultado_referencia = calculate(1,2, ::sum1)
    println("Este es un resultado usando funcion de referencia: ${resultado_referencia}\n")
}
// Tipos de funciones
// 1.funcion con sitaxix
fun sum1(a:Int,b:Int):Int{
    return a+b
}

// 2. funcion de una sola expresion
fun sum2(a:Int,b:Int) = a+b

// 3. funcion de orden superior
fun calculate(x:Int,y:Int, operation: (Int,Int)->Int):Int{
    return operation(x,y)
}

// 4. funcion lambda o funcion anonima
val sum3 = {a:Int, b:Int -> a+b}

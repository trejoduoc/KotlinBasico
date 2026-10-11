package org.example.ejercicios

fun main(){
    // Item 1
    // I
    var int:Int = 1
    var double:Double = 1.00

    // II
    var suma = 1+1
    var resta = 1-1
    var division = 1/1
    var multi = 1*1

    // III
    println("1+1= "+suma)
    println("1-1= "+resta)
    println("1/1= "+division)
    println("1*1= "+multi)

    // Item2
    // I
    var puede_nulo:String? = "mensaje no nulo"
    //var puede_nulo:String? = null

    // II - III - IV
    println("\nla frase \"${puede_nulo}\" tiene una longitud de ${puede_nulo?.length?:0} espacios.\n" +
            "" +
            "")
    // ${puede_nulo?.length?:0} -> si el valor es 0, muestra "0"
    // ${puede_nulo?.length} -> muestra la cantidad total de espacios que usa

    // Item 3
    // I
    var numeroDia:Int = 3
    when(numeroDia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles\n")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("El numero ${numeroDia} no corresponde a día de la semana.\n")
    }
    // II
    var gato = 3
    when(gato){
        1->println("Este es pompon\n")
        2->println("Este es pericle\n")
        3->println("Esta es merlina\n")
        else -> println("Este aun no es integrante de la familia\n")
    }

}
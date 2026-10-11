package org.example.condicionales

// == compara
// = asigna

fun main(){
    val age = 20
    val esAdulto: Boolean = age>=18

    if(esAdulto){
        println("Es mayor de edad.")
    }else{
        println("Es menor de edad.")
    }

    // la condicion funciona secuencial
    // el orden de la comprobacion tiene peso/importancia
    val valorTotal = 100.0
    if(valorTotal>=120){
        println("Envío gratis.")
    }else if(valorTotal>=50){
        println("Envío con 15% de descuento.")
    }else if(valorTotal>=30){
        println("Envío con 10% de descuento.")
    }else{
        println("Envío por pagar a domicilio o sucursal.")
    }

    val puntaje = 6.8
    if(puntaje>=4){
        println("Aprobado con nota -> ${puntaje}")
    }else if (puntaje>=5){
        println("Aprobado con puntaje sobre la media. nota -> ${puntaje}")
    }else if(puntaje<=7 && puntaje >=6){
        println("Dios del puntaje, lider del sistema " +
                "Tu nota supera todos los limites. " +
                "Felicidades por tu nota ${puntaje}")
    }


    val neurodivergente: Boolean = true
    if(neurodivergente == true){
        println("Aqui tiene su lanyard de girasoles, pase por " +
                "esta fila prioritaria.")
    }else{
        println("Vaya a la fila normal y espere su turno")
    }

    // acceso por edad
    val miEdad = 27
    val accesoMensaje = if(miEdad>=18){
        "Mayor edad, adelante." // lo ultimo que pongo se muestra y
        // almacena en la variable
    }else{
        "Menor de edad, no apto para ingreso."
        // se puede almacenar todo tipo de datos
    }
    println(accesoMensaje)

//    if(!esAdulto){ // !-> not
//        println("Es menor de edad")
//    }
}

//    if(age<=18){
//        println("Pa casa niño")
//    }
//}
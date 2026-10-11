package org.example.condicionales

fun main() {


    val rolUsuario: String = "admin"

    // Forma no eficiente
    val permisos = if (rolUsuario == "admin") {
        "Acceso completo"
    } else if (rolUsuario == "editor") {
        "Acceso editor"
    } else if (rolUsuario == "visita") {
        "Acceso visita"
    } else {
        "Rol desconocido"
    }

    // usando when
    val permisos2 = when(rolUsuario) {
        "admin" -> {
            println("== Bienvenido ==")
            println("Usuario: ")
            println("Contraseña: ")
        }
        "editor" -> "Acceso editor"
        "visita" -> "Acceso visita"
        else -> "rol desconocido"
    }

    val puntos = 67
    val ejemplo = when{
        puntos >50 -> "Aprobado"
        puntos >70 && permisos2 == "Acceso editor" -> "Juan"
        else -> "Ejemplo"
    }

    when(rolUsuario) {
        "admin" -> {
            println("== Bienvenido ==")
            println("Usuario: ")
            println("Contraseña: ")
        }
        "editor" -> "Acceso editor"
        "visita","invitado" -> "Acceso visita"
        else -> "rol desconocido"
    }

    // when para calcular nivel y mostrar texto

    val nivel = 8
    when{
        nivel > 0 && nivel <= 3 -> print("noob")
        nivel > 3 && nivel <= 5 -> print("no tan noob")
        nivel > 6 && nivel <= 8 -> print("intermedio")
        nivel >8 -> print("Pro player")
        else -> ""
    }

    // Rangos, mejoramos el codigo de forma eficiente.
    val miRango:IntRange = 0..10

    when(nivel){
        !in - 100..0 -> print("")
        in 0 .. 3 -> print("noob")
        in 3 .. 5 -> print("no tan noob")
        in 6 .. 8 -> print("intermedio")
        in 9 .. 10 -> print("Pro player")
        else -> ""
    }
}

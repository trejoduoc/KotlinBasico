package org.example.colecciones

/**
 Crea una calucladora que reciba los siguientes parametros
 - nombre producto
 - precio unidad
 - cantidad
 - % descuento
 - % impuesto

 El programa debe calcular ej: 100.
 - subtotal (100)
 - cantidad descontada (10)
 - precio toal despues del descuento (90)
 - cantidad de impuestos (9)
 - total

 */

fun main() {
    // Variables
    val nProducto:String = "Iphone 13 mini"
    val precio:Double = 179.99
    val cantidad: Int = 2
    val descuento:Int = 10
    val impuesto:Int = 19

    // Operacion
    val subtotal = precio * cantidad
    val cant_descuento= (subtotal * descuento)/100
    val precioTotal= subtotal - cant_descuento
    val cantidadIva = (precioTotal*impuesto)/100
    val precioTotalMasIva = precioTotal + cantidadIva

    // Print
    println("=== Shop Iphone ===")
    println("Producto a llevar: ${nProducto}")
    println("Cantidad: ${cantidad}")
    println("Subtotal: $${subtotal}")
    println("Cantitdad descontada: $${cant_descuento}")
    println("Precio con descuento: $${precioTotal}")
    println("Cantidad impuestos iva 19%: $${cantidadIva}")
    println("Total: $${precioTotalMasIva}")
    println("Gracias por su pedido vuelva pronto!")
}
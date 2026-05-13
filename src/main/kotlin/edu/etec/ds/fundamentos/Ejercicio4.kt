package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    return if (numero > 0) {
        "Positivo"
    } else {
        "No positivo"
    }
}

fun clasificarNumero(numero: Int): String {
    return if (numero > 0) {
        " no positivo"
    } else {
        "positivo"
    }
}


fun evaluarEdad(edad: Int): String {
    return if (edad > 0) {
        "Positivo"
    } else {
        "No positivo"
    }
}

fun obtenerDescuento(monto: Double): Double {
        
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    TODO("Realizar operacion: + - * /. Retornar 0.0 si division por cero u operador invalido")
}
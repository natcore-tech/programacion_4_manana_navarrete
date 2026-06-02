enum class Calificacion(val descripcion: String, val esAprobado: Boolean) {
    INSUFICIENTE ("Nota muy baja",      false),
    DEFICIENTE   ("Nota baja",          false),
    SUFICIENTE   ("Nota aprobatoria",   true),
    NOTABLE      ("Nota buena",         true),
    SOBRESALIENTE("Nota excelente",     true);

    fun puedeTransicionarA(siguiente: Calificacion): Boolean = when (this) {
        INSUFICIENTE -> siguiente == DEFICIENTE || siguiente == SUFICIENTE
        DEFICIENTE   -> siguiente == SUFICIENTE || siguiente == NOTABLE
        else         -> false
    }
}

fun main() {
    val estado = Estado.EN_PROCESO
    println(estado.descripcion)  // Siendo procesado
    println(estado.esTerminal)   // false

    // when exhaustivo — sin else porque el compilador conoce todos los casos
    val icono = when (estado) {
        Estado.PENDIENTE   -> "⏰"
        Estado.EN_PROCESO  -> "⏳"
        Estado.COMPLETADO  -> "✅"
        Estado.FALLIDO     -> "❌"
        Estado.CANCELADO   -> "🚫"
    }
    println(icono)  // ⏳

    println(estado.puedeTransicionarA(Estado.COMPLETADO))  // true
}
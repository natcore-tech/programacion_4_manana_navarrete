enum class Estado(val descripcion: String, val esTerminal: Boolean) {
    PENDIENTE  ("Aún no inicia",      false),
    EN_PROCESO ("Siendo procesado",   false),
    COMPLETADO ("Finalizado",         true),
    FALLIDO    ("Ocurrió un error",   true),
    CANCELADO  ("Abortado",           true); // Recuerda el punto y coma

    fun puedeTransicionarA(siguiente: Estado): Boolean = when (this) {
        COMPLETADO, FALLIDO, CANCELADO -> false
        EN_PROCESO -> siguiente == COMPLETADO || siguiente == FALLIDO || siguiente == CANCELADO
        PENDIENTE  -> siguiente == EN_PROCESO || siguiente == CANCELADO
    }
}

fun main() {
    val estado = Estado.EN_PROCESO
    println(estado.descripcion)  
    println(estado.esTerminal)   

    // when exhaustivo
    val icono = when (estado) {
        Estado.PENDIENTE   -> "⏰"
        Estado.EN_PROCESO  -> "⏳"
        Estado.COMPLETADO  -> "✅"
        Estado.FALLIDO     -> "❌"
        Estado.CANCELADO   -> "🚫"
    }
    println(icono) 

    println(estado.puedeTransicionarA(Estado.COMPLETADO)) 
}
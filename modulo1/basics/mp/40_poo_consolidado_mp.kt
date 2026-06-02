sealed class Notificacion(val titulo: String, val mensaje: String) {
    abstract fun formatear(): String

    data class Nota(
        val estudiante: String,
        val materia: String,
        val calificacion: String
    ) : Notificacion(materia, calificacion) {
        override fun formatear() =
            "📘 Registro de nota → $estudiante\n   Materia: $titulo\n   Calificación: $mensaje"
    }

    data class Recuperacion(val estudiante: String, val icono: String = "📝")
        : Notificacion("Recuperación", "") {
        override fun formatear() = "$icono Registro → $estudiante: $titulo"
    }

    data class Observacion(val estudiante: String, val texto: String)
        : Notificacion("Observación", texto) {
        override fun formatear() = "📎 Observación → $estudiante: ${texto.take(160)}"
    }

    object SinRegistro : Notificacion("", "") {
        override fun formatear() = "📭 Sin registro disponible"
    }
}

interface EnviadorNotificacion {
    val nombre: String
    fun enviar(notificacion: Notificacion): Boolean
}

class ServicioEmail : EnviadorNotificacion {
    override val nombre = "Notas"
    override fun enviar(n: Notificacion): Boolean {
        if (n !is Notificacion.Nota) return false
        println("  [REGISTRO] → ${n.estudiante}")
        return true
    }
}

class ServicioPush : EnviadorNotificacion {
    override val nombre = "Seguimiento"
    override fun enviar(n: Notificacion): Boolean {
        if (n !is Notificacion.Recuperacion) return false
        println("  [SEGUIMIENTO] → ${n.estudiante}")
        return true
    }
}

class Dispatcher(private val servicios: List<EnviadorNotificacion>) {

    fun enviar(notificacion: Notificacion) {
        println(notificacion.formatear())
        val exito = servicios.any { it.enviar(notificacion) }
        if (!exito) println("  ⚠️ Sin registro disponible")
        println()
    }
}

fun main() {
    val dispatcher = Dispatcher(listOf(ServicioEmail(), ServicioPush()))

    listOf(
        Notificacion.Nota("Ana", "Matemáticas", "18/20"),
        Notificacion.Recuperacion("Ana"),
        Notificacion.Observacion("Ana", "Entregar corrección de ejercicios"),
        Notificacion.SinRegistro
    ).forEach { dispatcher.enviar(it) }
}
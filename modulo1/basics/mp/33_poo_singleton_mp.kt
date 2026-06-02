object ConfiguracionNotas {
    val institucion: String = "Universidad Central"
    val semestre:    Int    = 2024
    private val codigoAcceso: String = "access-code-5678"

    fun urlAcceso() = "$institucion - Semestre $semestre"
    fun credenciales() = mapOf("Acceso" to codigoAcceso)
}

class Nota private constructor(val id: Int, val asignatura: String, val calificacion: Double) {
    companion object {
        private var contadorId = 0

        fun registrar(asignatura: String, calificacion: Double): Nota? {
            if (asignatura.isBlank() || calificacion < 0.0 || calificacion > 100.0) return null
            return Nota(++contadorId, asignatura.trim(), calificacion)
        }

        const val ESTADO_DEFECTO = "registrada"
    }
}

fun main() {
    println(ConfiguracionNotas.urlAcceso())

    val nota = Nota.registrar("Programacion", 95.5)
    println(nota)
}
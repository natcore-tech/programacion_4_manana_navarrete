class Estudiante(
    val id: Int,
    val nombre: String,
    val nota: Double,
    private val asistencia: Int
) {
    val promedioFinal: Double
        get() = nota * 0.9 + asistencia * 0.1

    val aprobado: Boolean
        get() = promedioFinal >= 6.0

    override fun toString() = "$nombre (${String.format("%.2f", nota)})"
}

fun main() {
    val estudiante = Estudiante(1, "Ana Pérez", 8.5, 12)

    println(estudiante.aprobado)
    println(estudiante.promedioFinal)
}
abstract class RegistroNota(val nombre: String) {
    abstract val nota: Double
    abstract val creditos: Double
    abstract fun descripcion(): String

    fun comparar(otro: RegistroNota): String = when {
        nota > otro.nota -> "$nombre tiene mejor nota que ${otro.nombre}"
        nota < otro.nota -> "$nombre tiene peor nota que ${otro.nombre}"
        else -> "$nombre y ${otro.nombre} tienen la misma nota"
    }

    override fun toString() = "${descripcion()} | Nota: ${"%.2f".format(nota)}"
}

class Parcial(val alumno: String, override val nota: Double) : RegistroNota(alumno) {
    override val creditos: Double get() = 1.0
    override fun descripcion() = "Parcial de $alumno"
}

class Proyecto(val alumno: String, override val nota: Double) : RegistroNota(alumno) {
    override val creditos: Double get() = 2.0
    override fun descripcion() = "Proyecto de $alumno"
}

class ExamenFinal(val alumno: String, override val nota: Double) : RegistroNota(alumno) {
    override val creditos: Double get() = 3.0
    override fun descripcion() = "Examen final de $alumno"
}

fun main() {
    val registros: List<RegistroNota> = listOf(
        Parcial("Ana", 18.5),
        Proyecto("Luis", 16.0),
        ExamenFinal("Marta", 19.2)
    )

    registros.forEach { println(it) }

    val mejor = registros.maxByOrNull { it.nota }
    println("\nMejor nota registrada: ${mejor?.nombre}")

    println(registros[0].comparar(registros[1]))
}
class RegistroNotas(estudiante: String, notaInicial: Double) {

    val estudiante: String = estudiante

    private var nota: Double = notaInicial

    internal val numeroRegistro: String =
        "RN${(100000..999999).random()}"

    protected open fun calcularPromedio(): Double = nota

    fun registrarNota(nuevaNota: Double) {
        require(nuevaNota in 0.0..10.0) { "La nota debe estar entre 0 y 10" }
        nota = nuevaNota
        println("Nota registrada: ${"%.2f".format(nuevaNota)} | Promedio actual: ${consultarPromedio()}")
    }

    fun eliminarNota(): Boolean {
        if (nota == 0.0) {
            println("No se pudo eliminar la nota")
            return false
        }
        nota = 0.0
        println("Nota eliminada | Promedio actual: ${consultarPromedio()}")
        return true
    }

    fun consultarPromedio(): String = "${"%.2f".format(calcularPromedio())}"
}

fun main() {
    val registro = RegistroNotas("Ana García", 8.5)

    registro.registrarNota(9.2)
    registro.eliminarNota()
    registro.registrarNota(10.0)

    println(registro.estudiante)
    println(registro.consultarPromedio())
}
class Usuario(val nombre: String, val notas: List<Double>) {
    val nombreNormalizado: String
    val promedio: Double
    val mejorNota: Double
    val aprobado: Boolean

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        require(notas.isNotEmpty()) { "Debe haber al menos una nota" }
        require(notas.all { it in 0.0..100.0 }) { "Las notas deben estar entre 0 y 100" }

        nombreNormalizado = nombre.trim().lowercase()
        promedio = notas.average()
        mejorNota = notas.maxOrNull() ?: 0.0
        aprobado = promedio >= 60.0
    }
}

fun main() {
    val u = Usuario("  Ana García  ", listOf(85.0, 92.5, 78.0))
    println("Estudiante: ${u.nombreNormalizado}")
    println("Promedio: ${"%.2f".format(u.promedio)}")
    println("Mejor nota: ${u.mejorNota}")
    println(if (u.aprobado) "Estado: Aprobado" else "Estado: Reprobado")
}
class RegistroNotas(nota: Double) {
    var nota: Double = nota
        set(value) {
            require(value in 0.0..100.0) { "La nota debe estar entre 0 y 100" }
            field = value
        }
    val calificacion: String
        get() = when {
            nota < 60  -> "Reprobado"
            nota < 70  -> "Suficiente"
            nota < 80  -> "Bueno"
            nota < 90  -> "Muy bueno"
            else       -> "Excelente"
        }
}

fun main() {
    val registro = RegistroNotas(85.0)
    println("Nota: ${registro.nota}")
    println("Calificación: ${registro.calificacion}")
    registro.nota = 92.0
    println("Nota actualizada: ${registro.nota}")
    println("Calificación: ${registro.calificacion}")
}
class Estudiante(val nombre: String, val matricula: String)

class RegistroNota(var nota: Int = 0) {
    fun incrementar() { nota++ }
    fun resetear() { nota = 0 }
}

class Materia(nombre: String) {
    val nombreUpper = nombre.uppercase()
}
// Sin open — no se puede heredar (protección por defecto)
// class Animal(val nombre: String)
// class Perro : Animal("Rex")  // ERROR — Animal es final

// Con open — la jerarquía está diseñada para ello
open class Registro(val nombre: String, val nota: String) {
    open fun hacerSonido() = println("$nombre: nota $nota")
    open fun descripcion() = "Alumno $nombre"
    fun respirar() = println("Registro de $nombre actualizado")
}

class Estudiante(nombre: String) : Registro(nombre, "A") {
    override fun hacerSonido() {
        super.hacerSonido()
        println("Estado: aprobado")
    }
    override fun descripcion() = "${super.descripcion()}, estudiante"
}

class EstudianteInterno(nombre: String, val presencial: Boolean) : Registro(nombre, "B") {
    override fun descripcion() =
        "${super.descripcion()}, ${if (presencial) "presencial" else "a distancia"}"
}

fun main() {
    val estudiante = Estudiante("Rex")
    estudiante.hacerSonido()

    val estudiante2 = EstudianteInterno("Misi", true)
    println(estudiante2.descripcion())

    estudiante.respirar()
}
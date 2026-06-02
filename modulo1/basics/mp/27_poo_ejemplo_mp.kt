// El constructor primario integra la declaración de propiedades
class Estudiante(val nombre: String, val nota: Int)

class Estudiante2(val nombre: String, val nota: Int) {
    fun presentarse() = "Estudiante $nombre tiene nota $nota"
    fun esMayorDeEdad() = nota >= 60
}

fun main() {
    val s = Estudiante("Ana", 85)
    println(s.nombre)
    println(s.nota)

    val s2 = Estudiante2("Luis", 55)
    println(s2.presentarse())
    println(s2.esMayorDeEdad())
}
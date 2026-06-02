data class Nota(
    val id:       Int,
    val nombre:   String,
    val nota:     Double,
    val materia:  String,
    val aprobado: Boolean = true
)

fun main() {
    val n1 = Nota(1, "María López", 8.5, "Matemáticas")
    val n2 = Nota(1, "María López", 8.5, "Matemáticas")
    val n3 = Nota(2, "Juan Pérez",  5.0, "Historia")
    println(n1)
    println(n1 == n2)
    println(n1 == n3)
    val recuperacion = n1.copy(nota = 6.0)
    val reprobado     = n3.copy(aprobado = false)
    val (id, nombre, nota) = n1
    println("$id: $nombre — nota: $nota")
    listOf(n1, n3).forEach { (id2, nombre2, nota2) ->
        println("[$id2] $nombre2: $nota2")
    }
}
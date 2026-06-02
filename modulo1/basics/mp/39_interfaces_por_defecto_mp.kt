interface Serializable {
    val id: String                    // abstracta — debe implementarse
    fun serializar(): String          // abstracta — debe implementarse
    val version: Int get() = 1        // con default — puede sobreescribirse
}

interface Validable {
    val errores: List<String>
    val esValido: Boolean get() = errores.isEmpty()

    fun validar(): Boolean
    fun imprimirErrores() {
        if (errores.isEmpty()) println("Sin errores de registro")
        else errores.forEach { println("- Error: $it") }
    }
}

// POLIMORFISMO: Pedido puede usarse donde se espere Serializable O Validable
data class RegistroNota(
    override val id: String,
    val alumno: String,
    val notas: List<Double>
) : Serializable, Validable {

    override fun serializar() =
        "$id|$alumno|${notas.joinToString(",")}|${if (notas.isEmpty()) 0.0 else notas.average()}"

    override val errores: List<String> get() = buildList {
        if (alumno.isBlank()) add("El nombre del alumno no puede estar vacío")
        if (notas.isEmpty()) add("Debe registrar al menos una nota")
        if (notas.any { it < 0.0 || it > 10.0 }) add("Las notas deben estar entre 0.0 y 10.0")
    }

    override fun validar() = esValido
}

fun main() {
    val registro1 = RegistroNota("R001", "Ana", listOf(8.5, 9.0, 7.0))
    val registro2 = RegistroNota("R002", "",    emptyList())

    // Polimorfismo por interfaz
    fun procesarSerializable(s: Serializable) = println("Serializado: ${s.serializar()}")
    fun procesarValidable(v: Validable) {
        println("Estado válido: ${v.esValido}")
        v.imprimirErrores()
    }

    procesarSerializable(registro1)
    procesarValidable(registro1)
    procesarValidable(registro2)
}
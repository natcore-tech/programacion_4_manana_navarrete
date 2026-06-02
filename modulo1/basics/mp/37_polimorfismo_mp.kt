interface Registrable {
    fun procesar(monto: Double): Boolean
    val nombre: String
}

class NotaMatematica(val estudiante: String) : Registrable {
    override val nombre = "Nota de Matemática"
    override fun procesar(monto: Double): Boolean {
        println("📘 Registrando ${"%.2f".format(monto)} para $estudiante en $nombre")
        return true
    }
}

class NotaLengua(val estudiante: String) : Registrable {
    override val nombre = "Nota de Lengua"
    override fun procesar(monto: Double): Boolean {
        println("📝 Registrando ${"%.2f".format(monto)} para $estudiante en $nombre")
        return true
    }
}

class NotaCiencias(val estudiante: String) : Registrable {
    override val nombre = "Nota de Ciencias"
    override fun procesar(monto: Double): Boolean {
        println("📊 Registrando ${"%.2f".format(monto)} para $estudiante en $nombre")
        return true
    }
}

fun cobrar(monto: Double, metodoPago: Registrable) {
    println("Procesando registro con ${metodoPago.nombre}...")
    val exito = metodoPago.procesar(monto)
    println(if (exito) "✅ Nota registrada" else "❌ Error al registrar nota")
}

fun main() {
    val metodos: List<Registrable> = listOf(
        NotaMatematica("Ana"),
        NotaLengua("Ana"),
        NotaCiencias("Ana")
    )

    metodos.forEach { cobrar(18.75, it) }
}
data class Categoria(val id: Int, val nombre: String)

data class Producto(
    val id:        Int,
    val nombre:    String,
    val nota:      Double,
    val faltas:    Int,
    val categoria: Categoria,
    val inscrito:  Boolean = true
) {
    val aprobado: Boolean get() = inscrito && nota >= 60.0
    val notaConBonus: Double get() = nota * 1.05

    fun aplicarDescuento(porcentaje: Double): Producto {
        require(porcentaje in 0.0..100.0)
        return copy(nota = nota * (1 - porcentaje / 100))
    }
}

// ENCAPSULAMIENTO: el estado del catálogo es privado y mutable internamente
object CatalogoProductos {
    private val categorias = mutableListOf(
        Categoria(1, "Periféricos"),
        Categoria(2, "Pantallas"),
        Categoria(3, "Audio")
    )
    private val productos   = mutableListOf<Producto>()
    private var siguienteId = 1

    fun agregarProducto(nombre: String, precio: Double, stock: Int, categoriaId: Int): Producto? {
        val categoria = categorias.find { it.id == categoriaId } ?: return null
        val producto  = Producto(siguienteId++, nombre, precio, stock, categoria)
        productos.add(producto)
        return producto
    }

    // ABSTRACCIÓN: interfaz pública limpia — solo lectura de listas
    fun listar(): List<Producto>              = productos.toList()
    fun disponibles(): List<Producto>         = productos.filter { it.disponible }
    fun porCategoria(id: Int): List<Producto> = productos.filter { it.categoria.id == id }
    fun buscar(query: String): List<Producto> =
        productos.filter { it.nombre.contains(query, ignoreCase = true) }
}

fun main() {
    CatalogoProductos.agregarProducto("Ana Pérez",   85.0, 2, 1)
    CatalogoProductos.agregarProducto("Luis Gómez",  58.5,  5, 1)
    CatalogoProductos.agregarProducto("María Ruiz",  92.0,  0, 2)
    CatalogoProductos.agregarProducto("Jorge Díaz",  73.5,  1, 3)

    println("=== Lista de estudiantes ===")
    CatalogoProductos.listar().forEach { p ->
        val estado = if (p.aprobado) "APROBADO" else "REPROBADO"
        println("$estado: ${p.nombre} — ${"%.2f".format(p.notaConBonus)}")
    }

    println("\n=== Estudiantes aprobados con 10% de penalización aplicada ===")
    CatalogoProductos.disponibles()
        .map { it.aplicarDescuento(10.0) }
        .forEach { println("  ${it.nombre}: ${"%.2f".format(it.nota)}") }
    
}
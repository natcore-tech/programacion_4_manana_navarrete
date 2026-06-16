fun main() {
    val totalNotas = 6
    var sumaNotas = 0.0
    var contadorAprobadas = 0

    repeat(totalNotas) { i ->
        print("Nota ${i + 1}: ")
        val nota = readLine()?.toDoubleOrNull() ?: 0.0
        
        sumaNotas += nota

        if (nota >= 6.0) {
            contadorAprobadas++
        }
    }

    val promedio = sumaNotas / totalNotas

    println("\nPromedio: ${"%.1f".format(promedio)}")

    if (contadorAprobadas > 4) {
        println("Desempeño satisfactorio.")
    } else {
        println("Desempeño insatisfactorio.")
    }
}
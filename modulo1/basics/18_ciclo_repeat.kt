fun main() {
    val totalMediciones = 6
    var sumaTemperaturas = 0.0
    var contadorFiebre = 0

    repeat(totalMediciones) { i ->
        print("Medicion ${i + 1} (C): ")
        val temp = readLine()?.toDoubleOrNull() ?: 0.0
        
        sumaTemperaturas += temp

        if (temp > 38.5) {
            contadorFiebre++
        }
    }

    val promedio = sumaTemperaturas / totalMediciones

    println("\nPromedio: ${"%.1f".format(promedio)}°C")

    if (contadorFiebre > 2) {
        println("Alerta: Hubo fiebre sostenida.")
    } else {
        println("Paciente sin fiebre sostenida.")
    }
}
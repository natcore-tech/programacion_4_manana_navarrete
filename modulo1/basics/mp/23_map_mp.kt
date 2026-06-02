fun main() {
    println("Registro de Notas - Inmutable")
    val notasEstudiantes = mapOf(
        "Juan" to 85,
        "Maria" to 92,
        "Carlos" to 78,
        "Ana" to 95
    )
    println(notasEstudiantes["Juan"])
    println(notasEstudiantes["Pedro"])
    println(notasEstudiantes.getOrDefault("Juan", 0))
    println(notasEstudiantes.getOrDefault("Pedro", 0))
    println(notasEstudiantes)
    println(notasEstudiantes.keys)
    println(notasEstudiantes.values)
    println(notasEstudiantes.entries)
    for((estudiante, nota)in notasEstudiantes){
        println("$estudiante obtuvo: $nota")
    }
    
    println("Registro de Notas - Mutable")
    val calificaciones = mutableMapOf(
        "Matematicas" to 88,
        "Historia" to 76,
        "Ciencias" to 91,
        "Educacion" to 85
    )    
    calificaciones["Ingles"]=79
    println(calificaciones)
    calificaciones["Matematicas"]=95
    println(calificaciones)
    calificaciones.remove("Educacion")
    println(calificaciones)
    calificaciones.getOrPut("Literatura"){82}
    println(calificaciones)
    calificaciones.getOrPut("Ciencias"){82}
    println(calificaciones)
    
    
    
    

  }

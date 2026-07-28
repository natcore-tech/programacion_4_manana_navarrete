fun main() {
    val nombre="Lucas"
    val apellido="Bravo"
    val edad=18
    
    //variable simple
    println("Hola $nombre")
    
    //Expresion
    println("Nombre Completo Registrado: ${nombre.lowercase()} ${apellido.uppercase()}")
    val nombreCompleto="Nombre Completo Mostrado: ${nombre.uppercase()} ${apellido.uppercase()}"
    println(nombreCompleto)
    println("Edad : ${edad+6}")
    
    //String Multilinea
    val tarjeta="""
    	|Nombre: $nombre $apellido
        |Edad: $edad
        |Acceso: ${if(edad<=18)"Permitido" else "Denegado"}
    
    """.trimMargin()
    
    println(tarjeta)
    
}
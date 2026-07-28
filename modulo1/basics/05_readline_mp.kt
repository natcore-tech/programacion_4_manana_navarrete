fun main() {
    
    //readline
    println("Escribe tu nombre para registrar: ")
	val nombre=readLine()
    println("Nombre incluido en el sistema: $nombre")
    
    println("Escribe apellido para registrar: ")
	val apellido=readLine() ?: "anonimo"
    println("Apellido incluido en el sistema: $apellido")
    
    
}
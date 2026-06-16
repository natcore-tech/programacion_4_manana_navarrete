
fun main() {
    // No Mutable
    val nombre="Mauricio Rosero"
    val edad: Int=17
    val pi=3.14159
    
    //Mutable
    var contador=0
    contador=contador+1
    println(contador)
    contador=contador-1
    println(contador)
    
    println("La edad del estudiante $nombre es de $edad años")
    println("El estudiante $nombre respondio correctamente sobre el valor de pi $pi")
    
}
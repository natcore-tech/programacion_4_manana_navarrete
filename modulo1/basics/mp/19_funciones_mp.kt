
fun main() {
  println("Sistema de Registro de Notas")
  val mensaje = saludo()
  println("$mensaje")
 
 val notaTotal: Int = sumar(85, 90)
 println("Nota total: $notaTotal")
 println("Nota ajustada: ${restarTipoExpresion(100, 15)}")
 println("Diferencia de notas: ${restarTipoExpresion(95, 80)}")
 println("Resta inferida: ${restarTipoInferido(88, 12)}")
 saludar("Juan")
}

fun saludo(): String{
    return "Hello"
}

fun sumar(a: Int, b: Int): Int{
    return a+b
}

// tipo expresion
fun restarTipoExpresion(a: Int, b: Int)=a-b
//inferido
fun restarTipoInferido(a: Int, b: Int)=a-b
fun saludar(nombre: String){
    println("Hola $nombre")
}
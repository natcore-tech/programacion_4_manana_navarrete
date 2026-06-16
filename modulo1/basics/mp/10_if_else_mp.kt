

fun main() {
  println("Sistema de Registro de Notas")
  println("Condicional If - else")
  println("Aprobó el curso s/n: ")
  val aprobo=readLine()?.trim()?.lowercase()=="s"
  println("Nota Final: ")
  val notaFinal=readLine()?.toDoubleOrNull()?:0.0
  if(aprobo){
    val calificacion=notaFinal*1.10    
    println("Nota ajustada: ${"%.2f".format(calificacion)}")
  } else {
      println("Nota registrada: ${"%.2f".format(notaFinal)}")
  }
}
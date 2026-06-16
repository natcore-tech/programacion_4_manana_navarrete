

fun main() {
  println("Sistema de Registro de Notas")
  println("Ingrese la nota del estudiante")
  println("Nota (0-100)")
  val nota=readLine()?.toIntOrNull()?:0
  
  val clasificacion= if(nota<=60){
      "Reprobado"
  } else if(nota<=70){
      "Aprobado"
  } else if(nota<=80){
      "Bueno"
  } else if(nota<=90){
      "Muy Bueno"
  } else if(nota<=100){
      "Excelente"
  } else {
      "Nota invalida"
  }
  
  println("Calificacion: $clasificacion")
}
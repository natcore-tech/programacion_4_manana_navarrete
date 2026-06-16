
fun main() {
  println("Controles de Flujo")
  println("Condicional If")
  println("Incluir nota (0-100): ")
  val nota=readLine()?.toDoubleOrNull()?: 0.0
  if(nota>=70.0){
      println("Aprobado: estudiante ha cumplido los requisitos")
  }
  if(nota>=90.0){
      println("Excelente: desempeño sobresaliente del estudiante")
  }
  println("Nota registrada: $nota puntos")
}
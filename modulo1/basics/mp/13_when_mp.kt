

fun main() {
  println("Sistema de Registro de Notas")
  println("Ingrese la nota (0-100): ")
  val nota=readLine()?.toIntOrNull()?:0
  val calificacion = when(nota){
      in 90..100->"A"
      in 80..89->"B"
      in 70..79->"C"
      in 60..69->"D"
      in 0..59->"F"
      else -> "Nota no valida"
  }
  println("Calificacion: $calificacion")
}

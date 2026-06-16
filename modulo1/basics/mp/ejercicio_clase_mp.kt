

fun main() {
  println("Sistema de registro de notas")
  println("Nombre del estudiante: ")
  val estudiante = readLine()

  println("Nota del estudiante: ")
  val nota = readLine()?.toDoubleOrNull() ?: 0.0

  if (nota >= 0.0 && nota <= 100.0) {
      println("Estudiante: $estudiante")
      println("Nota registrada: $nota")
      if (nota >= 60.0) {
          println("Estado: Aprobado")
      } else {
          println("Estado: Reprobado")
      }
  } else {
      println("Nota invalida")
  }
}

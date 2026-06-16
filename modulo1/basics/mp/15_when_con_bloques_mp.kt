

fun main() {
  println("Sistema de Registro de Notas")
  println("Ingrese nombre del estudiante")
  val nombreEstudiante=readLine()?.trim()?.lowercase()?:"Sin Identificacion"
  println("Ingrese la calificación (EXCELENTE/BUENO/REGULAR/BAJO)")
  val calificacion=readLine()?.trim()?.uppercase()?:""


  when (calificacion){
      "EXCELENTE"->{
          println("EXCELENTE: Estudiante: $nombreEstudiante")
          println("Felicidades, desempeño sobresaliente")
          println("Continúa con este excelente trabajo")
      }
      "BUENO"->{
          println("BUENO: Estudiante: $nombreEstudiante")
          println("Buen desempeño académico")
          println("Mantén el esfuerzo para mejorar")
      }
      "REGULAR"->println("REGULAR: Estudiante: $nombreEstudiante necesita mejorar")
      "BAJO"->println("BAJO: Estudiante: $nombreEstudiante requiere atención especial")
      else -> println("Calificación no reconocida")
  }
}

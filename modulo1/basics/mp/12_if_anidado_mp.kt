

fun main() {
  println("Registro de Notas")
  println("Ingreso de Calificaciones")
  println("Nombre del estudiante?")
  val tieneAntecedentes=readLine()?.trim()?.lowercase()?:0
  println("Nota (0-100)")
  val frecuencia=readLine()?.toIntOrNull()?:0
  
  if(tieneAntecedentes){
      println("Estudiante registrado")
      if(frecuencia<50){
        println("Reprobado")
      } else if(frecuencia>85){
          println("Sobresaliente")
      } else {
        println("Aprobado")
      }
      
    } else {
      println("Estudiante no registrado")
      if(frecuencia<50 || frecuencia > 100){
        println("Nota fuera de rango")
      } else {
        println("Nota aceptable")
      }
  
    }
}
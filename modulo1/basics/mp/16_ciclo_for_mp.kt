

fun main() {
  println("Sistema de registro de notas")
  
  println("Recorrido de notas con rango")
  for( i in 1..5){
     val a=5
      println("Nota $i: ${i*a}")
  }
  
  println("Recorrido de notas con until")
  for( i in 1 until 5){
      println("Nota $i")
  }
  
  println("Recorrido de notas con pasos")
  for( i in 1..5 step 2){
      println("Nota $i")
  }
  
  println("Recorrido de notas descendente")
  for( i in 10 downTo 1){
      println("Nota $i")
  }
  
  println("Listado de estudiantes")
  val nombres=listOf("Maria","Juan","Jose")
  for( nombre in nombres ){
      println("Estudiante: $nombre")
  }
  
  println("Listado de estudiantes con indice")
  for((index,valor) in nombres.withIndex()){
      println("$index -> Estudiante: $valor")
  }
  
  println("Registro de notas con corte")
  for(i in 1..10){
      if(i==5){
          break;
      }
  }
  
  println("Registro de notas con omision")
  for(i in 1..10){
      if(i==3){
          continue;
      }
    println("Nota registrada $i")  
  }
  
  println("Registro de notas con omision y corte")
  for(i in 1..10){
      if(i==3) continue;
      if(i==7) break;
    println("Nota registrada $i")  
  }
  
  val pacientes=listOf(
    Triple("Garcia, M", 17.2, 98),
    Triple("Andres, Z", 19.1, 94),
    Triple("Torres, R", 14.3, 91),
  )
  for ((posicion, paciente) in pacientes.withIndex()){
      val (nombre, temperatura, spo2) = paciente
      val estadoNota = if(temperatura>=18.0) "Aprobado" else "Desaprobado"
      val estadoAsistencia = if(spo2<95.0) "Baja" else "Normal"
      println("Registro $posicion - $nombre - Nota: $temperatura - Estado: $estadoNota - Asistencia: $spo2 $estadoAsistencia")
  }



}

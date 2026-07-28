

fun main() {
  println("Controles de Flujo")
  println("Condicional If - Anidado")
  println("Consulta: ")
  val consulta=readLine()
  
  
  
  if(consulta=="agendada"){
      println("Estado: Agendado")
     
  } else if (consulta=="en curso"){
          println("Tiempo")
          val frecuencia=readLine()?.toIntOrNull()?:30
        if (frecuencia==30){
            println("Estado: Consulta Extentdida")
        }
  } else if (consulta=="finalizada"){
      println("Estado: Finalizada")
}
}

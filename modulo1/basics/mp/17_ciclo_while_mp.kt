

fun main() {
    println("Sistema de Registro de Notas")
  
 print("Registro de Alumnos (Do While)")
  var contador = 1
  do {
      println(contador)
      contador++;
  }while(contador <= 5)
  
    println("Procesamiento de Notas (Break/Continue)")
  while(contador <= 10){
      contador ++;
      if(contador==3) continue
      if(contador==7) break
      println(contador)
  }
  
  var input: String
  while(true){
    println("Ingrese nota o 'salir' para finalizar: ")
      input=readLine()?:""
      if (input=="salir") break
    println("Nota registrada: $input")
  }
}

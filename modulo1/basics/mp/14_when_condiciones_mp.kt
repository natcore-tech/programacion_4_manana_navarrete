

fun main() {
  println("Sistema de registro de notas")
  println("Nota obtenida: ")
  val nota=readLine()?.toIntOrNull()?:0
  println("Es examen recuperatorio (s/n): ")
  val recuperatorio=readLine()?.trim()?.lowercase()=="s"
  val tipoRecuperatorio= if(recuperatorio){
      println("Tipo de recuperatorio (PARCIAL/FINAL/ORAL): ")
      readLine()?.trim()?.uppercase()?:""
  } else ""
  val notaFinal = when{
      !recuperatorio && nota <50 -> 0.0
      !recuperatorio && nota >=90 -> 100.0
      !recuperatorio -> nota.toDouble()
      tipoRecuperatorio=="PARCIAL"-> (nota + 10).coerceAtMost(100).toDouble()
      tipoRecuperatorio=="FINAL"-> (nota + 20).coerceAtMost(100).toDouble()
      tipoRecuperatorio=="ORAL"-> (nota + 5).coerceAtMost(100).toDouble()
      else -> nota.toDouble()
  }
  println("Nota final: ${"%.2f".format(notaFinal)}")
}

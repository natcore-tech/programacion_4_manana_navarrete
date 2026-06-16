fun main() {
  println("Sistema de registro de notas")
  println("Transformación de notas")
  val numeros = listOf(50,62,75,88,91,45,70,100,83,59)
    println(numeros)
    val cuadrados= numeros.map{it*it}
    println(cuadrados)
  val numerosTexto= numeros.map{"Nota $it"}
    println(numerosTexto)
    
  println("Filtrado de notas")
    val pares=numeros.filter{it % 2 == 0 }
    println(pares)
  val mayores5=numeros.filter{it > 70 }
    println(mayores5)
  val paresYMayores5=numeros.filter{it % 2 == 0 && it > 70 }
    println(paresYMayores5)
    val impares=numeros.filterNot{it % 2 == 0 }
    println(impares)
    
    val mezcla=listOf(1,"Hola", 2, "Mundo", true, 42)
    val soloStrings=mezcla.filterIsInstance<String>()
    println(soloStrings)
    
    println("Cálculo acumulado")
    val numerosReduce = listOf(1,2,3,4,5)
    val suma = numerosReduce.reduce {acc, n -> acc + n}
    println(suma)
    val producto = numerosReduce.reduce {acc, n -> acc * n}
    println(producto)
    println("Acumulación con valor inicial")
    val sumaFold = numerosReduce.fold(100) {acc, n -> acc + n}
    println(sumaFold)
    val productoFold = numerosReduce.fold(100) {acc, n -> acc * n}
    println(productoFold)
    
    println("Orden de calificaciones")
    println("Ascendente : ${numeros.sorted()}" )
    println("Descendente : ${numeros.sortedDescending()}" )
    println("Ordenar por : ${numeros.sortedBy{-it}}" )
    println("Resumen académico")
    println("Suma total : ${numeros.sum()}" )
    println("Promedio general : ${numeros.average()}" )
    println("Nota mínima : ${numeros.min()}" )
    println("Nota máxima : ${numeros.max()}" )
    println("Cantidad aprobadas : ${numeros.count {it >70}}" )
    
    println("Búsqueda de registros")
    println("Primera aprobada : ${numeros.find {it >70}}" )
    println("Última aprobada : ${numeros.findLast {it >70}}" )
    println("Existe aprobada : ${numeros.any {it >70}}" )
    println("Todas positivas : ${numeros.all {it >0}}" )
    println("Ninguna sobresaliente : ${numeros.none {it >95}}" )

  }

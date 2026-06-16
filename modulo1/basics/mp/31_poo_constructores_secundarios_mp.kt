class Rectangulo(val ancho: Double, val alto: Double) {
    val promedio: Double get() = (ancho + alto) / 2
    val total: Double get() = ancho + alto

    constructor(lado: Double) : this(lado, lado)
    constructor(ancho: Int, alto: Int) : this(ancho.toDouble(), alto.toDouble())

    override fun toString() = "RegistroNotas(n1=${ancho}, n2=${alto}) | promedio=${promedio} | total=${total}"
}

fun main() {
    val r1 = Rectangulo(5.0, 3.0)
    val r2 = Rectangulo(4.0)        // cuadrado
    val r3 = Rectangulo(6, 2)       // con Int

    println("Alumno 1: $r1")
    println("Alumno 2: $r2")
}
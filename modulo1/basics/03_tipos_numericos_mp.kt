fun main() {
    println("Tipos de Datos que se registran en el Sistema de Notas")
    println("Numeros Enteros")
    val numero1: Byte=124
    println("Codigo de materia $numero1")
    val numero2: Short=25_347
    println("Numero de tareas completadas $numero2")
    val numero3: Int=23
    println("Numero de tareas por completar $numero3")
    val numero4: Long=12_111_133_144_123_122L
    println("Codigo unico de estudiante $numero4")
    val numero5: Float=4.56f
    println("Registro de examenes $numero5")
    val numero6: Double=5.625525
    println("Puntuacion detallada del estudiante $numero6")
    
    
    //Inferido
    val nombre="Alisson Montenegro"
    val edad=16
    
    println("Nombre $nombre")
    val nombreTipo=nombre::class.simpleName
    println("Tipo inferido registrado: ${nombre::class.simpleName}")
    println("Tipo inferido registrado: $nombreTipo")
    
    println("Edad $edad")
    val edadTipo=nombre::class.simpleName
    println("Tipo inferido registrado : ${edad::class.simpleName}")
    println("Tipo inferido registrado: $edadTipo")
    
    
}
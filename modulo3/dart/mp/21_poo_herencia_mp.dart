// Clase base — comportamiento y datos comunes
class Estudiante {
  final String nombre;
  final double promedio;

  Estudiante(this.nombre, this.promedio);

  String hacerSonido() => '...';

  void presentarse() {
    print('Estudiante $nombre tiene promedio $promedio y estado: ${hacerSonido()}');
  }
}

// HERENCIA: Perro y Gato reutilizan Animal y lo especializan
class AlumnoRegular extends Estudiante {
  AlumnoRegular(super.nombre, super.promedio);

  @override
  String hacerSonido() => promedio >= 3.0 ? 'Aprobado' : 'Reprobado';

  void buscarPelota() => print('$nombre registró una nueva nota.');
}

class AlumnoHonores extends Estudiante {
  AlumnoHonores(super.nombre, super.promedio);

  @override
  String hacerSonido() => promedio >= 4.5 ? 'Sobresaliente' : 'En buen camino';

  void trepar() => print('$nombre solicitó revisión de calificación.');
}

void main() {
  final alumno1 = AlumnoRegular('Rex', 3.2);
  final alumno2 = AlumnoHonores('Misu', 4.8);

  alumno1.presentarse();
  alumno2.presentarse();

  alumno1.buscarPelota();
  alumno2.trepar();
}
void main() {
  int registrados = 0;
  int capacidad = 10;
  final List<Student> registro = [];

  while (capacidad > 0) {
    final nombre = 'Alumno ${registrados + 1}';
    final nota = 5.0 + (registrados % 6) * 0.8;
    registrados++;
    capacidad--;
    registro.add(Student(nombre, nota));
    print('Registrado: $nombre - Nota: ${nota.toStringAsFixed(1)} (restantes: $capacidad)');
  }

  int reintentos = 0;
  bool cierreCompleto = false;

  do {
    reintentos++;
    print('Cierre de actas: intento #$reintentos');
    if (reintentos == 2) cierreCompleto = true;
  } while (!cierreCompleto && reintentos < 4);

  print(cierreCompleto
      ? 'Actas cerradas tras $reintentos intentos. Total registros: ${registro.length}'
      : 'No se pudo cerrar las actas');
}

class Student {
  final String name;
  final double grade;
  Student(this.name, this.grade);
}
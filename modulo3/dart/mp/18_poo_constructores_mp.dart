class RegistroNotas {
  final String alumno;
  final String asignatura;
  final double nota;
  final bool aprobada;

  RegistroNotas({
    required this.alumno,
    required this.asignatura,
    required this.nota,
    this.aprobada = false,
  });

  RegistroNotas.ejemplo()
      : alumno = 'Estudiante Ejemplo',
        asignatura = 'Matemáticas',
        nota = 5.0,
        aprobada = true;

  RegistroNotas.finalExam({required this.alumno, required this.asignatura})
      : nota = 10.0,
        aprobada = true;

  factory RegistroNotas.desdeCsv(String csv) {
    final parts = csv.split(',');
    final alumno = parts.length > 0 ? parts[0].trim() : 'Desconocido';
    final asignatura = parts.length > 1 ? parts[1].trim() : 'SinAsignatura';
    final nota = parts.length > 2 ? double.tryParse(parts[2].trim()) ?? 0.0 : 0.0;
    return RegistroNotas(alumno: alumno, asignatura: asignatura, nota: nota, aprobada: nota >= 6.0);
  }

  @override
  String toString() => '$alumno - $asignatura: ${nota.toStringAsFixed(1)} (${aprobada ? "Aprobado" : "Reprobado"})';
}

void main() {
  final r1 = RegistroNotas(alumno: 'Ana', asignatura: 'Historia', nota: 7.5);
  final r2 = RegistroNotas.ejemplo();
  final r3 = RegistroNotas.finalExam(alumno: 'Luis', asignatura: 'Física');
  final r4 = RegistroNotas.desdeCsv('María,Química,4.3');

  print(r1);
  print(r2);
  print(r3);
  print(r4);
}
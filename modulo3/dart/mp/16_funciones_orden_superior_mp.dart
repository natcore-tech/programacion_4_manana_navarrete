void main() {
  final notas = [6.5, 8.0, 4.7, 9.8];

  final notasCurvadas = notas.map((n) => (n * 1.05));
  print('Notas con curvatura: ${notasCurvadas.toList()}');

  final alumnos = ['A001', 'A002', 'A003'];
  final perfiles = alumnos.map((id) => 'https://registro.universidad.edu/alumno/$id');
  print('Perfiles de alumnos: ${perfiles.toList()}');

  final parciales = [6.0, 7.5, 4.0, 8.2, 5.5, 3.9];

  final aprobados = parciales.where((p) => p >= 5.0);
  print('Aprobados: ${aprobados.toList()}');

  final enRecuperacion = parciales.where((p) => p >= 4.0 && p < 5.0);
  print('Recuperación: ${enRecuperacion.toList()}');

  final evaluaciones = [6.0, 7.0, 5.5, 9.0, 4.5];

  final suma = evaluaciones.reduce((acum, e) => acum + e);
  print('Suma de evaluaciones: ${suma.toStringAsFixed(2)}');

  final sumaFold = evaluaciones.fold(0.0, (acum, e) => acum + e);
  print('Suma (fold): ${sumaFold.toStringAsFixed(2)}');

  final mejorNota = evaluaciones.reduce((a, b) => a > b ? a : b);
  print('Mejor nota: $mejorNota');
}
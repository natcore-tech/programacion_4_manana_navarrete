void main() {
  final estudiante = 'Ana';
  final notas = [7.5, 8.0, 6.0];

  print('Registro de notas de $estudiante');

  final promedio = notas.reduce((a, b) => a + b) / notas.length;

  final reporte = '''
Estudiante: $estudiante
Notas:      ${notas.join(', ')}
Promedio:   ${promedio.toStringAsFixed(2)}
Estado:     ${promedio >= 6.0 ? 'Aprobado' : 'Reprobado'}
''';

  print(reporte);

  final curso = r'Curso: Programación 4 - Módulo 3';
  print(curso);

  final saludo = 'Buenas, ' + estudiante + '!';
  print(saludo);

  print(estudiante.toUpperCase());
  print('  ${estudiante}  '.trim());
  print('Notas válidas: ${notas.every((n) => n >= 0 && n <= 10)}');
}

void main() {
  final estudiantes = ['Ana', 'Luis', 'María', 'Carlos', 'Sofía'];

  for (final estudiante in estudiantes) {
    print('Alumno: $estudiante');
  }

  estudiantes.forEach((e) => print(e.toLowerCase()));

  final notas = {'Ana': 9.5, 'Luis': 7.0, 'María': 8.2, 'Carlos': 6.5};
  for (final entrada in notas.entries) {
    print('Alumno ${entrada.key} tiene nota ${entrada.value}');
  }

  for (final letra in 'Promedio'.split('')) {
    print(letra);
  }
}
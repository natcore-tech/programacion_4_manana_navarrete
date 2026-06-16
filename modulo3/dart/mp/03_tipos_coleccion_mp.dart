void main() {
  List<String> estudiantes = ['Ana', 'Luis', 'María'];
  Map<String, List<double>> registroNotas = {
    'Ana': [8.5, 9.0],
    'Luis': [7.0, 6.5],
    'María': [10.0]
  };

  estudiantes.add('Carlos');
  registroNotas['Carlos'] = [9.0, 8.0];

  Set<String> asignaturas = {'Matemáticas', 'Física', 'Química'};
  asignaturas.add('Matemáticas');

  var todasNotas = [...registroNotas.values.expand((l) => l)];

  bool incluirFinal = true;
  var reportes = [
    for (var est in estudiantes)
      {
        'nombre': est,
        'notas': registroNotas[est] ?? [],
        if (incluirFinal) 'promedio': ((registroNotas[est] ?? []).fold(0.0, (a, b) => a + b) / ((registroNotas[est] ?? []).isEmpty ? 1 : (registroNotas[est] ?? []).length))
      }
  ];

  print('Asignaturas: ${asignaturas.length}');
  print('Total de notas registradas: ${todasNotas.length}');
  for (var r in reportes) {
    print('${r['nombre']}: notas=${r['notas']}, promedio=${r['promedio']}');
  }
}
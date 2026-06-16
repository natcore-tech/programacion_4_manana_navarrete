void main() {
  String? alumno = 'Natalia';
  double nota = 18.5;

  if (nota >= 18) {
    print('Alumno: $alumno');
    print('Nota registrada: $nota');
    print('Estado: Aprobado con excelencia');
  } else if (nota >= 14) {
    print('Alumno: $alumno');
    print('Nota registrada: $nota');
    print('Estado: Aprobado');
  } else if (nota >= 11) {
    print('Alumno: $alumno');
    print('Nota registrada: $nota');
    print('Estado: En recuperación');
  } else {
    print('Alumno: $alumno');
    print('Nota registrada: $nota');
    print('Estado: Desaprobado');
  }

  String resultado = nota >= 14 ? 'Aprobado' : 'Desaprobado';
  print(resultado);

  String? curso;
  String detalleCurso = curso != null ? curso.toUpperCase() : 'Sin curso asignado';

  String detalleCurso2 = curso?.toUpperCase() ?? 'Sin curso asignado';
  print(detalleCurso2);
}


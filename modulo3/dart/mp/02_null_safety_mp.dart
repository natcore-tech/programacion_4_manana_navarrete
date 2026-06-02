void main() {
  String estudiante = 'Ana';

  String? curso = null;
  curso = 'Matemáticas';

  double? nota;

  print(nota?.toString());

  String notaTexto = nota?.toString() ?? 'Sin nota'
  ;
  print('Estado de la nota: $notaTexto');

  nota = 8.5;
  double notaSegura = nota!;

  if (curso != null) {
    print('Curso: ${curso.length} caracteres');
  }

  late String registroId;
  registroId = 'REG-2026-0001';
  print('Registro: $registroId - Nota: $notaSegura');
}
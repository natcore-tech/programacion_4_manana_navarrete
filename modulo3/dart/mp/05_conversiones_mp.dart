class Nota {
  final String estudiante;
  final int evaluacion;
  final double promedio;

  Nota(this.estudiante, this.evaluacion, this.promedio);
}

void main() {
  int evaluacion = 18;
  double promedio = evaluacion.toDouble();
  String registro = evaluacion.toString();

  int notaEntera = int.parse('16');
  double notaDecimal = double.parse('17.5');

  int? notaInvalida = int.tryParse('abc');
  double? notaOpcional = double.tryParse('19');

  Object valor = 'Matematica';
  if (valor is String) {
    print('Curso: ${valor.toUpperCase()}');
  }

  Object obj = 'Registro listo';
  String mensaje = obj as String;

  String? observacion = null;
  int longitud = observacion?.length ?? 0;

  Nota nota = Nota('Nat', notaEntera, notaDecimal);

  print('Estudiante: ${nota.estudiante}');
  print('Evaluacion: ${nota.evaluacion}');
  print('Promedio: ${nota.promedio}');
  print('Registro: $registro');
  print('Nota invalida: $notaInvalida');
  print('Nota opcional: $notaOpcional');
  print('Mensaje: $mensaje');
  print('Observacion: $longitud');
  print('Promedio maximo permitido: ${double.maxFinite}');
}
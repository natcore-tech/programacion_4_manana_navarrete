void main() {
  String letraNota = 'B';

  switch (letraNota) {
    case 'A':
      print('Excelente');
      break;
    case 'B':
      print('Bien');
      break;
    case 'C':
      print('Suficiente');
      break;
    case 'D':
      print('Insuficiente');
      break;
    case 'F':
      print('Reprobado');
      break;
    default:
      print('Sin calificación');
  }

  String codigoNota = '85';

  String descripcion = switch (codigoNota) {
    '90' => 'Sobresaliente',
    '85' => 'Notable',
    '75' => 'Bien',
    '65' => 'Suficiente',
    '50' => 'Insuficiente',
    _    => 'Calificación desconocida',
  };
  print(descripcion);

  int notaNumerica = 85;

  String categoria = switch (notaNumerica) {
    int n when n >= 90 => 'A - Excelente',
    int n when n >= 80 => 'B - Muy bien',
    int n when n >= 70 => 'C - Bien',
    int n when n >= 60 => 'D - Suficiente',
    _                  => 'F - Reprobado',
  };

  print(categoria);

  double asistencia = 92.5;

  String estado = switch (asistencia) {
    double a when a >= 95.0 => 'Asistencia perfecta',
    double a when a >= 85.0 => 'Asistencia aceptable',
    double a when a >= 75.0 => 'Asistencia baja',
    _                      => 'Asistencia insuficiente',
  };

  print(estado);
}
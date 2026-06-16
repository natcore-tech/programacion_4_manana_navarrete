// required → el parámetro es obligatorio
// sin required → es opcional (necesita valor por defecto o ser nullable)
void configurarServidor({
  required String host,
  required int    puerto,
  bool   ssl        = true,
  int    timeoutSeg = 30,
}) {
  final estado = ssl ? 'APROBADO' : 'REPROBADO';
  print('Registro: Estudiante $host - Nota: $puerto - $estado (procesado en ${timeoutSeg}s)');
}

void main() {
  // Los nombrados pueden pasarse en cualquier orden
  configurarServidor(
    host:       'María Pérez',
    puerto:     85,
    ssl:        true,
    timeoutSeg: 2,
  );

  // Solo los obligatorios — los opcionales toman su valor por defecto
  configurarServidor(
    host:   'Juan López',
    puerto: 67,
  );
}

class Estudiante {
  final String nombre;
  final int nota;

  Estudiante(this.nombre, this.nota);

  @override
  String toString() => '$nombre: $nota';
}
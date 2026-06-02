class Dispositivo {
  final String id;
  final String nombre;
  List<double> notas;
  bool _encendido = false;

  Dispositivo({
    required this.id,
    required this.nombre,
    required this.notas,
  });

  bool get encendido => _encendido;
  String get estado => _encendido ? 'matriculado' : 'no matriculado';

  set estadoEncendido(bool valor) {
    _encendido = valor;
  }

  void conectar() {
    _encendido = true;
  }

  void desconectar() {
    _encendido = false;
  }

  double promedio() => notas.isEmpty ? 0.0 : notas.reduce((a, b) => a + b) / notas.length;

  String resumen() => 'ID: $id | Nombre: $nombre | Promedio: ${promedio().toStringAsFixed(2)} | Estado: $estado';

  @override
  String toString() => 'Estudiante($nombre, Promedio: ${promedio().toStringAsFixed(2)}, $estado)';
}

void main() {
  // Crear una instancia
  final estudiante = Dispositivo(
    id: 'STU-001',
    nombre: 'juan-perez',
    notas: [7.5, 8.0, 9.0],
  );

  estudiante.conectar();
  final estado = estudiante.estado;
  final resumen = estudiante.resumen();
  final descripcion = estudiante.toString();

  estudiante.estadoEncendido = false;
  final activo = estudiante.encendido;
}
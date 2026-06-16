int doblar(int n)  => n * 2;
int triplicar(int n) => n * 3;

class Estudiante {
    String nombre;
    int nota;
    Estudiante(this.nombre, this.nota);
  }

void main() {
  int Function(int) operacion;

  operacion = doblar;
  print('Operación asignada: doblar -> Resultado: ${operacion(5)}');

  operacion = triplicar;
  print('Operación asignada: triplicar -> Resultado: ${operacion(5)}');

  final transformaciones = <int Function(int)>[doblar, triplicar];


  final estudiantes = <Estudiante>[
    Estudiante('Ana', 7),
    Estudiante('Luis', 5),
    Estudiante('María', 9),
  ];

  for (final s in estudiantes) {
    print('Registro: ${s.nombre} - Nota original: ${s.nota}');
    for (final fn in transformaciones) {
      final etiqueta = fn == doblar ? 'Ajuste x2' : 'Ajuste x3';
      print('$etiqueta -> ${fn(s.nota)}');
    }
  }
}
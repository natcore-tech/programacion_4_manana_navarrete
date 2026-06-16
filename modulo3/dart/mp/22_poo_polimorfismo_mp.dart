abstract class RegistroNota {
  String get nombre;
  double calcularArea();
}

class NotaFinal extends RegistroNota {
  final String estudiante;
  final double nota;
  NotaFinal(this.estudiante, this.nota);
  @override String get nombre => estudiante;
  @override double calcularArea() => nota;
}

class Parcial extends RegistroNota {
  final String estudiante;
  final double nota;
  Parcial(this.estudiante, this.nota);
  @override String get nombre => estudiante;
  @override double calcularArea() => nota;
}

class Examen extends RegistroNota {
  final String estudiante;
  final double nota;
  Examen(this.estudiante, this.nota);
  @override String get nombre => estudiante;
  @override double calcularArea() => nota;
}

void imprimirArea(RegistroNota figura) {
  print('${figura.nombre}: ${figura.calcularArea().toStringAsFixed(2)} puntos');
}

void main() {
  final figuras = <RegistroNota>[
    NotaFinal('Ana', 18.5),
    Parcial('Luis', 16.0),
    Examen('Marta', 19.25),
  ];

  for (final f in figuras) {
    imprimirArea(f);
  }

  final mayor = figuras.reduce((a, b) => a.calcularArea() > b.calcularArea() ? a : b);
  print('\nMayor nota: ${mayor.nombre} con ${mayor.calcularArea().toStringAsFixed(2)} puntos');
}
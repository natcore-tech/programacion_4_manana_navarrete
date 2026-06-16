abstract class RegistroNota {
  String get nombre;
  double calcularArea();
  double calcularPerimetro();

  void describir() {
    print('$nombre - nota final: ${calcularArea().toStringAsFixed(2)}, '
          'promedio acumulado: ${calcularPerimetro().toStringAsFixed(2)}');
  }
}

class NotaFinal extends RegistroNota {
  final double nota;
  NotaFinal(this.nota);

  @override String get nombre => 'Nota final';
  @override double calcularArea() => nota;
  @override double calcularPerimetro() => nota;
}

class PromedioBimestre extends RegistroNota {
  final double nota1, nota2;
  PromedioBimestre(this.nota1, this.nota2);

  @override String get nombre => 'Promedio bimestral';
  @override double calcularArea() => (nota1 + nota2) / 2;
  @override double calcularPerimetro() => nota1 + nota2;
}

void main() {
  final registros = <RegistroNota>[NotaFinal(18), PromedioBimestre(15, 17)];
  for (final registro in registros) {
    registro.describir();
  }
}
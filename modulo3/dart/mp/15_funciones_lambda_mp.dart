void main() {
  final cuadrado = (int n) => n * n;
  print('Nota elevada al cuadrado: ${cuadrado(7)}');

  final calcularPromedio = (double nota, double pct) {
    final ponderacion = nota * (pct / 100);
    return ponderacion;
  };
  print('Nota ponderada: ${calcularPromedio(85.0, 30.0)}');

  final notas = [78, 92, 85, 88, 95, 72, 80, 90];
  notas.sort((a, b) => b.compareTo(a));
  print('Notas ordenadas de mayor a menor: $notas');
}
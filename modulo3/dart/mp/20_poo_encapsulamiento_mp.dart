class RegistroNotas {
  final String estudiante;
  double _saldo;

  RegistroNotas(this.estudiante, double notaInicial)
      : _saldo = notaInicial;

  double get saldo => _saldo;

  void depositar(double monto) {
    if (monto <= 0) throw ArgumentError('El monto debe ser positivo');
    _saldo += monto;
    print('Se sumaron $monto puntos. Nota actual: $_saldo');
  }

  void retirar(double monto) {
    if (monto <= 0) throw ArgumentError('El monto debe ser positivo');
    if (monto > _saldo) throw StateError('La nota no puede ser menor que cero');
    _saldo -= monto;
    print('Se restaron $monto puntos. Nota actual: $_saldo');
  }
}

void main() {
  final cuenta = RegistroNotas('Ana López', 70.0);

  cuenta.depositar(10.0);
  cuenta.retirar(5.0);
  print(cuenta.saldo);
}
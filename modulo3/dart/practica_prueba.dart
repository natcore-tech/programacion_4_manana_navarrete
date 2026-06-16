import 'dart:io';

void main() {
  stdout.write('Ingrese la cantidad de vehiculos a registrar: ');
  int TOTAL = int.parse(stdin.readLineSync()!);
  int taf_max = 0;

  for (int i = 1; i <= TOTAL; i++) {

    stdout.write('Vehiculo $i Placa: ');
    String placa = stdin.readLineSync()!;

    stdout.write('Vehiculo $i Horas estacionado: ');
    int horas = int.parse(stdin.readLineSync()!);

    double costo = 0;
    String categoria = '';

    if (horas == 0) {
      costo = 0.0;
      categoria = 'Gratis';
    } else if (horas <= 2) {
      costo = horas * 1.50;
      categoria = 'Tarifa Normal';
    } else if (horas <=5) {
      costo = horas * 1.00;
      categoria = 'Tarifa Reducida';
    } else {
      costo = 8.00;
      categoria = 'Tarifa Maxima';
      taf_max++;
    }

    print('[$placa] ${horas}h -> $categoria \$${costo.toStringAsFixed(2)}');
    print('');
  }

  print('Vehiculos con tarifa maxima: $taf_max');
}
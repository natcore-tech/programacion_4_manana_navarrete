import 'dart:io';

void main() {
  
}
  int total = 0;
  int contador = 0;

  while (true) {

    print('Ingrese la nota del estudiante:');
    int nota = int.parse(stdin.readLineSync()!);
    total += nota;
    contador += 1;

    print('¿Desea terminar el registro? 1=si 0=no:');
    int terminar = int.parse(stdin.readLineSync()!);

    if (terminar == 1) {
      break;
    }

  }

  double promedio = contador > 0 ? total / contador : 0;

  if (promedio >= 60) {
    print('Promedio: ${promedio.toStringAsFixed(2)} - Estado: Aprobado');
  } else {
    print('Promedio: ${promedio.toStringAsFixed(2)} - Estado: Reprobado');
  }

}
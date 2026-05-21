import 'dart:io';

void main() {
  
  int acum = 0;

  int piezas = 0;
  

  while (true) {

    print('Ingrese las piezas producidas:');
    int piezas = int.parse(stdin.readLineSync()!);

    print('Desea terminar el bucle 1 o 0:');
    int terminar = int.parse(stdin.readLineSync()!);

    if (terminar ==  1) {
        break;
    };
    
    
  }

  if (piezas < 50) {
        print('Produccion Adecuada');
    } else {
        print('Produccion Baja');
    };


}
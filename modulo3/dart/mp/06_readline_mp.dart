import 'dart:io';

void main(){
  print('Ingrese el nombre del estudiante: ');
  String? nombre = stdin.readLineSync();
  print('Estudiante: $nombre');
  print('Ingrese la nota de matematicas:');
  int notaMatematicas = int.parse(stdin.readLineSync()!);
  print('Nota de matematicas: $notaMatematicas');

  print('Ingrese la nota de lenguaje:');
  double notaLenguaje = double.parse(stdin.readLineSync()!);
  print('Nota de lenguaje: $notaLenguaje'); 

  print('Ingrese la nota de ciencias:');
  int notaCiencias = int.parse(stdin.readLineSync()!);
  print('Ingrese la nota de historia:');
  int notaHistoria = int.parse(stdin.readLineSync()!);
  int promedio = (notaMatematicas + notaLenguaje.toInt() + notaCiencias + notaHistoria) ~/ 4;
  print('El promedio de $nombre es: $promedio');

  
}




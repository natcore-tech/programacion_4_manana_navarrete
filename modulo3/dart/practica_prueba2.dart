import 'dart:io';

void main() {
  const int ac = 4;

    double total = 0;
    String categoria = '';
    int accesorios = 0;
  

  for (int i=1; i<=ac; i++) {
    stdout.write('Ingrese el precio del accesorio: ');
    double precio = double.parse(stdin.readLineSync()!);
    

    if (precio < 50) {
      categoria='Accesible';
    } else if (precio <=150) {
      categoria = 'Inversion Media';
    } else {
      categoria = 'Premium';
      accesorios++;
    }

    total += precio;
    print('El accesorio ingresado es de categoria $categoria');

  }

  print('El total gastado es de $total y la cantidad de accesorios premium es de $accesorios');
  


}
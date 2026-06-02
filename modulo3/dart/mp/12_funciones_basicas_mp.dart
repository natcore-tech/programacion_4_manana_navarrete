// Sintaxis completa — preferida para funciones públicas
int sumar(int a, int b) {
  return a + b;
}

// Sintaxis de flecha — cuando el cuerpo es una sola expresión
int multiplicar(int a, int b) => a * b;

// Con tipo explícito — recomendado
String formatearPrecio(double precio) => '\$${precio.toStringAsFixed(2)}';

// Sin tipo — Dart infiere que retorna String
formatearPrecioSinTipo(double precio) => '\$${precio.toStringAsFixed(2)}';

// El tercer parámetro es opcional — puede omitirse al llamar
String construirUrl(String host, String ruta, [int? puerto]) {
  if (puerto != null) {
    return 'https://$host:$puerto$ruta';
  }
  return 'https://$host$ruta';
}

// Con valor por defecto — evita el chequeo de null
String construirUrlV2(String host, String ruta, [int puerto = 443]) {
  return 'https://$host:$puerto$ruta';
}

// void — cuando no se devuelve nada
void imprimirSeparador(String titulo) {
  print('─── $titulo ───');
}

void main() {
  imprimirSeparador('Registro de Notas');
  print('Alumno: Juan Pérez');
  print('Parcial 1: ${sumar(40, 45)}');
  print('Parcial 2: ${sumar(42, 43)}');
  print('Proyecto: ${sumar(20, 30)}');
  print('Promedio (ponderado ejemplo): ${multiplicar(85, 1)}');
  print('Acceder al sistema: ${construirUrl('notas.universidad.edu', '/alumnos')}');
  imprimirSeparador('Fin de Registro');

}
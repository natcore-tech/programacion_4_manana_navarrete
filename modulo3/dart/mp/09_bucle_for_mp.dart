void main() {
  for (int i = 0; i < 5; i++) {
    print('Alumno ${i + 1} registrado');
  }

  for (int i = 0; i <= 100; i += 25) {
    print('Evaluación parcial: $i%');
  }

  for (int i = 5; i >= 1; i--) {
    print('Corrección pendiente para alumno ${i}');
  }
}
class Student {
  String name;
  String id;
  double grade;
  double maxGrade;
  bool passed;

  Student(this.name, this.id, this.grade, {this.maxGrade = 100}) : passed = grade >= 60;

  @override
  String toString() => 'Estudiante: $name (ID: $id) - Nota: ${grade.toStringAsFixed(2)}/$maxGrade - ${passed ? 'Aprobado' : 'Reprobado'}';
}

void main() {
  var alumno = Student('Ana García', 'A001', 87.5);
  var alumno2 = Student('Luis Pérez', 'A002', 54.0);

  print(alumno);
  print(alumno2);
}
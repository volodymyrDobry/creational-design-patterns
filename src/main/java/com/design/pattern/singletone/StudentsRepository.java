package com.design.pattern.singletone;

import com.design.pattern.model.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Getter;

public class StudentsRepository {

  @Getter private static final List<Student> students;
  private static final Map<Integer, Integer> studentPoints;
  private static StudentsRepository instance;

  static {
    students =
        List.of(
            new Student(1, "Volodymyr", "Dobrianskyi"),
            new Student(2, "Vadim", "Darmohrai"),
            new Student(3, "Nikita", "Zaloha"),
            new Student(4, "David", "Dvinskyi"));

    studentPoints = Map.of(1, 100, 2, 100, 3, 5, 4, 200);
  }

  private StudentsRepository() {}

  public static synchronized StudentsRepository getInstance() {
    if (instance == null) {
      instance = new StudentsRepository();
    }
    return instance;
  }

  public Map<Student, Integer> getStudentsWithPoints() {
    return students.stream()
        .collect(
            Collectors.toMap(student -> student, student -> studentPoints.get(student.getId())));
  }
}

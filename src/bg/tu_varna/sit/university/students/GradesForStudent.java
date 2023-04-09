package bg.tu_varna.sit.university.students;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Discipline;
import java.util.HashMap;
import java.util.Map;

public class GradesForStudent {
    private final Student student;
    private final Map<Discipline, Integer> disciplinesWithGrade;

    public GradesForStudent(Student student) {
        this.student = student;
        disciplinesWithGrade = new HashMap<>();
    }

    public Map<Discipline, Integer> getDisciplinesWithGrade() {
        return disciplinesWithGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void putElement(Discipline key, int value) throws InvalidEnteredDataExceptions {
        this.getDisciplinesWithGrade().put(key, value);
    }



}
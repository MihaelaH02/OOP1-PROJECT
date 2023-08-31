package bg.tu_varna.sit.university.students;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.verifications.ValidateData;

import java.util.HashMap;
import java.util.Map;

public class GradesForStudent {
    private final Student student;
    private final Map<Discipline, Integer> disciplinesWithGrade;

    public GradesForStudent(Student student) {
        this.student = student;
        disciplinesWithGrade = new HashMap<>();
    }

    public Map<Discipline, Integer> getMap() {
        return disciplinesWithGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void putElement(Discipline key, int value) throws InvalidEnteredDataExceptions {
        new ValidateData().verifyGrade(value);
        this.getMap().put(key, value);
    }

    public String toString(){
        System.out.println("Enrolled disciplines:");
        StringBuilder string = new StringBuilder();
        for (Map.Entry<Discipline, Integer> discipline: this.getMap().entrySet()  ) {
           string.append(discipline.getKey().getName())
                   .append(" - ")
                   .append(discipline.getKey().getTypeOfTheDiscipline().getTypeOfDisciplineEnum())
                   .append(" - ")
                   .append(discipline.getValue())
                   .append("\n");
        }
        return string.toString();
    }
}
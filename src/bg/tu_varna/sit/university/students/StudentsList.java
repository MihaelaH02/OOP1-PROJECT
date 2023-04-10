package bg.tu_varna.sit.university.students;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private static StudentsList instance;
    private final List<GradesForStudent> allStudents;

    private StudentsList() {
        this.allStudents = new ArrayList<>();
    }

    public static StudentsList getInstance() {
        if (instance == null) instance = new StudentsList();
        return instance;
    }

    public List<GradesForStudent> getAllStudents() {
        return allStudents;
    }

    public void addElement(GradesForStudent student) {
        this.allStudents.add(student);
    }

    public void removeElement(GradesForStudent student) {
        this.allStudents.remove(student);
    }

    public void printArray(){
        for (GradesForStudent student : this.getAllStudents()) {
            System.out.println(student.getDisciplinesWithGrade());
        }
    }
}

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

    public static void setInstance(StudentsList instance) {
        StudentsList.instance = instance;
    }

    public List<GradesForStudent> getAllStudents() {
        return allStudents;
    }

    public void addElement(GradesForStudent student) {
        this.allStudents.add(student);
    }

}

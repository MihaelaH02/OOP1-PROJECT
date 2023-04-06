package bg.tu_varna.sit;

import java.util.ArrayList;
import java.util.List;

public class AllStudents {//singleton
    private List<Student> allStudents;

    public AllStudents(List<Student> allStudents) {
        this.allStudents = new ArrayList<>();
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public void addElement(Student student){
        this.allStudents.add(student);
    }

    public void removeElement(Student student){
        this.allStudents.remove(student);
    }
}

package bg.tu_varna.sit;

import java.util.HashMap;
import java.util.Map;

public class StudentGradesForDisciplines {
    private final Student student;
    private final Map<Discipline,Integer> disciplinesWithGrade;

    public StudentGradesForDisciplines(Student student) {
        this.student = student;
        disciplinesWithGrade=new HashMap<>();
    }

    public Map<Discipline, Integer> getDisciplinesWithGrade() {
        return disciplinesWithGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void AddNewDisciplineAndGrade(Discipline discipline, int grade){
        if(this.getStudent().getSpecialty().getDisciplinesForSpecialtyMap().containsKey(discipline))
            this.getDisciplinesWithGrade().put(discipline,grade);
        }

    }
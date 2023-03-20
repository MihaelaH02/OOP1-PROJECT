package bg.tu_varna.sit;

public class StudentGradeAndExamDiscipline {
    private Student student;
    private Discipline discipline;
    private double grade;

    public StudentGradeAndExamDiscipline() {
    }

    public StudentGradeAndExamDiscipline(Student student, Discipline discipline, double grade) {
        this.student = student;
        this.discipline = discipline;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public double getGrade() {
        return grade;
    }
}

package bg.tu_varna.sit;

import bg.tu_varna.sit.Enums.*;

public class Student {
    private String name;
    private String facultyNumber;
    private CourseEnum course;
    private SpecialtyEnum specialty;
    private int group;
    private StatusEnum status;
    private double averageGrade;

    public Student() {}

    public Student(String name, String facultyNumber, CourseEnum course, SpecialtyEnum specialty, int group, StatusEnum status,double averageGrade) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.course = course;
        this.specialty = specialty;
        this.group = group;
        this.status = status;
        this.averageGrade=averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public CourseEnum getCourse() {
        return course;
    }

    public SpecialtyEnum getSpecialty() {
        return specialty;
    }

    public int getGroup() {
        return group;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}

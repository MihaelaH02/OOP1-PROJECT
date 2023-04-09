package bg.tu_varna.sit.university.students;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.verifications.VerifyCourse;
import bg.tu_varna.sit.verifications.VerifyGroup;
import bg.tu_varna.sit.verifications.VerifyString;

public class Student {
    private String name;
    private String facultyNumber;
    private int course;
    private SpecialtyEnum specialty;
    private int group;
    private StatusEnum status;
    private double averageGrade;//добави метод за пресмятане на успеха

    public Student() {}

    public Student(String name, String facultyNumber, int course, SpecialtyEnum specialty, int group, StatusEnum status) throws InvalidEnteredDataExceptions {
        this.name = (new VerifyString(name)).getString();
        this.facultyNumber = (new VerifyString(facultyNumber)).getString();
        this.course = (new VerifyCourse(course)).getCourse();
        this.specialty = specialty;
        this.group = (new VerifyGroup(group)).getGroup();
        this.status = status;
        this.averageGrade=0;
    }

    public String getName() {
        return name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
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

    @Override
    public String toString() {
        return this.getName() + " " + this.getFacultyNumber() + " " + this.getCourse() + " " + this.getSpecialty().getSpecialtyEnum() + " " + this.getGroup() + " " + this.getStatus() + " " + this.getAverageGrade();
    }
}

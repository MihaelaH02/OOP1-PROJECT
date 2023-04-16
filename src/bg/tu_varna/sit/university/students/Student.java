package bg.tu_varna.sit.university.students;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.verifications.VerifyCourse;
import bg.tu_varna.sit.verifications.VerifyGroup;
import bg.tu_varna.sit.verifications.VerifyString;

public class Student {
    private String name;
    private String facultyNumber;
    private int course;
    private Specialty specialty;
    private int group;
    private StatusEnum status;
    private double averageGrade;//добави метод за пресмятане на успеха

    public Student() {}

    public Student(String name, String facultyNumber, int course, Specialty specialty, int group, StatusEnum status) throws InvalidEnteredDataExceptions {
        this.name = (new VerifyString().verifyString(name));
        this.facultyNumber = (new VerifyString().verifyString(facultyNumber));
        this.course = (new VerifyCourse().verifyCourse(course));
        this.specialty = specialty;
        this.group = (new VerifyGroup().verifyGroup(group));
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

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getFacultyNumber() + " " + this.getCourse() + " " + this.getSpecialty().getSpecialtyTitle() + " " + this.getGroup() + " " + this.getStatus() + " " + this.getAverageGrade();
    }
}

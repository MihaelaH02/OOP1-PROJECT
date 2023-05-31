package bg.tu_varna.sit.university.students;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.get_data.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.verifications.VerifyCourse;
import bg.tu_varna.sit.university.verifications.VerifyGroup;
import bg.tu_varna.sit.university.verifications.VerifyString;

public class Student{
    private String name;
    private String facultyNumber;
    private int course;
    private Specialty specialty;
    private int group;
    private StatusEnum status;

    public Student() {}

    public Student(String name, String facultyNumber, int course, String specialty, int group, StatusEnum status) throws InvalidEnteredDataExceptions {
        this.name = (new VerifyString().verifyString(name));
        this.facultyNumber = (new VerifyString().verifyString(facultyNumber));
        this.course = (new VerifyCourse().verifyCourse(course));
        this.specialty = new GetSpecialtyWithTitle().getSpecialtyFromList(specialty);
        this.group = (new VerifyGroup().verifyGroup(group));
        this.status = status;
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

    @Override
    public String toString() {
        return  "Name: " + this.getName() + ", fn: " + this.getFacultyNumber() + ", status: " + this.getStatus().getStatusEnum() + ", program: " + this.getSpecialty().getSpecialtyTitle() + ", year: " + this.getCourse() + ", group: " + this.getGroup();
    }
}

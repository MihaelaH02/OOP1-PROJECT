package bg.tu_varna.sit.enrollin;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.GetDiscipline;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class EnrollIn {
    public void enrollInDiscipline(String facultyNumber,String discipline) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(!(student.getStudent().getStatus() == StatusEnum.DISCONTINUED))
            student.putElement(new GetDiscipline().getDisciplineFromSpecialty(discipline,student.getStudent().getSpecialty()),0);
        else System.out.println("Грешка! Неуспешно преместване на студент в следващ курс, студен с факултете номер " + facultyNumber + " е прекъснал!");

    }

}

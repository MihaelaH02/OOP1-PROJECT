package bg.tu_varna.sit.operations.addgrade;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.GetDiscipline;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.verifications.VerifyGrade;
import bg.tu_varna.sit.verifications.VerifyString;

public class AddGrade {
    public void addGrade(String facultyNumber, String discipline, int garde) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(student.getStudent().getStatus() == StatusEnum.ENROLL)
            student.putElement(new GetDiscipline().getDisciplineFromSpecialty(discipline,student.getMap()),garde);
        else
            System.out.println("Грешка! Неуспешно преместване на студент в следващ курс, студен с факултете номер " + facultyNumber + " е прекъснал!");
    }
}

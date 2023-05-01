package bg.tu_varna.sit.operations.addgrade;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetDiscipline;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class AddGrade {
    public void addGrade(String facultyNumber, String discipline, int garde) throws InvalidEnteredDataExceptions {
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        if(student.getStudent().getStatus() == StatusEnum.ENROLL)
            student.putElement(new GetDiscipline().getDisciplineFromSpecialty(discipline,student.getMap()),garde);
        else
            throw new InvalidEnteredDataExceptions("Грешка! Неуспешно преместване на студент в следващ курс, студен с факултете номер " + facultyNumber + " е прекъснал!");
    }
}
package bg.tu_varna.sit.addgrade;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.GetDiscipline;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class AddGrade {
    public void addGrade(String facultyNumber,String discipline, int garde) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(!(student.getStudent().getStatus()== StatusEnum.DISCONTINUED))
            student.putElement(new GetDiscipline().getDisciplineFromSpecialty(discipline,student.getStudent().getSpecialty()),garde);
        else System.out.println("Грешка! Неуспешно преместване на студент в следващ курс, студен с факултете номер " + facultyNumber + " е прекъснал!");
    }
}

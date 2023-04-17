package bg.tu_varna.sit.operations.interrupt;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Interrupt {
    public void interruptStudent(String facultyNumber)throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(student.getStudent().getStatus()==StatusEnum.DISCONTINUED) throw new InvalidEnteredDataExceptions("Грешка! Студентът вече е маркиран като прекъснал!");
        student.getStudent().setStatus(StatusEnum.DISCONTINUED);
    }
}

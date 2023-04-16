package bg.tu_varna.sit.advance;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Advance {
    public void AdvanceStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(!(student.getStudent().getStatus()== StatusEnum.DISCONTINUED))
            student.getStudent().setCourse(student.getStudent().getCourse() + 1);
        else System.out.println("Грешка! Неуспешно преместване на студент в следващ курс, студен с факултете номер " + facultyNumber + " е прекъснал!");
    }
}

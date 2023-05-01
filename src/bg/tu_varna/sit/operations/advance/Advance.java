package bg.tu_varna.sit.operations.advance;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Advance {
    public void AdvanceStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(student.getStudent().getCourse()==4) throw new InvalidEnteredDataExceptions("Грешка! Студенът е вече 4-ти курс!");
        if(student.getStudent().getStatus()== StatusEnum.ENROLL)
            student.getStudent().setCourse(student.getStudent().getCourse() + 1);
        else throw new InvalidEnteredDataExceptions("Грешка! Неуспешно преместване на студент в следващ курс, студен с факултете номер " + facultyNumber + " е прекъснал!");
    }
}

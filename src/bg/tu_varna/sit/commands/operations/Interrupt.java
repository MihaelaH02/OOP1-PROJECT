package bg.tu_varna.sit.commands.operations;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Interrupt {
    public void interruptStudent(String facultyNumber)throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(student.getStudent().getStatus()==StatusEnum.DISCONTINUED) throw new InvalidEnteredDataExceptions("failed in marking the  status of the student with faculty number" + facultyNumber+" to discontinued, the status of the student is already discontinue.");
        student.getStudent().setStatus(StatusEnum.DISCONTINUED);
    }
}

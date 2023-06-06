package bg.tu_varna.sit.commands.operations;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Resume {
    public void resumeStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(student.getStudent().getStatus() != StatusEnum.DISCONTINUED) throw new InvalidEnteredDataExceptions("failed marking status of the student to enrolled, it is already marked as enrolled");
        student.getStudent().setStatus(StatusEnum.ENROLL);
    }
}

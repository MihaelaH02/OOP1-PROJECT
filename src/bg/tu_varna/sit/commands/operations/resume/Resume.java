package bg.tu_varna.sit.commands.operations.resume;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Resume {
    public void resumeStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        if(student.getStudent().getStatus() != StatusEnum.DISCONTINUED) throw new InvalidEnteredDataExceptions("Грешка! Студентът е вече маркиран като записан!");
        student.getStudent().setStatus(StatusEnum.ENROLL);
    }
}

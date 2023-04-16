package bg.tu_varna.sit.graduate;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class Graduate {
    public void graduateStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        if (student.getStudent().getStatus() == StatusEnum.ENROLL)
            if(student.getStudent().getCourse() == 4){
                new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(student,student.getStudent().getSpecialty());
                student.getStudent().setStatus(StatusEnum.GRADUATED);
        }
    }
}

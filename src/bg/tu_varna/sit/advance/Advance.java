package bg.tu_varna.sit.advance;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;

public class Advance {
    private final StudentsList studentsList = StudentsList.getInstance();

    public Advance(String facultyNumber) throws InvalidEnteredDataExceptions{
        ChangeCourse(facultyNumber);
    }

    public StudentsList getStudentsList() {
        return studentsList;
    }

    private void ChangeCourse(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent studentWithFacultyNumber = (new GetStudentWithFacultyNumber(facultyNumber)).getFinedStudent();
        studentWithFacultyNumber.getStudent().setCourse(studentWithFacultyNumber.getStudent().getCourse() + 1);
    }
}

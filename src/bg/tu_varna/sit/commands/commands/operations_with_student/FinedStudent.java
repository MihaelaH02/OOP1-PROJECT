package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.commands.ExecuteCommand;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;

public abstract class FinedStudent implements ExecuteCommand {
    private final GradesForStudent student;

    public FinedStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        this.student = this.findStudentWithFacultyNumber(facultyNumber);
    }

    protected GradesForStudent getStudent() {
        return student;
    }

    private GradesForStudent findStudentWithFacultyNumber(String facultyNumber) throws InvalidEnteredDataExceptions{
        StudentsList studentsList = StudentsList.getInstance();
        for (GradesForStudent oneStudentInArray : studentsList.getAllStudents()) {
            if (oneStudentInArray.getStudent().getFacultyNumber().equals(facultyNumber)) return oneStudentInArray;
        }
        throw new InvalidEnteredDataExceptions("failed, there are no student with faculty number " + facultyNumber + ".");
    }

}

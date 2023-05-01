package bg.tu_varna.sit.university.get_data;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;

public class GetStudentWithFacultyNumber {
    public GradesForStudent findStudentWithFacultyNumber(String facultyNumber) throws InvalidEnteredDataExceptions{
        StudentsList studentsList = StudentsList.getInstance();
        for (GradesForStudent oneStudentInArray : studentsList.getAllStudents()) {
            if (oneStudentInArray.getStudent().getFacultyNumber().equals(facultyNumber)) return oneStudentInArray;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Студент с факултете номер: " + facultyNumber + " несъществува!");
    }
}

package bg.tu_varna.sit.university.students;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;

public class GetStudentWithFacultyNumber {
    private final StudentsList studentsList = StudentsList.getInstance();
    private final GradesForStudent finedStudent;

    public GetStudentWithFacultyNumber(String facultyNumber) throws InvalidEnteredDataExceptions{
        this.finedStudent = findStudentWithFacultyNumber(facultyNumber);
    }

    public GradesForStudent getFinedStudent() {
        return finedStudent;
    }

    private StudentsList getStudentsList() {
        return studentsList;
    }

    private GradesForStudent findStudentWithFacultyNumber(String facultyNumber) throws InvalidEnteredDataExceptions{
        for (GradesForStudent oneStudentInArray : this.getStudentsList().getAllStudents()) {
            if (oneStudentInArray.getStudent().getFacultyNumber().equals(facultyNumber)) return oneStudentInArray;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Студент с факултете номер: " + facultyNumber + " несъществува!");
    }
}

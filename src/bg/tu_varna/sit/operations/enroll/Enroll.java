package bg.tu_varna.sit.operations.enroll;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.Student;
import bg.tu_varna.sit.university.students.StudentsList;

public class Enroll {
    public void enrollStudent(String facultyNumber, String program, int group, String name) throws InvalidEnteredDataExceptions {
        StudentsList studentsList = StudentsList.getInstance();
        for (GradesForStudent oneStudent : studentsList.getAllStudents()) {
            if (oneStudent.getStudent().getFacultyNumber().equals(facultyNumber))
                throw new InvalidEnteredDataExceptions("Грешка! Вече съществува студен с факултетен номер " + facultyNumber + " !");
        }
        studentsList.getAllStudents().add(new GradesForStudent(new Student(name, facultyNumber, 1, program, group, StatusEnum.ENROLL)));
    }
}

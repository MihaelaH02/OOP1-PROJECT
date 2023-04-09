package bg.tu_varna.sit.enroll;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.SpecialtyEnum;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.Student;
import bg.tu_varna.sit.university.students.StudentsList;

public class Enroll{
    private final StudentsList studentsList = StudentsList.getInstance();

    public Enroll(String name, SpecialtyEnum program, int group, String facultyNumber) throws InvalidEnteredDataExceptions {
        if(enrollStudent(facultyNumber))
            this.getStudentsList().getAllStudents().add(new GradesForStudent(new Student(name,facultyNumber,1,program,group, StatusEnum.ENROLL)));
    }

    private StudentsList getStudentsList() {
        return studentsList;
    }

    private boolean enrollStudent(String facultyNumber) throws InvalidEnteredDataExceptions{
        for (GradesForStudent oneStudentInArray : this.getStudentsList().getAllStudents()){
                if (oneStudentInArray.getStudent().getFacultyNumber().equals(facultyNumber)) throw new InvalidEnteredDataExceptions("Грешка! Вече съществува студен с факултетен номер "+ facultyNumber + " !");
        }
        return true;
    }
}

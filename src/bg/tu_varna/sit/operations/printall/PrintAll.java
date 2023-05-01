package bg.tu_varna.sit.operations.printall;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.get_data.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;
import bg.tu_varna.sit.verifications.VerifyCourse;

public class PrintAll {
    public void printAllStudentsInSpecialtyAndCourse(String specialty, int course) throws InvalidEnteredDataExceptions {
        new VerifyCourse().verifyCourse(course);
        new GetSpecialtyWithTitle().getSpecialtyFromList(specialty);

        StudentsList studentsList=StudentsList.getInstance();
        boolean flagFindStudentInSpecialtyAndCourse=false;

        for (GradesForStudent oneStudent : studentsList.getAllStudents()) {
            if (oneStudent.getStudent().getSpecialty().getSpecialtyTitle().equals(specialty))
                if(oneStudent.getStudent().getCourse() == course) {
                    System.out.println(oneStudent.getStudent().toString());
                    flagFindStudentInSpecialtyAndCourse = true;
                }

        }

        if(!flagFindStudentInSpecialtyAndCourse) throw new InvalidEnteredDataExceptions("Грешка! Не са намерени студенти от спициалност " + specialty + " курс " + course + " !");
    }
}

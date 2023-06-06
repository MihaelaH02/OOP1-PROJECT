package bg.tu_varna.sit.commands.operations;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.get_data.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;
import bg.tu_varna.sit.university.verifications.VerifyCourse;

public class PrintAll {
    public void printAllStudentsInSpecialtyAndCourse(String specialty, int course) throws InvalidEnteredDataExceptions {
        new VerifyCourse().verifyCourse(course);

        StudentsList studentsList=StudentsList.getInstance();
        boolean flagFindStudentInSpecialtyAndCourse=false;

        for (GradesForStudent oneStudent : studentsList.getAllStudents()) {
            if (oneStudent.getStudent().getSpecialty().getSpecialtyTitle().equals(specialty.toUpperCase()))
                if(oneStudent.getStudent().getCourse() == course) {
                    System.out.println(oneStudent.getStudent().toString());
                    flagFindStudentInSpecialtyAndCourse = true;
                }
        }
        if(!flagFindStudentInSpecialtyAndCourse) throw new InvalidEnteredDataExceptions("failed printing reference for all students in program " + specialty + " and year " + course);
    }
}

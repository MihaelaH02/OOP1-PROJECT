package bg.tu_varna.sit.print;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

import java.util.Map;

public class Print {
    public void printStudent(String facultyNumber)throws InvalidEnteredDataExceptions {
        GradesForStudent student = (new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber));
        System.out.println("Име: " + student.getStudent().getName() + ", фн: " + student.getStudent().getFacultyNumber() + ", статус: " + student.getStudent().getStatus().getStatusEnum() + ", специалност: " + student.getStudent().getSpecialty().getSpecialtyTitle() + ", курс: " + student.getStudent().getCourse() + ", група: " + student.getStudent().getGroup());
        System.out.println("Записани дисциплини:");
        for (Map.Entry<Discipline, Integer> discipline: student.getMap().entrySet()  ) {
            System.out.println(discipline.getKey().getName() + " - " + discipline.getKey().getTypeOfTheDiscipline().getTypeOfDisciplineEnum() + " - " + discipline.getValue());
        }
    }
}

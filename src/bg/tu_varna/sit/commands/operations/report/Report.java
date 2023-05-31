package bg.tu_varna.sit.commands.operations.report;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.get_data.CalculateAverageGrade;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

import java.util.ArrayList;
import java.util.Map;

public class Report {
    public void reportStudent(String facultyNumber) throws InvalidEnteredDataExceptions {
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        ArrayList<Discipline> disciplinesWithGrade2 =new ArrayList<>();
        System.out.println("Student: " + student.getStudent().toString());

        if(!student.getMap().isEmpty()) {
            System.out.println("\nAll taken exams:");
            for (Map.Entry<Discipline, Integer> oneEnrolledDiscipline : student.getMap().entrySet()) {
                if (oneEnrolledDiscipline.getValue() == 2)
                    disciplinesWithGrade2.add(oneEnrolledDiscipline.getKey());
                else System.out.println(oneEnrolledDiscipline.getKey().toString() + " - " + oneEnrolledDiscipline.getValue());
            }
        }
        else throw new InvalidEnteredDataExceptions("failed printing repost for student " +facultyNumber + ", there are no enrolled disciplines.");

        if(!disciplinesWithGrade2.isEmpty()) {
            System.out.println("\nAll failed exams:");
            for (Discipline discipline : disciplinesWithGrade2)
                System.out.println(discipline + " - " + " 2");
        }

        System.out.println("\n Average success: " + String.format("%.2f", new CalculateAverageGrade().calculateTheAverageGradeOfStudent(student.getMap())));
    }
}

package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.get_data.CalculateAverageGrade;
import java.util.ArrayList;
import java.util.Map;

public class Report extends FinedStudent {
    public Report(String facultyNumber) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
    }

    @Override
    public void execute() throws Exception {
        ArrayList<Discipline> disciplinesWithGrade2 =new ArrayList<>();
        System.out.println("Student: " + super.getStudent().getStudent().toString());

        if(!super.getStudent().getMap().isEmpty()) {
            System.out.println("\nAll taken exams:");
            for (Map.Entry<Discipline, Integer> oneEnrolledDiscipline : super.getStudent().getMap().entrySet()) {
                if (oneEnrolledDiscipline.getValue() == 2)
                    disciplinesWithGrade2.add(oneEnrolledDiscipline.getKey());
                else System.out.println(oneEnrolledDiscipline.getKey().toString() + " - " + oneEnrolledDiscipline.getValue());
            }
        }
        else throw new InvalidEnteredDataExceptions("failed printing report, there are no enrolled disciplines.");

        if(!disciplinesWithGrade2.isEmpty()) {
            System.out.println("\nAll failed exams:");
            for (Discipline discipline : disciplinesWithGrade2)
                System.out.println(discipline + " - " + " 2");
        }

        System.out.println("\n Average success: " + String.format("%.2f", new CalculateAverageGrade().calculateTheAverageGradeOfStudent(super.getStudent().getMap())));
    }
}

package bg.tu_varna.sit.commands.commands.protocol;

import bg.tu_varna.sit.commands.ExecuteCommand;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;
import java.util.ArrayList;
import java.util.List;

public class Protocol implements ExecuteCommand {
    private final String discipline;
    private final List<GradesForStudent> studentsEnrolledInDiscipline;

    public Protocol(String discipline) {
        this.discipline = discipline;
        this.studentsEnrolledInDiscipline = new ArrayList<>();
    }

    public String toString(){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < studentsEnrolledInDiscipline.size(); i++){
            if((i==0) || !(studentsEnrolledInDiscipline.get(i-1).getStudent().getSpecialty().getSpecialtyTitle().equals(studentsEnrolledInDiscipline.get(i).getStudent().getSpecialty().getSpecialtyTitle()))) {
                output.append("\nProgram: ").append(studentsEnrolledInDiscipline.get(i).getStudent().getSpecialty().getSpecialtyTitle());
                output.append("\nYear: ").append(studentsEnrolledInDiscipline.get(i).getStudent().getCourse());
            }

            else if(studentsEnrolledInDiscipline.get(i-1).getStudent().getCourse() != studentsEnrolledInDiscipline.get(i).getStudent().getCourse())
                output.append("\nYear: ").append(studentsEnrolledInDiscipline.get(i).getStudent().getCourse());

            output.append("\n").append(studentsEnrolledInDiscipline.get(i).getStudent().toString());
        }
        return output.toString();
    }

    @Override
    public void execute() throws Exception {
        for (GradesForStudent oneStudentInArray : StudentsList.getInstance().getAllStudents()) {
            if (!oneStudentInArray.getMap().isEmpty())
                for (Discipline enrolledDisciplineForStudent : oneStudentInArray.getMap().keySet()) {
                    if (enrolledDisciplineForStudent.getName().equals(discipline)) {
                        studentsEnrolledInDiscipline.add(oneStudentInArray);
                        break;
                    }
                }
        }
        System.out.println("Protocol for discipline: " + discipline);
        studentsEnrolledInDiscipline.sort(new ListComparator());
        System.out.println(this);
    }
}
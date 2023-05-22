package bg.tu_varna.sit.commands.operations.protocol;

import bg.tu_varna.sit.university.students.GradesForStudent;

import java.util.List;

public class PrintProtocols {
    public void printProtocols(List<GradesForStudent> sortedStudents){
        for (int i = 0; i < sortedStudents.size(); i++){
            if((i==0) || !(sortedStudents.get(i-1).getStudent().getSpecialty().getSpecialtyTitle().equals(sortedStudents.get(i).getStudent().getSpecialty().getSpecialtyTitle()))) {
                System.out.println("\nСпециалност: " + sortedStudents.get(i).getStudent().getSpecialty().getSpecialtyTitle());
                System.out.println("\nКурс: " + sortedStudents.get(i).getStudent().getCourse());
            }

            else if(sortedStudents.get(i-1).getStudent().getCourse() != sortedStudents.get(i).getStudent().getCourse())
                System.out.println("\nКурс: " + sortedStudents.get(i).getStudent().getCourse());

            System.out.println(sortedStudents.get(i).getStudent().toString());
        }

    }
}

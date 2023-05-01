package bg.tu_varna.sit.operations.protocol;

import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;
import java.util.ArrayList;
import java.util.List;

public class Protocol {
    public void protocolForDiscipline(String discipline) {
        StudentsList studentsList = StudentsList.getInstance();

        List<GradesForStudent> studentsEnrolledInDiscipline = new ArrayList<>();
        for (GradesForStudent oneStudentInArray : studentsList.getAllStudents()) {
            if (!oneStudentInArray.getMap().isEmpty())
                for (Discipline enrolledDisciplineForStudent : oneStudentInArray.getMap().keySet()) {
                    if (enrolledDisciplineForStudent.getName().equals(discipline)) {
                        studentsEnrolledInDiscipline.add(oneStudentInArray);
                        break;
                    }
                }
        }
        System.out.println("Протоколи за дисциплина: " + discipline);
        studentsEnrolledInDiscipline.sort(new ListComparator());
        new PrintProtocols().printProtocols(studentsEnrolledInDiscipline);
    }
}

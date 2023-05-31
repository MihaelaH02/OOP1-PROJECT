package bg.tu_varna.sit.university.get_data;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.TypeOfTheDiscipline;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.students.GradesForStudent;

import java.util.Map;

public class CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse {
    public void checkForEnrollingAllTheDisciplinesForTheCourse(GradesForStudent student, Specialty specialty) throws InvalidEnteredDataExceptions {
        for (Map.Entry<Discipline, Integer> disciplineInSpecialty : specialty.getMap().entrySet()) {
            if (disciplineInSpecialty.getValue() <= student.getStudent().getCourse()) {
                if (disciplineInSpecialty.getKey().getTypeOfTheDiscipline() == TypeOfTheDiscipline.MANDATORY) {
                    boolean findEnrolledDisciplineInStudentList = false;
                    for (Map.Entry<Discipline, Integer> disciplineInStudentList : student.getMap().entrySet()) {
                        if (disciplineInSpecialty.getKey().getName().equals(disciplineInStudentList.getKey().getName())) {
                            findEnrolledDisciplineInStudentList = true;
                            if (disciplineInStudentList.getValue() <= 2)
                                throw new InvalidEnteredDataExceptions("failed, there are failed exam in discipline " + disciplineInStudentList.getKey().getName());
                            else break;
                        }
                    }
                    if (!findEnrolledDisciplineInStudentList)
                        throw new InvalidEnteredDataExceptions("failed, there are disciplines that are not enrolled and failed exams");
                }
            }
        }
    }
}

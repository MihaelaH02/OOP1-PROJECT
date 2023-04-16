package bg.tu_varna.sit.enrollin;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.specialties.GetDiscipline;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class EnrollIn {
    public void enrollInDiscipline(String facultyNumber,String discipline) throws InvalidEnteredDataExceptions {
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        Discipline disciplineFromSpecialty=new GetDiscipline().getDisciplineFromSpecialty(discipline,student.getStudent().getSpecialty().getMap());
        if(!(student.getStudent().getStatus() == StatusEnum.DISCONTINUED)) {
            if (student.getStudent().getCourse() == student.getStudent().getSpecialty().getValue(disciplineFromSpecialty.getName()))
                student.putElement(disciplineFromSpecialty, 0);
            else throw new InvalidEnteredDataExceptions("Грешка! Дисциплината, която искате да добавите, не се изучава в настоящият Ви курс!");
        }
        else throw new InvalidEnteredDataExceptions ("Грешка! Неуспешно добавяне на дисциплина, студент с факултете номер " + facultyNumber + " е прекъснал!");
    }

}

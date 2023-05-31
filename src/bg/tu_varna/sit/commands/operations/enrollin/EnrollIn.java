package bg.tu_varna.sit.commands.operations.enrollin;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.get_data.GetDiscipline;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.specialties.SpecialtyList;
import bg.tu_varna.sit.university.students.GradesForStudent;

public class EnrollIn {
    public void enrollInDiscipline(String facultyNumber,String discipline) throws InvalidEnteredDataExceptions {
        SpecialtyList list=SpecialtyList.getInstance();
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        Discipline disciplineFromSpecialty=new GetDiscipline().getDisciplineFromSpecialty(discipline,student.getStudent().getSpecialty().getMap());
        if(student.getStudent().getStatus() == StatusEnum.ENROLL) {
            if (student.getStudent().getCourse() == student.getStudent().getSpecialty().getValue(disciplineFromSpecialty.getName()))
                student.putElement(disciplineFromSpecialty, 2);
            else throw new InvalidEnteredDataExceptions("failed in enrolls student with faculty number " + facultyNumber + " in discipline " + discipline +" , the discipline is not appropriate for student`s year.");
        }
        else throw new InvalidEnteredDataExceptions ("failed in enrolls student with faculty number " + facultyNumber + " in discipline " + discipline +" , the status of the student is not enrolled.");
    }
}

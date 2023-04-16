package bg.tu_varna.sit;

import bg.tu_varna.sit.addgrade.AddGrade;
import bg.tu_varna.sit.advance.Advance;
import bg.tu_varna.sit.enroll.Enroll;
import bg.tu_varna.sit.enrollin.EnrollIn;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.*;
import bg.tu_varna.sit.university.students.*;

public class Application {
    public static void main(String[] args) throws InvalidEnteredDataExceptions {
        Specialty sit = new bg.tu_varna.sit.university.specialties.Specialty(SpecialtyEnum.SIT);
        sit.AddElement(new Discipline("Математика 1", TypeOfTheDiscipline.MANDATORY),1);
        sit.AddElement(new Discipline("Базово програмиране",TypeOfTheDiscipline.MANDATORY),1);
        StudentsList studentsInUniversity = StudentsList.getInstance();
        new Enroll().enrollStudent("21621562", sit,1,"Mihaela");
        new Advance().AdvanceStudent("21621562");
        new EnrollIn().enrollInDiscipline("21621562","Математика 1");
        new AddGrade().addGrade("21621562","Математика 1",2);
        studentsInUniversity.printArray();
    }
}

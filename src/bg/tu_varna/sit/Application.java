package bg.tu_varna.sit;

import bg.tu_varna.sit.advance.Advance;
import bg.tu_varna.sit.enroll.Enroll;
import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.*;
import bg.tu_varna.sit.university.students.*;

public class Application {
    public static void main(String[] args) throws InvalidEnteredDataExceptions {
        Specialty sit = new Specialty(SpecialtyEnum.SIT);
        sit.AddElement(new Discipline("Математика 1", TypeOfTheDiscipline.MANDATORY),1);
        sit.AddElement(new Discipline("Базово програмиране",TypeOfTheDiscipline.MANDATORY),1);
        StudentsList studentsInUniversity = StudentsList.getInstance();
        Enroll student1=new Enroll("Mihaela", SpecialtyEnum.SIT,1,"21621562");
        Advance advance1 = new Advance("21621562");
        studentsInUniversity.printArray();

    }
}

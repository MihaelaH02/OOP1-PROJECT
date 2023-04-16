package bg.tu_varna.sit;

import bg.tu_varna.sit.addgrade.AddGrade;
import bg.tu_varna.sit.advance.Advance;
import bg.tu_varna.sit.change.Change;
import bg.tu_varna.sit.enroll.Enroll;
import bg.tu_varna.sit.enrollin.EnrollIn;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.graduate.Graduate;
import bg.tu_varna.sit.print.Print;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.*;

public class Application {
    public static void main(java.lang.String[] args) throws InvalidEnteredDataExceptions {
        Specialty sit = new Specialty("SIT");
        sit.addElement(new Discipline("Математика 1", TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Базово програмиране",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Практика",TypeOfTheDiscipline.OPTIONAL),1);
        Specialty kst = new Specialty("KST");
        kst.addElement(new Discipline("Математика 1",TypeOfTheDiscipline.MANDATORY),1);
        SpecialtyList specialtiesInUniversity = SpecialtyList.getInstance();
        specialtiesInUniversity.addElement(sit);
        specialtiesInUniversity.addElement(kst);

        new Enroll().enrollStudent("21621562", sit,1,"Михаела Христова");
        new EnrollIn().enrollInDiscipline("21621562","Математика 1");
        new EnrollIn().enrollInDiscipline("21621562","Базово програмиране");
        new EnrollIn().enrollInDiscipline("21621562","Практика");
        new AddGrade().addGrade("21621562","Математика 1",3);
        new AddGrade().addGrade("21621562","Базово програмиране",3);
        new AddGrade().addGrade("21621562","Практика",4);
        new Advance().AdvanceStudent("21621562");
        new Advance().AdvanceStudent("21621562");
        new Advance().AdvanceStudent("21621562");
        new Graduate().graduateStudent("21621562");
        new Print().printStudent("21621562");

    }
}

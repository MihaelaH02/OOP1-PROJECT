package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;
import bg.tu_varna.sit.operations.addgrade.AddGrade;
import bg.tu_varna.sit.operations.enroll.Enroll;
import bg.tu_varna.sit.operations.enrollin.EnrollIn;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.*;

import java.util.Scanner;

public class Application {
    public static void main(java.lang.String[] args) throws InvalidEnteredDataExceptions {
        Scanner scanner=new Scanner(System.in);

        Specialty sit = new Specialty("СИТ");
        sit.addElement(new Discipline("Математика 1", TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Базово програмиране",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Практика",TypeOfTheDiscipline.OPTIONAL),1);
        Specialty kst = new Specialty("КСТ");
        kst.addElement(new Discipline("Математика 1",TypeOfTheDiscipline.MANDATORY),1);
        SpecialtyList specialtiesInUniversity = SpecialtyList.getInstance();
        specialtiesInUniversity.addElement(sit);
        specialtiesInUniversity.addElement(kst);
        String input=scanner.nextLine();
        SwitchCommands commands=new SwitchCommands();
        commands.runCommand(input);
       /* new Enroll().enrollStudent("21621563","КСТ",1,"Ivan");
        new Enroll().enrollStudent("21621561","СИТ",2,"Ivana");

        new EnrollIn().enrollInDiscipline("21621562","Математика 1");
        new EnrollIn().enrollInDiscipline("21621562","Базово програмиране");
        new EnrollIn().enrollInDiscipline("21621562","Практика");
        //new EnrollIn().enrollInDiscipline("21621563","Математика 1");
        new EnrollIn().enrollInDiscipline("21621561","Математика 1");

        new AddGrade().addGrade("21621562","Математика 1",3);
        new AddGrade().addGrade("21621562","Базово програмиране",6);
        new AddGrade().addGrade("21621562","Практика",4);

        System.out.println(" Въведете предмет: ");
        String input=scanner.nextLine();
        new Protocol().protocolForDiscipline(input);*/
    }
}

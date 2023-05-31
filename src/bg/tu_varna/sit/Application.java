package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;
import bg.tu_varna.sit.commands.operations.addgrade.AddGrade;
import bg.tu_varna.sit.commands.operations.advance.Advance;
import bg.tu_varna.sit.commands.operations.enroll.Enroll;
import bg.tu_varna.sit.commands.operations.enrollin.EnrollIn;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Specialty sit = new Specialty("SIT");
        sit.addElement(new Discipline("Math 1", TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Base programming",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Praktika",TypeOfTheDiscipline.OPTIONAL),1);
        Specialty kst = new Specialty("KST");
        kst.addElement(new Discipline("Math 1",TypeOfTheDiscipline.MANDATORY),1);
        kst.addElement(new Discipline("Praktika",TypeOfTheDiscipline.OPTIONAL),1);
        SpecialtyList specialtiesInUniversity = SpecialtyList.getInstance();
        specialtiesInUniversity.addElement(sit);
        specialtiesInUniversity.addElement(kst);

        Scanner scanner=new Scanner(System.in);
        SwitchCommands commands=new SwitchCommands();
        while (true) {
            String input = scanner.nextLine();
            commands.runCommand(input.split(" "));
        }
        /*new Enroll().enrollStudent("21621561","kst",1,"Ivan");
        new Enroll().enrollStudent("21621562","sit",2,"Ivaa");
        new Enroll().enrollStudent("21621563","kst",2,"Iva");
        new Enroll().enrollStudent("21621564","sit",2,"Iana");

        new EnrollIn().enrollInDiscipline("21621562","Math 1");
        new EnrollIn().enrollInDiscipline("21621562","Base programming");
        new EnrollIn().enrollInDiscipline("21621562","Praktika");
        new EnrollIn().enrollInDiscipline("21621563","Math 1");
        new EnrollIn().enrollInDiscipline("21621561","Math 1");
        new EnrollIn().enrollInDiscipline("21621564","Math 1");
        new EnrollIn().enrollInDiscipline("21621563","Praktika");

        new AddGrade().addGrade("21621562","Math 1",3);
        new AddGrade().addGrade("21621562","Base programming",6);
        new AddGrade().addGrade("21621563","Praktika",4);
        new Advance().AdvanceStudent("21621562");*/

        //new SwitchCommands().runCommand(new String[]{"OPEN","C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml"});
       // new SwitchCommands().runCommand(new String[]{"PROTOCOL", "Math 1"});
        //new SwitchCommands().runCommand(new String[]{"save"});
        //new SwitchCommands().runCommand(new String[]{"exit"});

    }
}

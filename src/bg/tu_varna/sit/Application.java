package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.commands.operations.protocol.Protocol;
import bg.tu_varna.sit.university.enums.*;
import bg.tu_varna.sit.university.specialties.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;


public class Application {
    public static void main(String[] args) throws Exception {
        Specialty sit = new Specialty("СИТ");
        sit.addElement(new Discipline("Математика 1", TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Базово програмиране",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Практика",TypeOfTheDiscipline.OPTIONAL),1);
        Specialty kst = new Specialty("КСТ");
        kst.addElement(new Discipline("Математика 1",TypeOfTheDiscipline.MANDATORY),1);
        SpecialtyList specialtiesInUniversity = SpecialtyList.getInstance();
        specialtiesInUniversity.addElement(sit);
        specialtiesInUniversity.addElement(kst);
        //*String input=scanner.nextLine();
        //SwitchCommands commands=new SwitchCommands();
        //commands.runCommand(args);
        /*new Enroll().enrollStudent("21621561","КСТ",1,"Ivan");
        new Enroll().enrollStudent("21621562","СИТ",2,"Ivaa");
        new Enroll().enrollStudent("21621563","КСТ",2,"Iva");
        new Enroll().enrollStudent("21621564","СИТ",2,"Iana");


        new EnrollIn().enrollInDiscipline("21621562","Математика 1");
        new EnrollIn().enrollInDiscipline("21621562","Базово програмиране");
        new EnrollIn().enrollInDiscipline("21621562","Практика");
        new EnrollIn().enrollInDiscipline("21621563","Математика 1");
        new EnrollIn().enrollInDiscipline("21621561","Математика 1");
        new EnrollIn().enrollInDiscipline("21621564","Математика 1");


        new AddGrade().addGrade("21621562","Математика 1",3);
        new AddGrade().addGrade("21621562","Базово програмиране",6);
        new AddGrade().addGrade("21621562","Практика",4);
        new Advance().AdvanceStudent("21621562");*/
        new SwitchCommands().runCommand(new String[]{"OPEN","C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml"});
        new SwitchCommands().runCommand(new String[]{"PROTOCOL", "Математика 1"});
        new SwitchCommands().runCommand(new String[]{"CLOSE"});
        new SwitchCommands().runCommand(new String[]{"PROTOCOL", "Математика 1"});
    }
}

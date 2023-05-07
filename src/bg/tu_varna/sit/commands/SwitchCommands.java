package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.operations.addgrade.AddGrade;
import bg.tu_varna.sit.operations.advance.Advance;
import bg.tu_varna.sit.operations.change.Change;
import bg.tu_varna.sit.operations.enroll.Enroll;
import bg.tu_varna.sit.operations.enrollin.EnrollIn;
import bg.tu_varna.sit.operations.graduate.Graduate;
import bg.tu_varna.sit.operations.interrupt.Interrupt;
import bg.tu_varna.sit.operations.print.Print;
import bg.tu_varna.sit.operations.printall.PrintAll;
import bg.tu_varna.sit.operations.protocol.Protocol;
import bg.tu_varna.sit.operations.report.Report;
import bg.tu_varna.sit.operations.resume.Resume;

import java.util.Scanner;

public class SwitchCommands implements RunCommand {
    public void runCommand(String[] command) throws InvalidEnteredDataExceptions{
        CommandsEnum commandsEnum=CommandsEnum.valueOf(command[0].toUpperCase());
        switch (commandsEnum) {

            case ENROLL -> {
                new Enroll().enrollStudent(command[1],command[2],Integer.parseInt(command[3]), command[4]);
            }

            case ADVANCE->{
               // System.out.println("Факултетен номер: ");
               // String fn = scanner.nextLine();
                new Advance().AdvanceStudent(command[1]);
            }

            case CHANGE->{
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Опция(специалност/група/година): ");
                String option = scanner.nextLine();
                System.out.println("Стойност: ");
                String value = scanner.nextLine();*/
                new Change().changeStudent(command[1],command[2],command[3]);
            }

            case GRADUATE->{
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();*/
                new Graduate().graduateStudent(command[1]);
            }

            case INTERRUPT->{
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();*/
                new Interrupt().interruptStudent(command[1]);
            }

            case RESUME->{
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();*/
                new Resume().resumeStudent(command[1]);
            }

            case PRINT->{
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();*/
                new Print().printStudent(command[1]);
            }

            case PRINTALL -> {
                /*System.out.println("Специалност: ");
                String program = scanner.nextLine();
                System.out.println("Курс:");
                int course = scanner.nextInt();*/
                new PrintAll().printAllStudentsInSpecialtyAndCourse(command[1],Integer.parseInt(command[2]));
            }

            case ENROLLIN -> {
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Дисциплина:");
                String discipline = scanner.nextLine();*/
                new EnrollIn().enrollInDiscipline(command[1],command[2]);
            }

            case ADDGRADE -> {
               /* System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Дисциплина:");
                String discipline = scanner.nextLine();
                System.out.println("Оценка:");
                int grade=scanner.nextInt();*/
                new AddGrade().addGrade(command[1],command[2],Integer.parseInt(command[3]));
            }

            case PROTOCOL -> {
                /*System.out.println("Дисциплина:");
                String discipline = scanner.nextLine();*/
                new Protocol().protocolForDiscipline(command[1]);
            }

            case REPORT -> {
                //System.out.println("Факултетен номер: ");
                //String fn = scanner.nextLine();
                new Report().reportStudent(command[1]);
            }

            default ->
                throw new InvalidEnteredDataExceptions("Грешка! Въведена е навилидна операция!");

        }
        System.out.println("Успешно изпълнена операция " + commandsEnum.getCommandEnum() + "!");
    }
}

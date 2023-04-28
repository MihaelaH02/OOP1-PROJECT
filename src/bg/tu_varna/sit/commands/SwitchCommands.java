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
import bg.tu_varna.sit.verifications.VerifyGroup;

import java.util.Scanner;

public class SwitchCommands implements RunCommand {
    public void runCommand(String[] command) throws InvalidEnteredDataExceptions{
        //Scanner scanner = new Scanner(System.in);
        CommandsEnum commandsEnum=CommandsEnum.valueOf(command[0].toUpperCase());
        switch (commandsEnum) {

            case ENROLL -> {
                /*System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Специалност: ");
                String program = scanner.nextLine();
                System.out.println("Група: ");
                int group = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Име: ");
                String name = scanner.nextLine();*/
                new Enroll().enrollStudent(command[1],command[2],Integer.parseInt(command[3]), command[4]);
            }

            /*case ADVANCE->{
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                new Advance().AdvanceStudent(fn);
            }

            case CHANGE->{
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Опция(специалност/група/година): ");
                String option = scanner.nextLine();
                System.out.println("Стойност: ");
                String value = scanner.nextLine();
                new Change().changeStudent(fn,option,value);
            }

            case GRADUATE->{
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                new Graduate().graduateStudent(fn);
            }

            case INTERRUPT->{
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                new Interrupt().interruptStudent(fn);
            }

            case RESUME->{
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                new Resume().resumeStudent(fn);
            }

            case PRINT->{
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                new Print().printStudent(fn);
            }

            case PRINTALL -> {
                System.out.println("Специалност: ");
                String program = scanner.nextLine();
                System.out.println("Курс:");
                int course = scanner.nextInt();
                new PrintAll().printAllStudentsInSpecialtyAndCourse(program,course);
            }

            case ENROLLIN -> {
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Дисциплина:");
                String discipline = scanner.nextLine();
                new EnrollIn().enrollInDiscipline(fn,discipline);
            }

            case ADDGRADE -> {
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                System.out.println("Дисциплина:");
                String discipline = scanner.nextLine();
                System.out.println("Оценка:");
                int grade=scanner.nextInt();
                new AddGrade().addGrade(fn,discipline,grade);
            }

            case PROTOCOL -> {
                System.out.println("Дисциплина:");
                String discipline = scanner.nextLine();
                new Protocol().protocolForDiscipline(discipline);
            }

            case REPORT -> {
                System.out.println("Факултетен номер: ");
                String fn = scanner.nextLine();
                new Report().reportStudent(fn);
            }*/

            default ->
                throw new InvalidEnteredDataExceptions("Грешка! Въведена е навилидна операция!");

        }
        System.out.println("Успешно изпълнена операция " + commandsEnum.getCommandEnum() + "!");
    }
}

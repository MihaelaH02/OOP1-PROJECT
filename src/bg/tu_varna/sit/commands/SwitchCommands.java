package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.commands.operations.xml_file.Close;
import bg.tu_varna.sit.commands.operations.xml_file.Open;
import bg.tu_varna.sit.commands.operations.xml_file.Write;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.commands.operations.addgrade.AddGrade;
import bg.tu_varna.sit.commands.operations.advance.Advance;
import bg.tu_varna.sit.commands.operations.change.Change;
import bg.tu_varna.sit.commands.operations.enroll.Enroll;
import bg.tu_varna.sit.commands.operations.enrollin.EnrollIn;
import bg.tu_varna.sit.commands.operations.graduate.Graduate;
import bg.tu_varna.sit.commands.operations.interrupt.Interrupt;
import bg.tu_varna.sit.commands.operations.print.Print;
import bg.tu_varna.sit.commands.operations.printall.PrintAll;
import bg.tu_varna.sit.commands.operations.protocol.Protocol;
import bg.tu_varna.sit.commands.operations.report.Report;
import bg.tu_varna.sit.commands.operations.resume.Resume;

public class SwitchCommands implements RunCommand {
    private static boolean openFile=false;
    private static String pathFile;
    public void runCommand(String[] command) throws Exception {
        CommandsEnum commandsEnum = CommandsEnum.valueOf(command[0].toUpperCase());
        if (commandsEnum == CommandsEnum.OPEN) {
            pathFile = command[1];
            new Open().open(pathFile);
            openFile = true;

        } else if (openFile) {
            switch (commandsEnum) {
                case SAVE -> new Write().write(pathFile);

                case SAVEAS -> new Write().write(command[1]);

                //case HELP -> ;

                case CLOSE -> {
                    new Close().close();
                    openFile = false;
                }
                case EXIT ->  System.exit(0);

                case ENROLL -> new Enroll().enrollStudent(command[1], command[2], Integer.parseInt(command[3]), command[4]);

                case ADVANCE -> new Advance().AdvanceStudent(command[1]);

                case CHANGE -> new Change().changeStudent(command[1], command[2], command[3]);

                case GRADUATE -> new Graduate().graduateStudent(command[1]);

                case INTERRUPT -> new Interrupt().interruptStudent(command[1]);

                case RESUME -> new Resume().resumeStudent(command[1]);

                case PRINT -> new Print().printStudent(command[1]);

                case PRINTALL -> new PrintAll().printAllStudentsInSpecialtyAndCourse(command[1], Integer.parseInt(command[2]));

                case ENROLLIN -> new EnrollIn().enrollInDiscipline(command[1], command[2]);

                case ADDGRADE -> new AddGrade().addGrade(command[1], command[2], Integer.parseInt(command[3]));

                case PROTOCOL -> new Protocol().protocolForDiscipline(command[1]);

                case REPORT -> new Report().reportStudent(command[1]);

                default -> throw new InvalidEnteredDataExceptions("Грешка! Въведена е навилидна операция!");
            }
            System.out.println("Успешно изпълнена операция " + commandsEnum.getCommandEnum() + "!");
        }
    }
}

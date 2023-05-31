package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.commands.operations.xml_file.Close;
import bg.tu_varna.sit.commands.operations.xml_file.Open;
import bg.tu_varna.sit.commands.operations.xml_file.Write;
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
    public void runCommand(String[] commands) throws Exception {
        CommandsEnum command = CommandsEnum.valueOf(commands[0].toUpperCase());
        if (command == CommandsEnum.OPEN) {
            pathFile = commands[1];
            new Open().open(pathFile);
            openFile = true;
            for (int i = pathFile.length() - 1; i >= 0; i--)
                if (pathFile.charAt(i) == '\\') {
                    System.out.println("> open " + pathFile.substring(i + 1) + "\n");
                    break;
                }
        } else if (openFile) {
            System.out.println("> " + command.name().toLowerCase() + "\n");
            switch (command) {
                case SAVE -> new Write().write(pathFile);

                case SAVEAS -> new Write().write(commands[1]);

                case HELP -> {
                    System.out.println("The following commands are supported:\n");
                    for (CommandsEnum cmd: CommandsEnum.values())
                        System.out.println(cmd.name().toLowerCase() + "\t\t" + cmd.getCommandEnum() + "\n");
                }

                case CLOSE -> {
                    new Close().close();
                    openFile = false;
                }

                case EXIT ->  System.exit(0);

                case ENROLL -> new Enroll().enrollStudent(commands[1], commands[2], Integer.parseInt(commands[3]), commands[4]);

                case ADVANCE -> new Advance().AdvanceStudent(commands[1]);

                case CHANGE -> new Change().changeStudent(commands[1], commands[2], commands[3]);

                case GRADUATE -> new Graduate().graduateStudent(commands[1]);

                case INTERRUPT -> new Interrupt().interruptStudent(commands[1]);

                case RESUME -> new Resume().resumeStudent(commands[1]);

                case PRINT -> new Print().printStudent(commands[1]);

                case PRINTALL -> new PrintAll().printAllStudentsInSpecialtyAndCourse(commands[1], Integer.parseInt(commands[2]));

                case ENROLLIN -> new EnrollIn().enrollInDiscipline(commands[1], commands[2]);

                case ADDGRADE -> new AddGrade().addGrade(commands[1], commands[2], Integer.parseInt(commands[3]));

                case PROTOCOL -> new Protocol().protocolForDiscipline(commands[1]);

                case REPORT -> new Report().reportStudent(commands[1]);
            }
            System.out.println("Successfully " + command.name().toLowerCase() + " ");
        }
    }
}

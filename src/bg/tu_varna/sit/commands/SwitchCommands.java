package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.commands.operations.*;
import bg.tu_varna.sit.commands.operations.xml_file.Close;
import bg.tu_varna.sit.commands.operations.xml_file.Open;
import bg.tu_varna.sit.commands.operations.xml_file.Write;
import bg.tu_varna.sit.commands.operations.protocol.Protocol;

import java.util.ArrayList;

public class SwitchCommands implements RunCommand {
    private static boolean openFile=false;
    private static String pathFile;
    public void runCommand(ArrayList<String> commands) throws Exception {
        CommandsEnum command = CommandsEnum.valueOf(commands.get(0).toUpperCase());
        System.out.println("> " + command.name().toLowerCase());

        if(command == CommandsEnum.HELP) {
            String[] params=new String[]{"<file>","","","<file>","","","<fn><program><group><name>","<fn>","<fn><option><value>","<fn>","<fn>","<fn>","<fn>","<program><year>","<fn><course>","<fn><course><grade>","<course>","<fn>"};
            int i=0;
            System.out.println("The following commands are supported:");
            for (CommandsEnum cmd: CommandsEnum.values())
                System.out.printf("%-35s %s%n",cmd.name().toLowerCase() + " " + params[i++],cmd.getCommandEnum());
        }

        else if (command == CommandsEnum.EXIT){
            System.out.println("Exit the program...");
            System.exit(0);
        }

        else if (command == CommandsEnum.OPEN) {
            pathFile = commands.get(1);
            new Open().open(pathFile);
            openFile = true;
        }

        else if (openFile) {
            switch (command) {
                case SAVE -> new Write().write(pathFile);

                case SAVEAS -> new Write().write(commands.get(1));

                case CLOSE -> {
                    new Close().close();
                    openFile = false;
                }

                case ENROLL -> new Enroll().enrollStudent(commands.get(1), commands.get(2), Integer.parseInt(commands.get(3)), commands.get(4));

                case ADVANCE -> new Advance().AdvanceStudent(commands.get(1));

                case CHANGE -> new Change().changeStudent(commands.get(1), commands.get(2), commands.get(3));

                case GRADUATE -> new Graduate().graduateStudent(commands.get(1));

                case INTERRUPT -> new Interrupt().interruptStudent(commands.get(1));

                case RESUME -> new Resume().resumeStudent(commands.get(1));

                case PRINT -> new Print().printStudent(commands.get(1));

                case PRINTALL -> new PrintAll().printAllStudentsInSpecialtyAndCourse(commands.get(1), Integer.parseInt(commands.get(2)));

                case ENROLLIN -> new EnrollIn().enrollInDiscipline(commands.get(1), commands.get(2));

                case ADDGRADE -> new AddGrade().addGrade(commands.get(1), commands.get(2), Integer.parseInt(commands.get(3)));

                case PROTOCOL -> new Protocol().protocolForDiscipline(commands.get(1));

                case REPORT -> new Report().reportStudent(commands.get(1));
            }
        }
        System.out.println("Successfully " + command.name().toLowerCase());
    }
}

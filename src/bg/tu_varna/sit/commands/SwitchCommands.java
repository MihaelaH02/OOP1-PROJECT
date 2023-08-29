package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.commands.commands.*;
import bg.tu_varna.sit.commands.commands.operations_with_student.*;
import bg.tu_varna.sit.commands.commands.xml_file.Close;
import bg.tu_varna.sit.commands.commands.xml_file.Open;
import bg.tu_varna.sit.commands.commands.xml_file.Write;
import bg.tu_varna.sit.commands.commands.protocol.Protocol;

public class SwitchCommands implements RunCLI {
    private static boolean openFile=false;
    private static String pathFile;
    public void runCommand(String[] args) throws Exception {
        CommandsEnum command = CommandsEnum.valueOf(args[0].toUpperCase());
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
            pathFile = args[1];
            new Open(pathFile).execute();
            openFile = true;
        }

        else if (openFile) {
            switch (command) {
                case SAVE -> new Write(pathFile).execute();
                case SAVEAS -> new Write(args[1]).execute();
                case CLOSE -> {
                    new Close().execute();
                    openFile = false;
                }
                case ENROLL -> new Enroll(args[1], args[2], Integer.parseInt(args[3]), args[4]).execute();
                case ADVANCE -> new Advance(args[1]).execute();
                case CHANGE -> new Change(args[1], args[2], args[3]).execute();
                case GRADUATE -> new Graduate(args[1]).execute();
                case INTERRUPT -> new Interrupt(args[1]).execute();
                case RESUME -> new Resume(args[1]).execute();
                case PRINT -> new Print(args[1]).execute();
                case PRINTALL -> new PrintAll(args[1], Integer.parseInt(args[2])).execute();
                case ENROLLIN -> new EnrollIn(args[1], args[2]).execute();
                case ADDGRADE -> new AddGrade(args[1], args[2], Integer.parseInt(args[3])).execute();
                case PROTOCOL -> new Protocol(args[1]).execute();
                case REPORT -> new Report(args[1]).execute();
            }
        }
        System.out.println("Successfully do operation " + command.name().toLowerCase());
    }
}

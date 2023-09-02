package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.commands.commands.*;
import bg.tu_varna.sit.commands.commands.operations_with_student.*;
import bg.tu_varna.sit.commands.commands.xml_file.Close;
import bg.tu_varna.sit.commands.commands.xml_file.Open;
import bg.tu_varna.sit.commands.commands.xml_file.Write;
import bg.tu_varna.sit.commands.commands.protocol.Protocol;

import java.util.Scanner;

public class SwitchCommands implements RunCLI {
    private static boolean openFile=false;
    private static String pathFile;
    public void runCommand() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] params = input.split("(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)\\s+");
            for (int i = 0; i < params.length; i++)
                params[i] = params[i].replace("\"", "");

            CommandsEnum command = CommandsEnum.valueOf(params[0].toUpperCase());
            System.out.println("> " + command.name().toLowerCase());

            if (command == CommandsEnum.HELP) {
                String[] paramsToTake = new String[]{"<file>", "", "", "<file>", "", "", "<fn><program><group><name>", "<fn>", "<fn><option><value>", "<fn>", "<fn>", "<fn>", "<fn>", "<program><year>", "<fn><course>", "<fn><course><grade>", "<course>", "<fn>"};
                int i = 0;
                System.out.println("The following commands are supported:");
                for (CommandsEnum cmd : CommandsEnum.values())
                    System.out.printf("%-35s %s%n", cmd.name().toLowerCase() + " " + paramsToTake[i++], cmd.getCommandEnum());

            } else if (command == CommandsEnum.EXIT) {
                System.out.println("Exit the program...");
                System.exit(1);

            } else if (command == CommandsEnum.OPEN) {
                pathFile = params[1];
                new Open(pathFile).execute();
                openFile = true;

            } else if (openFile) {
                switch (command) {
                    case SAVE -> new Write(pathFile).execute();
                    case SAVEAS -> new Write(params[1]).execute();
                    case CLOSE -> {
                        new Close().execute();
                        openFile = false;
                    }
                    case ENROLL -> new Enroll(params[1], params[2], Integer.parseInt(params[3]), params[4]).execute();
                    case ADVANCE -> new Advance(params[1]).execute();
                    case CHANGE -> new Change(params[1], params[2], params[3]).execute();
                    case GRADUATE -> new Graduate(params[1]).execute();
                    case INTERRUPT -> new Interrupt(params[1]).execute();
                    case RESUME -> new Resume(params[1]).execute();
                    case PRINT -> new Print(params[1]).execute();
                    case PRINTALL -> new PrintAll(params[1], Integer.parseInt(params[2])).execute();
                    case ENROLLIN -> new EnrollIn(params[1], params[2]).execute();
                    case ADDGRADE -> new AddGrade(params[1], params[2], Integer.parseInt(params[3])).execute();
                    case PROTOCOL -> new Protocol(params[1]).execute();
                    case REPORT -> new Report(params[1]).execute();
                }
            } else throw new Exception("Operation error, file not open!");
            System.out.println("Successfully do operation " + command.name().toLowerCase());
        }
    }
}

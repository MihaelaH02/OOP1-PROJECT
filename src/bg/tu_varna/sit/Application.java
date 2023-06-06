package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.GetCommandAndParams;
import bg.tu_varna.sit.commands.SwitchCommands;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        new AddSpecialties().addSpecialties();
        Scanner scanner=new Scanner(System.in);
        SwitchCommands commands=new SwitchCommands();
        while (true) {
            String input = scanner.nextLine();
            commands.runCommand(new GetCommandAndParams().getCommandAndParams(input));
        }
    }
}

//C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml
//cd C:\Users\MIHAELA\Desktop\OOP1-PROJECT\out\production\OOP1-PROJECT
//java -cp . bg.tu_varna.sit.Application

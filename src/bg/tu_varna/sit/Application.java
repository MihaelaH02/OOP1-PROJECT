package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;

import java.util.Arrays;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) throws Exception {
        new AddSpecialties().addSpecialties();
        Scanner scanner=new Scanner(System.in);
        SwitchCommands commands=new SwitchCommands();

        while (true) {
            String input = scanner.nextLine();
            System.out.println(Arrays.toString(input.split("\\s+ (?= (?:[^\"]*\"[^\"]*\") *[^\"]*$)")));
            //System.out.println(Arrays.toString(input.split("\\s*(?<=\\s|^)\"|\"\\s*(?=\\s|$)\\s+")));

            // commands.runCommand(input.split("\\s+"));
        }
    }
}

//C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml
//cd C:\Users\MIHAELA\Desktop\OOP1-PROJECT\out\production\OOP1-PROJECT
//java -cp . bg.tu_varna.sit.Application

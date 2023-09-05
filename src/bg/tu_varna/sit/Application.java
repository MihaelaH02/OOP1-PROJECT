package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;



public class Application {
    public static void main(String[] args) throws Exception {
        new AddSpecialties().addSpecialties();

        SwitchCommands commands = new SwitchCommands();
        commands.runCommand();
    }
}

//C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml
//cd C:\Users\MIHAELA\Desktop\OOP1-PROJECT\out\production\OOP1-PROJECT
//java -cp . bg.tu_varna.sit.Application

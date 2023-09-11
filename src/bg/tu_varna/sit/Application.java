package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;



public class Application {
    public static void main(String[] args) throws Exception {
        new AddSpecialties().addSpecialties();

        SwitchCommands commands = new SwitchCommands();
        commands.runCommand();
    }
}
//123457(студент в 3ти курс с всичси преминали дисциплини), 12345(студент записал всички дисциплини от кст и сит)

//cd C:\Users\MIHAELA\Desktop\OOP1-PROJECT\out\production\OOP1-PROJECT
//java -cp . bg.tu_varna.sit.Application
//help
// open C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml

//enroll 123445 sit 3 "Stefan Stefanov"
//print 123445
//enrollin 123445 "Base programming"
//addgrade 123445 "Base programming" 6
//protocol "Base programming"
//printall kst 1

//change 123452 group 1
//change 123452 program sit
//advance 123452

//change 123457 year 4
//interrupt 123457
//resume 123457

//enrollin 123457 "Network administration"
//addgrade 123457 "Network administration" 6
//enrollin 123457 "Language processors"
//addgrade 123457 "Language processors" 5
// enrollin 123457 "Artificial Intelligence"
//addgrade 123457 "Artificial Intelligence" 3

//graduate 123457
//report 123457

//save
//saveas C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University_New.xml
//close
//exit

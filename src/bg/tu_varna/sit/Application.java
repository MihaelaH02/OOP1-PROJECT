package bg.tu_varna.sit;

import bg.tu_varna.sit.commands.SwitchCommands;



public class Application {
    public static void main(String[] args) throws Exception {
        new AddSpecialties().addSpecialties();

        SwitchCommands commands = new SwitchCommands();
        commands.runCommand();

           /* ArrayList<String> result = new ArrayList<>();
            Pattern pattern = Pattern.compile("\"([^\"]*)\"|\\S+");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    // Ако съвпадение е в двойни кавички, добавете групата в резултата
                    result.add(matcher.group(1));
                } else {
                    // Ако няма двойни кавички, добавете съвпадението без интервали
                    result.add(matcher.group());
                }
            }
            String[] str =result.toArray(new String[0]);*/
    }
}

//C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml
//cd C:\Users\MIHAELA\Desktop\OOP1-PROJECT\out\production\OOP1-PROJECT
//java -cp . bg.tu_varna.sit.Application

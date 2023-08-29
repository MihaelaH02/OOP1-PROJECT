package bg.tu_varna.sit.commands.commands.xml_file;

import bg.tu_varna.sit.commands.ExecuteCommand;
import bg.tu_varna.sit.university.students.StudentsList;

public class Close implements ExecuteCommand {
    @Override
    public void execute() {
        StudentsList.setInstance(null);
    }
}

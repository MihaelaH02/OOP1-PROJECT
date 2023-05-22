package bg.tu_varna.sit.commands.operations.xml_file;

import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;

public class Close {
    public void close(){
        StudentsList.setInstance(null);
    }
}

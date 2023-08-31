package bg.tu_varna.sit.university.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class ValidateData {
    public int verifyCourse(int course)throws InvalidEnteredDataExceptions {
        if(course<0 || course>5) throw new InvalidEnteredDataExceptions("failed, invalid entered data for year.");
        else return course;
    }
    public void verifyGrade(int grade)throws InvalidEnteredDataExceptions {
        if(grade<2 || grade>6) throw new InvalidEnteredDataExceptions("failed, invalid entered data for grade");
    }

    public int verifyGroup(int group)throws InvalidEnteredDataExceptions {
        if(group<0 || group>10) throw new InvalidEnteredDataExceptions("failed, invalid entered data for group");
        else return group;
    }

    public String verifyString(String string)throws InvalidEnteredDataExceptions {
        if(string == null || string.isEmpty()) throw new InvalidEnteredDataExceptions("failed, invalid entered data for string");
        else return string;
    }
}

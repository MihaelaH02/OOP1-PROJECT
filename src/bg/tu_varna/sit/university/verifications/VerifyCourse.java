package bg.tu_varna.sit.university.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class VerifyCourse {

    public int verifyCourse(int course)throws InvalidEnteredDataExceptions {
        if(course<0 || course>5) throw new InvalidEnteredDataExceptions("failed, invalid entered data for year.");
        else return course;
    }
}

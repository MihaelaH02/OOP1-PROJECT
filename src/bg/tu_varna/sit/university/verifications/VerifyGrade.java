package bg.tu_varna.sit.university.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class VerifyGrade {

    public void verifyGrade(int grade)throws InvalidEnteredDataExceptions {
        if(grade<2 || grade>6) throw new InvalidEnteredDataExceptions("failed, invalid entered data for grade");
    }
}

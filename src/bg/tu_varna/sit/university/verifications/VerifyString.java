package bg.tu_varna.sit.university.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class VerifyString {

    public String verifyString(String string)throws InvalidEnteredDataExceptions {
        if(string == null || string.isEmpty()) throw new InvalidEnteredDataExceptions("failed, invalid entered data for string");
        else return string;
    }
}

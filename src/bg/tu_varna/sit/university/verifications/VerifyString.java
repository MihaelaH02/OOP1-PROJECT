package bg.tu_varna.sit.university.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class VerifyString {

    public String verifyString(String string)throws InvalidEnteredDataExceptions {
        if(string == null || string.isEmpty()) throw new InvalidEnteredDataExceptions("Грешка! Въведели сте празен низ!");
        else return string;
    }
}

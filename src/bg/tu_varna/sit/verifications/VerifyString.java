package bg.tu_varna.sit.verifications;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;

public class VerifyString {
    private final String string;

    public VerifyString(String string) throws InvalidEnteredDataExceptions{
        this.string=verifyString(string);
    }

    private String verifyString(String string)throws InvalidEnteredDataExceptions {
        if(string == null || string.isEmpty()) throw new InvalidEnteredDataExceptions("Грешка! Въведели сте празен низ!");
        else return string;
    }

    public String getString() {
        return string;
    }
}

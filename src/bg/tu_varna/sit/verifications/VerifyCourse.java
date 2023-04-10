package bg.tu_varna.sit.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class VerifyCourse {

    public int verifyCourse(int course)throws InvalidEnteredDataExceptions {
        if(course<0 || course>5) throw new InvalidEnteredDataExceptions("Грешка! Въведели сте некоректни данни за курс!");
        else return course;
    }
}

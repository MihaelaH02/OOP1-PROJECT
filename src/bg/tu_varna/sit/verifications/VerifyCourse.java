package bg.tu_varna.sit.verifications;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;

public class VerifyCourse {
    private final int course;

    public VerifyCourse(int course) throws InvalidEnteredDataExceptions {
        this.course=verifyCourse(course);
    }

    private int verifyCourse(int course)throws InvalidEnteredDataExceptions {
        if(course<0 || course>5) throw new InvalidEnteredDataExceptions("Грешка! Въведели сте некоректни данни за курс!");
        else return course;
    }

    public int getCourse() {
        return course;
    }
}

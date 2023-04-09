package bg.tu_varna.sit.verifications;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;

public class VerifyGrade {
    private final int grade;

    public VerifyGrade(int grade) throws InvalidEnteredDataExceptions {
        this.grade=verifyGrade(grade);
    }

    private int verifyGrade(int course)throws InvalidEnteredDataExceptions {
        if(course<0 || course>6) throw new InvalidEnteredDataExceptions("Грешка! Въведели сте некоректни данни за оценка!");
        else return course;
    }

    public int getGrade() {
        return grade;
    }
}

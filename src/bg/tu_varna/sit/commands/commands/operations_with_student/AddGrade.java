package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.verifications.ValidateData;

public class AddGrade extends FinedStudent {
    private final String discipline;
    private final int garde;

    public AddGrade(String facultyNumber, String discipline, int garde) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
        this.discipline = new ValidateData().verifyString(discipline);
        this.garde = new ValidateData().verifyGrade(garde);
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        if(super.getStudent().getStudent().getStatus() == StatusEnum.ENROLL)
            super.getStudent().putElement(super.getStudent().getEnrolledDisciplines((discipline)),garde);
        else
            throw new InvalidEnteredDataExceptions("failed in adding grade in discipline " + discipline + " for student");
    }
}
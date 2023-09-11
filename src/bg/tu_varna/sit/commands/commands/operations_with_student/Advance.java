package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;

public class Advance extends FinedStudent {
    public Advance(String facultyNumber) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        if(super.getStudent().getStudent().getCourse()==4) throw new InvalidEnteredDataExceptions("failed, the student is already in  4 year");
        if(super.getStudent().getStudent().getStatus() == StatusEnum.ENROLL) {
            super.getStudent().getStudent().setCourse(super.getStudent().getStudent().getCourse() + 1);
        }
        else throw new InvalidEnteredDataExceptions("failed in advancing student in next year.");
    }
}

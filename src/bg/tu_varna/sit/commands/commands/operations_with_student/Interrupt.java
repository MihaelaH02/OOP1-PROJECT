package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;

public class Interrupt extends FinedStudent {
    public Interrupt(String facultyNumber) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        if(super.getStudent().getStudent().getStatus()==StatusEnum.DISCONTINUED) throw new InvalidEnteredDataExceptions("failed in marking the status of the student to discontinued, the status of the student is already discontinue.");
        super.getStudent().getStudent().setStatus(StatusEnum.DISCONTINUED);
    }
}

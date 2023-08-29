package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;

public class Resume extends FinedStudent {

    public Resume(String facultyNumber) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        if(super.getStudent().getStudent().getStatus() != StatusEnum.DISCONTINUED) throw new InvalidEnteredDataExceptions("failed marking status of the student to enrolled, it is already marked as enrolled");
        super.getStudent().getStudent().setStatus(StatusEnum.ENROLL);
    }
}

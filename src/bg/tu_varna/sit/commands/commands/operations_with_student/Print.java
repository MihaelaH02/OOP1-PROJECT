package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class Print extends FinedStudent {
    public Print(String facultyNumber) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
    }
    @Override
    public void execute() throws Exception {
        System.out.println(super.getStudent().getStudent().toString());

    }
}

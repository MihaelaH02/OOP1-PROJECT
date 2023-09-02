package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.students.CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse;
import bg.tu_varna.sit.university.enums.StatusEnum;

public class Graduate extends FinedStudent {
    public Graduate(String facultyNumber) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        if (super.getStudent().getStudent().getStatus() == StatusEnum.ENROLL)
            if(super.getStudent().getStudent().getCourse() == 4){
                new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse(super.getStudent()).checkForEnrollingAllTheDisciplinesForTheCourse(super.getStudent().getStudent().getSpecialty());
                super.getStudent().getStudent().setStatus(StatusEnum.GRADUATED);
            }
        else throw new InvalidEnteredDataExceptions("failed in marking the status of the student with faculty number to graduated, the student is not in 4th year or his status is already marked as graduated.");
    }
}

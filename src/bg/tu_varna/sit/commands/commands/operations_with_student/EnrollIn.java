package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.verifications.ValidateData;

public class EnrollIn extends FinedStudent {
    private final Discipline discipline;

    public EnrollIn(String facultyNumber,String discipline) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
        this.discipline = super.getStudent().getStudent().getSpecialty().getKey(new ValidateData().verifyString(discipline));
    }

    @Override
    public void execute() throws Exception {

        if(super.getStudent().getStudent().getStatus() == StatusEnum.ENROLL) {
            if (super.getStudent().getStudent().getCourse() == super.getStudent().getStudent().getSpecialty().getValue(discipline.getName()))
                super.getStudent().putElement(discipline, 2);
            else throw new InvalidEnteredDataExceptions("failed in enrolls student in discipline " + discipline +" , the discipline is not appropriate for student`s year.");
        }
        else throw new InvalidEnteredDataExceptions ("failed in enrolls student in discipline " + discipline +" , the status of the student is not enrolled.");

    }
}

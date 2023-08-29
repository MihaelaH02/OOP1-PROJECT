package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetDiscipline;

public class AddGrade extends FinedStudent {
    private final String discipline;
    private final int garde;

    public AddGrade(String facultyNumber, String discipline, int garde) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
        this.discipline = discipline;
        this.garde = garde;
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        if(super.getStudent().getStudent().getStatus() == StatusEnum.ENROLL)
            super.getStudent().putElement(new GetDiscipline().getDisciplineFromSpecialty(discipline,super.getStudent().getMap()),garde);
        else
            throw new InvalidEnteredDataExceptions("failed in adding grade in discipline " + discipline + " for student");
    }
}
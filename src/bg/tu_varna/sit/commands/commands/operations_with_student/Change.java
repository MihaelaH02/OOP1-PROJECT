package bg.tu_varna.sit.commands.commands.operations_with_student;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.get_data.CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.verifications.ValidateData;

public class Change extends FinedStudent {
    private final String option;
     private final String value;

    public Change(String facultyNumber, String option, String value) throws InvalidEnteredDataExceptions {
        super(facultyNumber);
        this.option = option;
        this.value = value;
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {

        if (super.getStudent().getStudent().getStatus() == StatusEnum.ENROLL)
            switch (option) {
                case "group" -> {
                    new ValidateData().verifyGroup(Integer.parseInt(value));
                    if(Integer.parseInt(value) == super.getStudent().getStudent().getGroup()) throw new InvalidEnteredDataExceptions("failed in changing the group of the student, he is already in this group.");
                    super.getStudent().getStudent().setGroup(Integer.parseInt(value));
                }
                case "year" -> {
                    new ValidateData().verifyCourse(Integer.parseInt(value));
                    if((Integer.parseInt(value)-super.getStudent().getStudent().getCourse()) != 1) throw new InvalidEnteredDataExceptions("failed in changing the year of the student, transferring to a year other than the next is not possible.");
                    new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(super.getStudent(),super.getStudent().getStudent().getSpecialty());
                    super.getStudent().getStudent().setCourse(super.getStudent().getStudent().getCourse()+1);
                }
                case "program" -> {
                    Specialty specialty = new GetSpecialtyWithTitle().getSpecialtyFromList(value);
                    if (specialty.getSpecialtyTitle().equals(super.getStudent().getStudent().getSpecialty().getSpecialtyTitle())) throw new InvalidEnteredDataExceptions("failed in changing the program of the student, he is already in this program.");
                    new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(super.getStudent(),specialty);
                    super.getStudent().getStudent().setSpecialty(specialty);
                }
                default -> throw new InvalidEnteredDataExceptions("failed in changes program, group or year of the student, entered invalid option.");
            }
        else
            throw new InvalidEnteredDataExceptions("failed in changes program, group or year of the student with faculty number, his status is not enroll.");
    }
}

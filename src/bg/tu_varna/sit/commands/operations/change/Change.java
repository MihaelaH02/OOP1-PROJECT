package bg.tu_varna.sit.commands.operations.change;

import bg.tu_varna.sit.commands.operations.advance.Advance;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.get_data.CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.get_data.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.get_data.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.verifications.VerifyCourse;
import bg.tu_varna.sit.university.verifications.VerifyGroup;

public class Change {
    public void changeStudent(String facultyNumber, String option, String value) throws InvalidEnteredDataExceptions {
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        if (student.getStudent().getStatus() == StatusEnum.ENROLL)
            switch (option) {
                case "group" -> {
                    new VerifyGroup().verifyGroup(Integer.parseInt(value));
                    if(Integer.parseInt(value) == student.getStudent().getGroup()) throw new InvalidEnteredDataExceptions("failed in changing the group of the student with faculty number " + facultyNumber + ", he is already in this group.");
                    student.getStudent().setGroup(Integer.parseInt(value));
                }
                case "year" -> {
                    new VerifyCourse().verifyCourse(Integer.parseInt(value));
                    if((Integer.parseInt(value)-student.getStudent().getCourse()) != 1) throw new InvalidEnteredDataExceptions("failed in changing the year of the student with faculty number" + facultyNumber + ", transferring to a year other than the next is not possible.");
                    new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(student,student.getStudent().getSpecialty());
                    new Advance().AdvanceStudent(facultyNumber);
                }
                case "program" -> {
                    Specialty specialty = new GetSpecialtyWithTitle().getSpecialtyFromList(value);
                    if (specialty.getSpecialtyTitle().equals(student.getStudent().getSpecialty().getSpecialtyTitle())) throw new InvalidEnteredDataExceptions("failed in changing the program of the student with faculty number" + facultyNumber + ",he is already in this program.");
                    new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(student,specialty);
                    student.getStudent().setSpecialty(specialty);
                }
                default -> throw new InvalidEnteredDataExceptions("failed in changes program, group or year of the student with faculty number " + facultyNumber + ", entered invalid option.");
            }
        else
            throw new InvalidEnteredDataExceptions("failed in changes program, group or year of the student with faculty number " + facultyNumber + ", his status is not enroll.");
    }
}

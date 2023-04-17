package bg.tu_varna.sit.operations.change;

import bg.tu_varna.sit.operations.advance.Advance;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.specialties.GetSpecialtyWithTitle;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.verifications.VerifyCourse;
import bg.tu_varna.sit.verifications.VerifyGroup;

public class Change {
    public void changeStudent(String facultyNumber, String option, String value) throws InvalidEnteredDataExceptions {
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        if (student.getStudent().getStatus() == StatusEnum.ENROLL)
            switch (option) {
                case "група" -> {
                    new VerifyGroup().verifyGroup(Integer.parseInt(value));
                    if(Integer.parseInt(value) == student.getStudent().getGroup()) throw new InvalidEnteredDataExceptions("Грешка! Неуспешно променяне на група, студент с факултетен номер " + facultyNumber + " е вече в " + Integer.parseInt(value) + " група!");
                    student.getStudent().setGroup(Integer.parseInt(value));
                }
                case "курс" -> {
                    new VerifyCourse().verifyCourse(Integer.parseInt(value));
                    if((Integer.parseInt(value)-student.getStudent().getCourse()) != 1) throw new InvalidEnteredDataExceptions("Грешка! Прехвърляне в курс, различен от следващия, не е възможно!");
                    new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(student,student.getStudent().getSpecialty());
                    new Advance().AdvanceStudent(facultyNumber);
                }
                case "специалност" -> {
                    Specialty specialty = new GetSpecialtyWithTitle().getSpecialtyFromList(value);
                    if (specialty.getSpecialtyTitle().equals(student.getStudent().getSpecialty().getSpecialtyTitle())) throw new InvalidEnteredDataExceptions("Грешка! Студентът вече е записан в тази специалност!");
                    new CheckIfStudentIsEnrollAllTheDisciplinesForTheCourse().checkForEnrollingAllTheDisciplinesForTheCourse(student,specialty);
                    student.getStudent().setSpecialty(specialty);
                }
                default -> throw new InvalidEnteredDataExceptions("Грешка! Въвели сте невалидна опция!");
            }
        else
            throw new InvalidEnteredDataExceptions("Грешка! Неуспешно направени промени, студент с факултетн номер " + facultyNumber + " е прекъснал!");
    }
}

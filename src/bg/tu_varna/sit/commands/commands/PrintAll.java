package bg.tu_varna.sit.commands.commands;

import bg.tu_varna.sit.commands.ExecuteCommand;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;
import bg.tu_varna.sit.university.verifications.ValidateData;

public class PrintAll implements ExecuteCommand {
    private final String specialty;
    private final int course;
    private boolean flagFindStudentInSpecialtyAndCourse;


    public PrintAll(String specialty, int course) throws InvalidEnteredDataExceptions {
        this.specialty = specialty;
        this.course = new ValidateData().verifyCourse(course);
        this.flagFindStudentInSpecialtyAndCourse=false;
    }

    @Override
    public void execute() throws Exception {
        for (GradesForStudent oneStudent : StudentsList.getInstance().getAllStudents()) {
            if (oneStudent.getStudent().getSpecialty().getSpecialtyTitle().equals(specialty.toUpperCase()))
                if(oneStudent.getStudent().getCourse() == course) {
                    System.out.println(oneStudent.getStudent().toString());
                    flagFindStudentInSpecialtyAndCourse = true;
                }
        }
        if(!flagFindStudentInSpecialtyAndCourse) throw new InvalidEnteredDataExceptions("failed printing reference for all students in program " + specialty + " and year " + course);

    }
}

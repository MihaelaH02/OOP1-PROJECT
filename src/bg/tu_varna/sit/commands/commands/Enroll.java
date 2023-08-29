package bg.tu_varna.sit.commands.commands;

import bg.tu_varna.sit.commands.ExecuteCommand;
import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.Student;
import bg.tu_varna.sit.university.students.StudentsList;

public class Enroll implements ExecuteCommand {
    private final StudentsList studentsList;
    private final String facultyNumber;
    private final String program;
    private final int group;
    private final String name;


    public Enroll(String facultyNumber, String program, int group, String name) {
        this.facultyNumber = facultyNumber;
        this.program = program;
        this.group = group;
        this.name = name;
        this.studentsList = StudentsList.getInstance();
    }

    @Override
    public void execute() throws InvalidEnteredDataExceptions {
        for (GradesForStudent oneStudent : studentsList.getAllStudents()) {
            if (oneStudent.getStudent().getFacultyNumber().equals(facultyNumber))
                throw new InvalidEnteredDataExceptions("failed in  enrolls student with faculty number " + facultyNumber + ", he is already enrolled.");
        }
        studentsList.getAllStudents().add(new GradesForStudent(new Student(name, facultyNumber, 1, program, group, StatusEnum.ENROLL)));
    }
}

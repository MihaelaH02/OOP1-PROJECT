package bg.tu_varna.sit.change;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.students.GetStudentWithFacultyNumber;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;

public class Change {
    public void Change(String facultyNumber, String option, String value) throws InvalidEnteredDataExceptions{
        GradesForStudent student = new GetStudentWithFacultyNumber().findStudentWithFacultyNumber(facultyNumber);
        switch (option){
            case "специалност":{

            }break;

            case "група":{
                student.getStudent().setGroup(Integer.parseInt(value));
            }break;
            case "курс":{

            }break;

            default: throw new InvalidEnteredDataExceptions("Грешка! Въвели сте невалидна опция!");
        }
    }
}

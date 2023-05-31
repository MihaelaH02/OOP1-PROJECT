package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.verifications.VerifyCourse;
import bg.tu_varna.sit.university.verifications.VerifyString;

import java.util.HashMap;
import java.util.Map;

public class Specialty{
    private final String specialtyTitle;
    private final Map<Discipline, Integer> disciplinesForSpecialty;

    public Specialty(String specialty) throws InvalidEnteredDataExceptions{
           this.specialtyTitle = new VerifyString().verifyString(specialty);
            this.disciplinesForSpecialty = new HashMap<>();
    }

    public String getSpecialtyTitle() {
        return specialtyTitle;
    }

    public Map<Discipline, Integer> getMap() {
        return disciplinesForSpecialty;
    }

    public void addElement(Discipline key, Integer value) throws InvalidEnteredDataExceptions {
        this.getMap().put(key,(new VerifyCourse().verifyCourse(value)));
    }

    public Integer getValue(java.lang.String key) throws InvalidEnteredDataExceptions{//изведи в друг клас
        for (Map.Entry<Discipline, Integer> entry : getMap().entrySet()) {
            if (entry.getKey().getName().equals(key)) {
                return entry.getValue();
            }
        }
        throw new InvalidEnteredDataExceptions("failed, there are no discipline with such name.");
    }

    public void printSpecialty() {
        System.out.println("Program " + this.getSpecialtyTitle() + " :");
        for (Map.Entry<Discipline, Integer> discipline : this.getMap().entrySet()) {
            System.out.println(discipline.getKey().getName() + " в  " + discipline.getValue() + " year\n");
        }
    }
}

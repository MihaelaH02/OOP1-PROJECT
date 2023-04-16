package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.SpecialtyEnum;
import bg.tu_varna.sit.verifications.VerifyCourse;

import java.util.HashMap;
import java.util.Map;

public class Specialty{
    private final SpecialtyEnum specialty;
    private final Map<Discipline, Integer> disciplinesForSpecialty;

    public Specialty(SpecialtyEnum specialty) {
           this.specialty = specialty;
            this.disciplinesForSpecialty = new HashMap<>();
    }

    public SpecialtyEnum getSpecialty() {
        return specialty;
    }

    public Map<Discipline, Integer> getMap() {
        return disciplinesForSpecialty;
    }

    public void AddElement(Discipline key, Integer value) throws InvalidEnteredDataExceptions {
        this.getMap().put(key,(new VerifyCourse().verifyCourse(value)));
    }

    public Integer getValue(String key) throws InvalidEnteredDataExceptions{
        for (Map.Entry<Discipline, Integer> entry : getMap().entrySet()) {
            if (entry.getKey().getName().equals(key)) {
                return entry.getValue();
            }
        }
        throw new InvalidEnteredDataExceptions("Грешка! Дисциплината, която искате да достъпите не е налична!\"");
    }

    public void RemoveElement(Discipline key, Integer value){
        this.getMap().remove(key,value);
    }

    public void printSpecialty() {
        System.out.println("Специалност " + this.getSpecialty() + " :");
        for (Map.Entry<Discipline, Integer> discipline : this.getMap().entrySet()) {
            System.out.println(discipline.getKey().getName() + " в  " + discipline.getValue() + " курс\n");
        }
    }
}

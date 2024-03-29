package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.verifications.ValidateData;

import java.util.HashMap;
import java.util.Map;

public class Specialty {
    private final String specialtyTitle;
    private final Map<Discipline, Integer> disciplinesForSpecialty;

    public Specialty(String specialty) throws InvalidEnteredDataExceptions {
        this.specialtyTitle = new ValidateData().verifyString(specialty);
        this.disciplinesForSpecialty = new HashMap<>();
    }

    public String getSpecialtyTitle() {
        return specialtyTitle;
    }

    public Map<Discipline, Integer> getMap() {
        return disciplinesForSpecialty;
    }

    public void addElement(Discipline key, Integer value) throws InvalidEnteredDataExceptions {
        this.getMap().put(key, (new ValidateData().verifyCourse(value)));
    }

    public Integer getValue(String key) throws InvalidEnteredDataExceptions {
        for (Map.Entry<Discipline, Integer> entry : getMap().entrySet()) {
            if (entry.getKey().getName().equals(key))
                return entry.getValue();
        }
        throw new InvalidEnteredDataExceptions("failed, there are no discipline with such name.");
    }

    public Discipline getKey(String discipline) throws InvalidEnteredDataExceptions {
        for (Discipline oneDiscipline : this.disciplinesForSpecialty.keySet()) {
            if (oneDiscipline.getName().equals(discipline))
                return oneDiscipline;
        }
        throw new InvalidEnteredDataExceptions("failed, there are no discipline with such name");
    }
}

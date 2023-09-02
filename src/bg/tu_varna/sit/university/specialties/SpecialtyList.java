package bg.tu_varna.sit.university.specialties;


import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

import java.util.ArrayList;
import java.util.List;

public class SpecialtyList {
    private static SpecialtyList instance;
    private final List<Specialty> allSpecialties;

    private SpecialtyList() {
        this.allSpecialties = new ArrayList<>();
    }

    public static SpecialtyList getInstance() {
        if (instance == null) instance = new SpecialtyList();
        return instance;
    }

    public List<Specialty> getAllSpecialties() {
        return allSpecialties;
    }
    public Specialty getSpecialtyFromList(String specialty) throws InvalidEnteredDataExceptions {
        for (Specialty oneSpecialty : this.getAllSpecialties()) {
            if (oneSpecialty.getSpecialtyTitle().equals(specialty.toUpperCase()))
                return oneSpecialty;
        }
        throw new InvalidEnteredDataExceptions("failed, there are no program with such name");
    }

    public void addElement(Specialty specialty) {
        this.allSpecialties.add(specialty);
    }
}

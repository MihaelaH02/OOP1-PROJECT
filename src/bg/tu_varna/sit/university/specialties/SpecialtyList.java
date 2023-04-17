package bg.tu_varna.sit.university.specialties;


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

    public void addElement(Specialty specialty) {
        this.allSpecialties.add(specialty);
    }


    public void printArray(){
        for (Specialty specialty : this.getAllSpecialties()) {
            System.out.println(specialty.getMap());
        }
    }
}

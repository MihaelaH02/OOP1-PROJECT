package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
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

    public Map<Discipline, Integer> getDisciplinesForSpecialtyMap() {
        return disciplinesForSpecialty;
    }

    public void AddElement(Discipline key, Integer value) throws InvalidEnteredDataExceptions {
        this.getDisciplinesForSpecialtyMap().put(key,(new VerifyCourse(value)).getCourse());
    }

    public void RemoveElement(Discipline key, Integer value){
        this.getDisciplinesForSpecialtyMap().remove(key,value);
    }

    public boolean containsDiscipline(Discipline discipline){
            return getDisciplinesForSpecialtyMap().containsKey(discipline);
    }

    public void printSpecialty() {
        System.out.println("Специалност " + this.getSpecialty() + " :");
        for (Map.Entry<Discipline, Integer> discipline : this.getDisciplinesForSpecialtyMap().entrySet()) {
            System.out.println(discipline.getKey().getName() + " в  " + discipline.getValue() + " курс\n");
        }
    }
}

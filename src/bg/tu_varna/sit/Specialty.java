package bg.tu_varna.sit;

import bg.tu_varna.sit.Enums.SpecialtyEnum;

import java.util.Map;

public class Specialty{
    private SpecialtyEnum specialty;
    private Map<Discipline, Integer> disciplinesForSpecialty;

        public Specialty(SpecialtyEnum specialty, Map<Discipline, Integer> disciplines) {
        this.specialty = specialty;
        this.disciplinesForSpecialty = disciplines;
    }

    public SpecialtyEnum getSpecialty() {
        return specialty;
    }

    public Map<Discipline, Integer> getDisciplinesForSpecialtyMap() {
        return disciplinesForSpecialty;
    }

    public void AddElement(Discipline key, Integer value){
        this.getDisciplinesForSpecialtyMap().put(key,value);
    }

    public void RemoveElement(Discipline key, Integer value){
        this.getDisciplinesForSpecialtyMap().remove(key,value);
    }

    public boolean containsDiscipline(Discipline discipline){
            return getDisciplinesForSpecialtyMap().containsKey(discipline);
    }
}

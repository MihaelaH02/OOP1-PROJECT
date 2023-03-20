package bg.tu_varna.sit;

import bg.tu_varna.sit.Enums.CourseEnum;
import bg.tu_varna.sit.Enums.SpecialtyEnum;

import java.util.Map;

public class Specialty {
    private SpecialtyEnum specialty;
    private Map<Discipline, CourseEnum> disciplinesForSpecialtyMap;

    public Specialty(SpecialtyEnum specialty, Map<Discipline, CourseEnum> disciplines) {
        this.specialty = specialty;
        this.disciplinesForSpecialtyMap = disciplines;
    }

    public SpecialtyEnum getSpecialty() {
        return specialty;
    }

    public Map<Discipline, CourseEnum> getDisciplinesForSpecialtyMap() {
        return disciplinesForSpecialtyMap;
    }

    public void AddElement(Discipline key, CourseEnum value){
        this.getDisciplinesForSpecialtyMap().put(key,value);
    }

    public void RemoveElement(Discipline key, CourseEnum value){
        this.getDisciplinesForSpecialtyMap().remove(key,value);
    }
}

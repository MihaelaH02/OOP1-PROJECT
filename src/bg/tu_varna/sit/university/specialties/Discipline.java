package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.TypeOfTheDiscipline;
import bg.tu_varna.sit.university.verifications.ValidateData;

public class Discipline {
    private String name;
    private TypeOfTheDiscipline typeOfTheDiscipline;

    public Discipline() {}

    public Discipline(String name, TypeOfTheDiscipline typeOfTheDiscipline) throws InvalidEnteredDataExceptions{
        this.name = new ValidateData().verifyString(name);
        this.typeOfTheDiscipline = typeOfTheDiscipline;
    }

    public String getName() {
        return name;
    }

    public TypeOfTheDiscipline getTypeOfTheDiscipline() {
        return typeOfTheDiscipline;
    }


    @Override
    public String toString() {
        return this.getName() + " - " + this.getTypeOfTheDiscipline().getTypeOfDisciplineEnum();
    }
}

package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.TypeOfTheDiscipline;
import bg.tu_varna.sit.verifications.VerifyString;

public class Discipline {
    private String name;
    private TypeOfTheDiscipline typeOfTheDiscipline;

    public Discipline() {}

    public Discipline(String name, TypeOfTheDiscipline typeOfTheDiscipline) throws InvalidEnteredDataExceptions{
        this.name = (new VerifyString(name)).getString();
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
        return this.getName() + " - " + this.getTypeOfTheDiscipline();
    }
}

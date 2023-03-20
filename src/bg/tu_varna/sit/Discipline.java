package bg.tu_varna.sit;

import bg.tu_varna.sit.Enums.TypeOfTheDiscipline;

public class Discipline {
    private String name;
    private TypeOfTheDiscipline typeOfTheDiscipline;

    public Discipline() {}

    public Discipline(String name, TypeOfTheDiscipline typeOfTheDiscipline) {
        this.name = name;
        this.typeOfTheDiscipline = typeOfTheDiscipline;
    }

    public String getName() {
        return name;
    }

    public TypeOfTheDiscipline getTypeOfTheDiscipline() {
        return typeOfTheDiscipline;
    }

    public void setTypeOfTheDiscipline(TypeOfTheDiscipline typeOfTheDiscipline) {
        this.typeOfTheDiscipline = typeOfTheDiscipline;
    }
}

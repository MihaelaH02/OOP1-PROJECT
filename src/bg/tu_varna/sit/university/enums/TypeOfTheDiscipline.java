package bg.tu_varna.sit.university.enums;

public enum TypeOfTheDiscipline {
    MANDATORY("задължителена"),
    OPTIONAL("избираема");

    private final String typeOfDisciplineEnum;

    TypeOfTheDiscipline(String typeOfDisciplineEnum) {
        this.typeOfDisciplineEnum = typeOfDisciplineEnum;
    }

    public String getTypeOfDisciplineEnum() {
        return typeOfDisciplineEnum;
    }
}

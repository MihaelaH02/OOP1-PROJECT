package bg.tu_varna.sit.university.enums;

public enum SpecialtyEnum {
    SIT("СИТ"),
    KST("КСТ");
    private final String specialtyEnum;
    private SpecialtyEnum(String specialty){
        this.specialtyEnum=specialty;
    }

    public String getSpecialtyEnum() {
        return specialtyEnum;
    }
}

package bg.tu_varna.sit.university.enums;

public enum StatusEnum {
    ENROLL("enroll"),
    DISCONTINUED("discontinued"),
    GRADUATED("graduated");

    private final String statusEnum;

    StatusEnum(String statusEnum) {
        this.statusEnum = statusEnum;
    }

    public String getStatusEnum() {
        return statusEnum;
    }
}

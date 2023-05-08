package bg.tu_varna.sit.university.enums;

public enum StatusEnum {
    ENROLL("записан"),
    DISCONTINUED("прекъснал"),
    GRADUATED("завършил");

    private final String statusEnum;

    StatusEnum(String statusEnum) {
        this.statusEnum = statusEnum;
    }

    public String getStatusEnum() {
        return statusEnum;
    }
}

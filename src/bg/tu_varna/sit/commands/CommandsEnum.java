package bg.tu_varna.sit.commands;


public enum CommandsEnum {
    ENROLL("записване на студент"),
    ADVANCE("записване студент в следващ курс"),
    CHANGE("прехвърляне на студент в нова специалност, група или курс"),
    GRADUATE("отбелязване на студент като завършил"),
    INTERRUPT("маркиране на студент като прекъснал"),
    RESUME("възстановяване на студентските права на студент"),
    PRINT("извеждане на справка за студент"),
    PRINTALL("извеждане на справка за всички студенти в дадена специалност и курс"),
    ENROLLIN("записване на студент в дадена дисциплина"),
    ADDGRADE("добавяне на оценка по дадена дисциплината на студент"),
    PROTOCOL("извеждане на протоколи за всички студенти, записани в дадена дисциплина"),
    REPORT("извеждане на академична справка за оценките на даден студент");

    private final String commandEnum;

    CommandsEnum(String commandEnum) {
        this.commandEnum = commandEnum;
    }

    public String getCommandEnum() {
        return commandEnum;
    }
}

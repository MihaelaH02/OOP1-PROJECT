package bg.tu_varna.sit.commands;


public enum CommandsEnum {
    OPEN("opens <file> "),
    CLOSE("closes currently opened file"),
    SAVEAS("saves the currently open file"),
    SAVE("saves the currently open file in"),
    HELP("prints the information"),
    EXIT("exists the program"),
    ENROLL("enrolls student"),
    ADVANCE("advances student in next year"),
    CHANGE("changes program, group or year of the student"),
    GRADUATE("marks status of the student to graduated"),
    INTERRUPT("marks status of the student to discontinued"),
    RESUME("marks status of the student to enrolled"),
    PRINT("prints student reference"),
    PRINTALL("prints reference for all students in program and year"),
    ENROLLIN("enrolls student in discipline"),
    ADDGRADE("adds grade in discipline for student"),
    PROTOCOL("prints protocol for all enrolled students in discipline"),
    REPORT("prints academic report of student's grades");

    private final String commandEnum;

    CommandsEnum(String commandEnum) {
        this.commandEnum = commandEnum;
    }

    public String getCommandEnum() {
        return commandEnum;
    }
}

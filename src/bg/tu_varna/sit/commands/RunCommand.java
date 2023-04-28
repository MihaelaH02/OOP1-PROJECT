package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public interface RunCommand {
    void runCommand(String[] command) throws InvalidEnteredDataExceptions;
}

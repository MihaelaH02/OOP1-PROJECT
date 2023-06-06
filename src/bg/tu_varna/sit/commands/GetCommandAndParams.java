package bg.tu_varna.sit.commands;

import java.util.ArrayList;

public class GetCommandAndParams {
    public ArrayList<String> getCommandAndParams(String input) {
        String[] temporary = input.split("<|>");
        ArrayList<String> selectedCommand = new ArrayList<>();
        for (String s : temporary) {
            if (s.isEmpty() || s.equals(" ")) continue;
            selectedCommand.add(s.trim());
        }
        return selectedCommand;
    }
}

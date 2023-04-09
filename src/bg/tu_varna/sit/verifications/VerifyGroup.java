package bg.tu_varna.sit.verifications;

import bg.tu_varna.sit.exeptions.InvalidEnteredDataExceptions;

public class VerifyGroup {
    private final int group;

    public VerifyGroup(int group) throws InvalidEnteredDataExceptions {
        this.group=verifyGroup(group);
    }

    private int verifyGroup(int group)throws InvalidEnteredDataExceptions {
        if(group<0 || group>10) throw new InvalidEnteredDataExceptions("Грешка! Въведели сте некоректни данни за група!");
        else return group;
    }

    public int getGroup() {
        return group;
    }
}

package bg.tu_varna.sit.university.verifications;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class VerifyGroup {
    public int verifyGroup(int group)throws InvalidEnteredDataExceptions {
        if(group<0 || group>10) throw new InvalidEnteredDataExceptions("failed, invalid entered data for group");
        else return group;
    }

}

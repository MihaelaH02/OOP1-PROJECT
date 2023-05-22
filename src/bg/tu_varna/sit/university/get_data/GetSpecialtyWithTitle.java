package bg.tu_varna.sit.university.get_data;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.specialties.SpecialtyList;
import bg.tu_varna.sit.university.verifications.VerifyString;

public class GetSpecialtyWithTitle {
    public Specialty getSpecialtyFromList(String specialty) throws InvalidEnteredDataExceptions {
        new VerifyString().verifyString(specialty);
        SpecialtyList specialtyList = SpecialtyList.getInstance();
        for (Specialty oneSpecialty : specialtyList.getAllSpecialties()) {
            if(oneSpecialty.getSpecialtyTitle() .equals(specialty.toUpperCase())) return oneSpecialty;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Специалността, която търсите не е намерена!");
    }
}

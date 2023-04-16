package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class GetSpecialtyWithTitle {
    public Specialty getSpecialtyFromList(String specialty) throws InvalidEnteredDataExceptions {
        SpecialtyList specialtyList = SpecialtyList.getInstance();
        for (Specialty oneSpecialty : specialtyList.getAllSpecialties()) {
            if(oneSpecialty.getSpecialtyTitle() .equals(specialty)) return oneSpecialty;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Специалността, която търсите не е намерена!");
    }
}

package bg.tu_varna.sit.university.get_data;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.verifications.VerifyString;

import java.util.Map;

public class GetDiscipline{
    public Discipline getDisciplineFromSpecialty(String discipline, Map<Discipline,Integer> specialty) throws InvalidEnteredDataExceptions{
        new VerifyString().verifyString(discipline);
        for (Discipline oneDiscipline : specialty.keySet()) {
            if(oneDiscipline.getName().equals(discipline)) return oneDiscipline;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Дисциплината, която търсите не е намерена!");
    }
}

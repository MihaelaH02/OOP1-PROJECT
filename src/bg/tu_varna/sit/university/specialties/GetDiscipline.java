package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

import java.util.Map;

public class GetDiscipline{
    public Discipline getDisciplineFromSpecialty(String discipline, Map<Discipline,Integer> specialty) throws InvalidEnteredDataExceptions{
        for (Discipline oneDiscipline : specialty.keySet()) {
            if(oneDiscipline.getName().equals(discipline)) return oneDiscipline;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Дисциплината, която търсите не е намерена!");
    }
}

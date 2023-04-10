package bg.tu_varna.sit.university.specialties;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;

public class GetDiscipline{
    public Discipline getDisciplineFromSpecialty(String discipline,Specialty specialty) throws InvalidEnteredDataExceptions{
        for (Discipline oneDiscipline : specialty.getDisciplinesForSpecialtyMap().keySet()) {
            if(oneDiscipline.getName().equals(discipline)) return oneDiscipline;
        }
        throw new InvalidEnteredDataExceptions("Грешка! Дисциплината, която искате да запишете не е в програмата Ви!");
    }
}

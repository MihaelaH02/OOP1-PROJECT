package bg.tu_varna.sit.university.get_data;

import bg.tu_varna.sit.university.specialties.Discipline;

import java.util.Map;

public class CalculateAverageGrade {
    public double calculateTheAverageGradeOfStudent(Map<Discipline, Integer> disciplinesWithGrade){
        double averageGrade=0;
        for (Integer grade : disciplinesWithGrade.values()) {
            averageGrade+=grade;
        }
        return averageGrade/disciplinesWithGrade.size();
    }
}

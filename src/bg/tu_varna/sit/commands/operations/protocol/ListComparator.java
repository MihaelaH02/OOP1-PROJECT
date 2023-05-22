package bg.tu_varna.sit.commands.operations.protocol;

import bg.tu_varna.sit.university.students.GradesForStudent;

import java.util.Comparator;

public class ListComparator implements Comparator<GradesForStudent> {

    @Override
    public int compare(GradesForStudent o1, GradesForStudent o2) {
        int specialty = o1.getStudent().getSpecialty().getSpecialtyTitle().compareTo(o2.getStudent().getSpecialty().getSpecialtyTitle());
        if (specialty != 0) return specialty;

        int course = Integer.compare(o1.getStudent().getCourse(),o2.getStudent().getCourse());
        if (course != 0) return course;

        return o1.getStudent().getFacultyNumber().compareTo(o2.getStudent().getFacultyNumber());
    }
}

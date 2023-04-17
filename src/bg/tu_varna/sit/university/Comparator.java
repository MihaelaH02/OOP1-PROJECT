package bg.tu_varna.sit.university;

public class Comparator implements java.util.Comparator<Object> {//!
    @Override
    public int compare(Object o1, Object o2) {
       /* int spec= compare(((Student) o1).getSpecialty(),((Student) o2).getSpecialty());
        int course = compare(((Student) o1).getCourse(),((Student) o2).getCourse());
        if(spec != 0) return spec;
        else if (course != 0) return course;
        else return compare(((Student) o1).getFacultyNumber(),((Student) o2).getFacultyNumber());*/
        return 0;
    }
}

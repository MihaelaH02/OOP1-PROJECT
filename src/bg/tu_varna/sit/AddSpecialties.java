package bg.tu_varna.sit;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.TypeOfTheDiscipline;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.specialties.Specialty;
import bg.tu_varna.sit.university.specialties.SpecialtyList;

public class AddSpecialties {
    public void addSpecialties() throws InvalidEnteredDataExceptions {
        Specialty sit = new Specialty("SIT");
        sit.addElement(new Discipline("Base programming",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Electronics",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("WEB design",TypeOfTheDiscipline.MANDATORY),1);
        sit.addElement(new Discipline("Sports training - 1 part",TypeOfTheDiscipline.OPTIONAL),1);
//        sit.addElement(new Discipline("Mathematics - 1 part", TypeOfTheDiscipline.MANDATORY),1);
//        sit.addElement(new Discipline("Sport and social adaptation - 1 part",TypeOfTheDiscipline.OPTIONAL),1);
//        sit.addElement(new Discipline("Mathematics - 2 part", TypeOfTheDiscipline.MANDATORY),1);
//        sit.addElement(new Discipline("Synthesis and analysis of algorithms",TypeOfTheDiscipline.MANDATORY),1);
//        sit.addElement(new Discipline("Logic and automata",TypeOfTheDiscipline.MANDATORY),1);
//        sit.addElement(new Discipline("Foreign language",TypeOfTheDiscipline.MANDATORY),1);
//        sit.addElement(new Discipline("Specialized sports training - 2 part",TypeOfTheDiscipline.OPTIONAL),1);
//        sit.addElement(new Discipline("Sport and social adaptation - 2 part",TypeOfTheDiscipline.OPTIONAL),1);
//        sit.addElement(new Discipline("Learning practice - 1 part",TypeOfTheDiscipline.MANDATORY),1);

        sit.addElement(new Discipline("Databases",TypeOfTheDiscipline.MANDATORY),2);
        sit.addElement(new Discipline("Object-oriented programming - 1 part",TypeOfTheDiscipline.MANDATORY),2);
        sit.addElement(new Discipline("Computer organization",TypeOfTheDiscipline.MANDATORY),2);
        sit.addElement(new Discipline("Sports training - 2 part",TypeOfTheDiscipline.OPTIONAL),2);
//        sit.addElement(new Discipline("Discrete structures", TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("System analysis",TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("Specialized sports training - 3 part",TypeOfTheDiscipline.OPTIONAL),2);
//        sit.addElement(new Discipline("Sport and social adaptation - 3 part",TypeOfTheDiscipline.OPTIONAL),2);
//        sit.addElement(new Discipline("Microprocessor technology", TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("WEB programming",TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("Object-oriented programming - 2 part",TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("Software systems",TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("Graphics systems",TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("Object-oriented programming - 1 part - project",TypeOfTheDiscipline.MANDATORY),2);
//        sit.addElement(new Discipline("Sport and social adaptation - 4 part",TypeOfTheDiscipline.OPTIONAL),2);
//        sit.addElement(new Discipline("Learning practice - 2 part",TypeOfTheDiscipline.MANDATORY),2);

        sit.addElement(new Discipline("Principles of operating systems", TypeOfTheDiscipline.MANDATORY),3);
        sit.addElement(new Discipline("Software requirements and specifications",TypeOfTheDiscipline.MANDATORY),3);
        sit.addElement(new Discipline("Programming for databases",TypeOfTheDiscipline.MANDATORY),3);
        sit.addElement(new Discipline("Optional discipline - project 3",TypeOfTheDiscipline.OPTIONAL),3);
//        sit.addElement(new Discipline("Computer networks and the Internet",TypeOfTheDiscipline.MANDATORY),3);
//        sit.addElement(new Discipline("Technology of software production",TypeOfTheDiscipline.MANDATORY),3);
//        sit.addElement(new Discipline("Software project management", TypeOfTheDiscipline.MANDATORY),3);
//        sit.addElement(new Discipline("User interface design",TypeOfTheDiscipline.MANDATORY),3);
//        sit.addElement(new Discipline("Scripting languages and functional programming",TypeOfTheDiscipline.OPTIONAL),3);
//        sit.addElement(new Discipline("Internet technologies",TypeOfTheDiscipline.OPTIONAL),3);
//        sit.addElement(new Discipline("Optional discipline - project",TypeOfTheDiscipline.OPTIONAL),3);
//        sit.addElement(new Discipline("Specialized practice",TypeOfTheDiscipline.MANDATORY),3);

        sit.addElement(new Discipline("Network administration", TypeOfTheDiscipline.MANDATORY),4);
        sit.addElement(new Discipline("Language processors",TypeOfTheDiscipline.MANDATORY),4);
        sit.addElement(new Discipline("Artificial Intelligence",TypeOfTheDiscipline.MANDATORY),4);
        sit.addElement(new Discipline("Object-oriented applications",TypeOfTheDiscipline.OPTIONAL),4);

//        sit.addElement(new Discipline("Programming for mobile and Internet devices",TypeOfTheDiscipline.MANDATORY),4);
//        sit.addElement(new Discipline("Retrieval of information on the Internet",TypeOfTheDiscipline.OPTIONAL),4);
//        sit.addElement(new Discipline("Fundamentals of Cyber Security",TypeOfTheDiscipline.OPTIONAL),4);
//        sit.addElement(new Discipline("Learning practice - 3 part",TypeOfTheDiscipline.MANDATORY),4);
//        sit.addElement(new Discipline("Office technologies",TypeOfTheDiscipline.OPTIONAL),4);
//        sit.addElement(new Discipline("Cryptography and data protection",TypeOfTheDiscipline.OPTIONAL),4);


        Specialty kst = new Specialty("KST");
        kst.addElement(new Discipline("Mathematics - 1 part", TypeOfTheDiscipline.MANDATORY),1);
        kst.addElement(new Discipline("Base programming",TypeOfTheDiscipline.MANDATORY),1);
        kst.addElement(new Discipline("Fundamentals of computer systems", TypeOfTheDiscipline.MANDATORY),1);
        kst.addElement(new Discipline("Sports training - 1 part",TypeOfTheDiscipline.OPTIONAL),1);
        kst.addElement(new Discipline("WEB design",TypeOfTheDiscipline.MANDATORY),1);
        kst.addElement(new Discipline("Electronics",TypeOfTheDiscipline.MANDATORY),1);

//        kst.addElement(new Discipline("Electrical engineering", TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Foreign language",TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Sport and social adaptation - 1 part",TypeOfTheDiscipline.OPTIONAL),1);
//        kst.addElement(new Discipline("Mathematics - 2 part", TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Synthesis and analysis of algorithms",TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Logic and automata",TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Electronics",TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Foreign language",TypeOfTheDiscipline.MANDATORY),1);
//        kst.addElement(new Discipline("Specialized sports training - 2 part",TypeOfTheDiscipline.OPTIONAL),1);
//        kst.addElement(new Discipline("Sport and social adaptation - 2 part",TypeOfTheDiscipline.OPTIONAL),1);

        kst.addElement(new Discipline("Object-oriented programming - 1 part",TypeOfTheDiscipline.MANDATORY),2);
        kst.addElement(new Discipline("Discrete structures", TypeOfTheDiscipline.MANDATORY),2);
        kst.addElement(new Discipline("Sports training - 2 part",TypeOfTheDiscipline.OPTIONAL),2);
//        kst.addElement(new Discipline("Electrical measurements",TypeOfTheDiscipline.MANDATORY),2);
//        kst.addElement(new Discipline("System analysis",TypeOfTheDiscipline.MANDATORY),2);
//        kst.addElement(new Discipline("Sport and social adaptation - 3 part",TypeOfTheDiscipline.OPTIONAL),2);
//        kst.addElement(new Discipline("Microprocessor technology", TypeOfTheDiscipline.MANDATORY),2);
//        kst.addElement(new Discipline("Object-oriented programming - 2 part",TypeOfTheDiscipline.MANDATORY),2);
//        kst.addElement(new Discipline("Software systems",TypeOfTheDiscipline.MANDATORY),2);
//        kst.addElement(new Discipline("Digital systems", TypeOfTheDiscipline.MANDATORY),2);
//        kst.addElement(new Discipline("Optional discipline - project1",TypeOfTheDiscipline.OPTIONAL),2);
//        kst.addElement(new Discipline("Specialized sports training - 4 part",TypeOfTheDiscipline.OPTIONAL),2);
//        kst.addElement(new Discipline("Sport and social adaptation - 4 part",TypeOfTheDiscipline.OPTIONAL),2);

        kst.addElement(new Discipline("Computer and network security",TypeOfTheDiscipline.MANDATORY),3);
        kst.addElement(new Discipline("Software technologies",TypeOfTheDiscipline.MANDATORY),3);
        kst.addElement(new Discipline("Databases",TypeOfTheDiscipline.MANDATORY),3);
        kst.addElement(new Discipline("Optional discipline - project 3",TypeOfTheDiscipline.OPTIONAL),3);
//        kst.addElement(new Discipline("Computer architectures",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Fundamentals of Computer Communications",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Optional discipline - project2",TypeOfTheDiscipline.OPTIONAL),3);
//        kst.addElement(new Discipline("Artificial Intelligence",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Microprocessor systems",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Computer networks",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Computer hardware",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Operating Systems",TypeOfTheDiscipline.MANDATORY),3);
//        kst.addElement(new Discipline("Specialized practice",TypeOfTheDiscipline.MANDATORY),3);

        kst.addElement(new Discipline("Compilers and interpreters",TypeOfTheDiscipline.OPTIONAL),4);
        kst.addElement(new Discipline("Multi-user operating systems", TypeOfTheDiscipline.OPTIONAL),4);
        kst.addElement(new Discipline("Administration of local and Internet networks",TypeOfTheDiscipline.MANDATORY),4);
        kst.addElement(new Discipline("Optional discipline - project 4",TypeOfTheDiscipline.OPTIONAL),4);
//        kst.addElement(new Discipline("Specialized computer systems",TypeOfTheDiscipline.MANDATORY),4);
//        kst.addElement(new Discipline("Learning practice - 3 part",TypeOfTheDiscipline.MANDATORY),4);
//        kst.addElement(new Discipline("Computer and network security",TypeOfTheDiscipline.OPTIONAL),4);
//        kst.addElement(new Discipline("Distributed programming",TypeOfTheDiscipline.MANDATORY),4);
//        kst.addElement(new Discipline("Scripting languages",TypeOfTheDiscipline.MANDATORY),4);


        SpecialtyList specialtiesInUniversity = SpecialtyList.getInstance();
        specialtiesInUniversity.addElement(sit);
        specialtiesInUniversity.addElement(kst);
    }
}

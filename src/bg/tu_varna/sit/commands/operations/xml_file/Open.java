package bg.tu_varna.sit.commands.operations.xml_file;

import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.enums.TypeOfTheDiscipline;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.Student;
import bg.tu_varna.sit.university.students.StudentsList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Open {
    public void open(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (file.exists()) {
            StudentsList studentsList = StudentsList.getInstance();

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList studentInList = doc.getElementsByTagName("studentInList");

            for (int i = 0; i < studentInList.getLength(); i++) {
                Element studentInListElement = (Element) studentInList.item(i);

                Element studentElement = (Element) studentInListElement.getElementsByTagName("student").item(0);
                Student student = new Student(
                        studentElement.getElementsByTagName("nameStudent").item(0).getTextContent(),
                        studentElement.getElementsByTagName("facultyNumber").item(0).getTextContent(),
                        Integer.parseInt(studentElement.getElementsByTagName("course").item(0).getTextContent()),
                        studentElement.getElementsByTagName("specialty").item(0).getTextContent(),
                        Integer.parseInt(studentElement.getElementsByTagName("group").item(0).getTextContent()),
                        StatusEnum.valueOf(studentElement.getElementsByTagName("status").item(0).getTextContent().toUpperCase()));

                NodeList disciplinesWithGradeList = studentInListElement.getElementsByTagName("disciplinesWithGrade");
                for (int j = 0; j < disciplinesWithGradeList.getLength(); j++) {
                    Element disciplinesWithGradeElement = (Element) disciplinesWithGradeList.item(j);

                    Element disciplineElement = (Element) disciplinesWithGradeElement.getElementsByTagName("discipline").item(0);
                    Discipline discipline = new Discipline(
                            disciplineElement.getElementsByTagName("nameDiscipline").item(0).getTextContent(),
                            TypeOfTheDiscipline.valueOf(disciplineElement.getElementsByTagName("type").item(0).getTextContent().toUpperCase()));

                    Element gradeElement = (Element) disciplinesWithGradeElement.getElementsByTagName("grade").item(0);
                    GradesForStudent gradesForStudent = new GradesForStudent(student);
                    gradesForStudent.putElement(discipline, Integer.parseInt(gradeElement.getElementsByTagName("disciplineGrade").item(0).getTextContent()));

                    studentsList.addElement(gradesForStudent);
                }
            }
            System.out.println(">open " + pathFile + "\nSuccessfully open " + "!");
        }
        else if (!file.createNewFile()) throw new Exception();
    }
}
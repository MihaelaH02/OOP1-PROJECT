package bg.tu_varna.sit.xml_file.read;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import bg.tu_varna.sit.university.enums.StatusEnum;
import bg.tu_varna.sit.university.enums.TypeOfTheDiscipline;
import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.Student;
import bg.tu_varna.sit.university.students.StudentsList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Open {
    public void open() throws ParserConfigurationException, IOException, SAXException, InvalidEnteredDataExceptions {
        StudentsList studentsList = StudentsList.getInstance();

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(new File("C:\\Users\\MIHAELA\\Desktop\\OOP1-PROJECT\\University.xml"));
        doc.getDocumentElement().normalize();

        NodeList list = doc.getElementsByTagName("university");

        for (int i = 0; i < list.getLength(); i++) {

            Node node = list.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                Student student=new Student(
                        element.getElementsByTagName("nameStudent").item(0).getTextContent(),
                        element.getElementsByTagName("facultyNumber").item(0).getTextContent(),
                        Integer.parseInt(element.getElementsByTagName("course").item(0).getTextContent()),
                        element.getElementsByTagName("specialty").item(0).getTextContent(),
                        Integer.parseInt(element.getElementsByTagName("group").item(0).getTextContent()),
                        StatusEnum.valueOf(element.getElementsByTagName("status").item(0).getTextContent()));

                Discipline discipline =new Discipline(
                        element.getElementsByTagName("nameDiscipline").item(0).getTextContent(),
                        TypeOfTheDiscipline.valueOf(element.getElementsByTagName("type").item(0).getTextContent().toUpperCase()));

                GradesForStudent gradesForStudent=new GradesForStudent(student);
                gradesForStudent.putElement(discipline,Integer.parseInt(element.getElementsByTagName("disciplineGrade").item(0).getTextContent()));

                studentsList.addElement(gradesForStudent);
                }
            }
        }
    }

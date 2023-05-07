package bg.tu_varna.sit.xml_file.write;

import bg.tu_varna.sit.university.specialties.Discipline;
import bg.tu_varna.sit.university.students.GradesForStudent;
import bg.tu_varna.sit.university.students.StudentsList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Map;

public class Write {
    public void write() throws ParserConfigurationException, TransformerException {
        StudentsList studentsList = StudentsList.getInstance();
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element root = doc.createElement("university");
        doc.appendChild(root);

        for (GradesForStudent student : studentsList.getAllStudents()) {

            Element studentsListXML = doc.createElement("studentInList");
            root.appendChild(studentsListXML);

            Element studentXML = doc.createElement("student");
            studentsListXML.appendChild(studentXML);

            Element name = doc.createElement("nameStudent");
            name.appendChild(doc.createTextNode(student.getStudent().getName()));
            studentXML.appendChild(name);

            Element facultyNumber = doc.createElement("facultyNumber");
            facultyNumber.appendChild(doc.createTextNode(student.getStudent().getFacultyNumber()));
            studentXML.appendChild(facultyNumber);

            Element course = doc.createElement("course");
            course.appendChild(doc.createTextNode(String.valueOf(student.getStudent().getCourse())));
            studentXML.appendChild(course);

            Element specialty = doc.createElement("specialty");
            specialty.appendChild(doc.createTextNode(student.getStudent().getSpecialty().getSpecialtyTitle()));
            studentXML.appendChild(specialty);

            Element group = doc.createElement("group");
            group.appendChild(doc.createTextNode(String.valueOf(student.getStudent().getGroup())));
            studentXML.appendChild(group);

            Element status = doc.createElement("status");
            status.appendChild(doc.createTextNode(student.getStudent().getStatus().getStatusEnum()));
            studentXML.appendChild(status);

            for (Map.Entry<Discipline, Integer> disciplineWithGradeMap : student.getMap().entrySet()) {
                Element disciplinesWithGrade = doc.createElement("disciplinesWithGrade");
                studentsListXML.appendChild(disciplinesWithGrade);

                Element discipline = doc.createElement("discipline");
                disciplinesWithGrade.appendChild(discipline);

                Element title = doc.createElement("nameDiscipline");
                title.appendChild(doc.createTextNode(disciplineWithGradeMap.getKey().getName()));
                discipline.appendChild(title);

                Element type = doc.createElement("type");
                type.appendChild(doc.createTextNode(disciplineWithGradeMap.getKey().getTypeOfTheDiscipline().getTypeOfDisciplineEnum()));
                discipline.appendChild(title);

                Element grade = doc.createElement("grade");
                disciplinesWithGrade.appendChild(grade);

                Element gradeForStudent = doc.createElement("disciplineGrade");
                gradeForStudent.appendChild(doc.createTextNode(String.valueOf(disciplineWithGradeMap.getValue())));
                grade.appendChild(gradeForStudent);
            }
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(new File("C:\\Users\\MIHAELA\\Desktop\\University.xml"));

        transformer.transform(domSource, streamResult);
        System.out.println("Done creating XML File");
    }
}

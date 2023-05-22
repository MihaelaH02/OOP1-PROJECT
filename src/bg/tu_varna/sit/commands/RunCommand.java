package bg.tu_varna.sit.commands;

import bg.tu_varna.sit.exceptions.InvalidEnteredDataExceptions;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface RunCommand {
    void runCommand(String[] command) throws Exception;
}

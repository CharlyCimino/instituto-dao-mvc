package instituto.backend.daos.impl;

import instituto.backend.dtos.AlumnoDTO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import instituto.backend.daos.AlumnoDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class AlumnoDAOXml implements AlumnoDAO {
    
    private static final String PATH = "src/instituto/backend/data/alumnos-carreras.xml";

    @Override
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) {
        Collection<AlumnoDTO> alumnos = new ArrayList<>();
        try {
            DocumentBuilderFactory factoriaDeParsers = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factoriaDeParsers.newDocumentBuilder();
            Document doc = parser.parse(new File(PATH));
            Element raiz = (Element) doc.getElementsByTagName("datos").item(0);

            NodeList nodosAlumno = raiz.getElementsByTagName("alumno");
            for (int i = 0; i < nodosAlumno.getLength(); i++) {
                Element e = (Element) nodosAlumno.item(i);
                if (Integer.parseInt(e.getElementsByTagName("cod_carrera").item(0).getTextContent()) == codCarrera) {
                    AlumnoDTO alu = new AlumnoDTO();
                    alu.setLegajo(Integer.parseInt(e.getElementsByTagName("legajo").item(0).getTextContent()));
                    alu.setApellido(e.getElementsByTagName("apellido").item(0).getTextContent());
                    alu.setNombre(e.getElementsByTagName("nombre").item(0).getTextContent());
                    alumnos.add(alu);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.err.println(ex);
        }
        return alumnos;

    }

}

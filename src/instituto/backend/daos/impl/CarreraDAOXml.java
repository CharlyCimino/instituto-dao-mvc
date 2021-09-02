package instituto.backend.daos.impl;

import instituto.backend.dtos.CarreraDTO;
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
import instituto.backend.daos.CarreraDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class CarreraDAOXml implements CarreraDAO {
    
    private static final String PATH = "src/instituto/backend/data/alumnos-carreras.xml";

    @Override
    public Collection<CarreraDTO> obtenerCarreras() {
        Collection<CarreraDTO> carreras = new ArrayList<>();
        try {
            DocumentBuilderFactory factoriaDeParsers = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factoriaDeParsers.newDocumentBuilder();
            Document doc = parser.parse(new File(PATH));
            Element raiz = (Element) doc.getElementsByTagName("datos").item(0);

            NodeList nodosCarrera = raiz.getElementsByTagName("carrera");
            for (int i = 0; i < nodosCarrera.getLength(); i++) {
                Element e = (Element) nodosCarrera.item(i);
                String codigo = e.getElementsByTagName("codigo").item(0).getTextContent();
                String denominacion = e.getElementsByTagName("denominacion").item(0).getTextContent();
                CarreraDTO ca = new CarreraDTO();
                ca.setCodigo(Integer.parseInt(codigo));
                ca.setNombre(denominacion);
                carreras.add(ca);
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.err.println(ex);
        }

        return carreras;
    }

    @Override
    public CarreraDTO obtenerCarrera(int codigo) {
        CarreraDTO ca = null;
        try {
            DocumentBuilderFactory factoriaDeParsers = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factoriaDeParsers.newDocumentBuilder();
            Document doc = parser.parse(new File(PATH));
            Element raiz = (Element) doc.getElementsByTagName("datos").item(0);

            NodeList nodosCarrera = raiz.getElementsByTagName("carrera");
            int i = 0;
            while(i < nodosCarrera.getLength() && ca == null) {
                Element e = (Element) nodosCarrera.item(i);
                String cod = e.getElementsByTagName("codigo").item(0).getTextContent();
                if (Integer.parseInt(cod) == codigo) {
                    ca = new CarreraDTO();
                    String denominacion = e.getElementsByTagName("denominacion").item(0).getTextContent();
                    ca.setCodigo(Integer.parseInt(cod));
                    ca.setNombre(denominacion);
                }
                i++;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return ca;
    }

}

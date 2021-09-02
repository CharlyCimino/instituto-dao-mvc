package instituto.backend.daos.impl;

import instituto.backend.dtos.AlumnoDTO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import instituto.backend.daos.AlumnoDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class AlumnoDAOTxt implements AlumnoDAO {
    
    private static final String PATH = "src/instituto/backend/data/alumnos.txt";

    @Override
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) {
        Collection<AlumnoDTO> alumnos = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        String renglon;
        try {
            while ((renglon = br.readLine()) != null) {
                if (Integer.parseInt(renglon) == codCarrera) {
                    AlumnoDTO alu = new AlumnoDTO();
                    renglon = br.readLine();
                    alu.setLegajo(Integer.parseInt(renglon));
                    renglon = br.readLine();
                    alu.setApellido(renglon);
                    renglon = br.readLine();
                    alu.setNombre(renglon);
                    renglon = br.readLine();
                    alumnos.add(alu);
                } else {
                    // Avanza cuatro renglones
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return alumnos;
    }
}

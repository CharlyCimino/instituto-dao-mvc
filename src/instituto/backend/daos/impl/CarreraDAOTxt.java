package instituto.backend.daos.impl;

import instituto.backend.dtos.CarreraDTO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import instituto.backend.daos.CarreraDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class CarreraDAOTxt implements CarreraDAO {
    
    private static final String PATH = "src/instituto/backend/data/carreras.txt";

    @Override
    public Collection<CarreraDTO> obtenerCarreras() {
        Collection<CarreraDTO> carreras = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        String renglon;
        try {
            while ((renglon = br.readLine()) != null) {
                CarreraDTO ca = new CarreraDTO();
                ca.setCodigo(Integer.parseInt(renglon));
                renglon = br.readLine();
                ca.setNombre(renglon);
                renglon = br.readLine();
                carreras.add(ca);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        return carreras;
    }

    @Override
    public CarreraDTO obtenerCarrera(int codigo) {
        CarreraDTO ca = new CarreraDTO();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(PATH));
            String renglon;
            while ((renglon = br.readLine()) != null && Integer.parseInt(renglon) != codigo) {
                // Avanza dos renglones
                br.readLine();
                br.readLine();
            }
            if (renglon != null) {
                ca.setCodigo( Integer.parseInt(renglon) );
                renglon = br.readLine();
                ca.setNombre(renglon);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        
        return ca;
    }
}

package instituto.frontend.modelo;

import instituto.backend.daos.AlumnoDAO;
import instituto.backend.daos.CarreraDAO;
import instituto.backend.daos.impl.AlumnoDAOFactory;
import instituto.backend.daos.impl.CarreraDAOFactory;
import instituto.backend.dtos.CarreraDTO;
import instituto.backend.dtos.AlumnoDTO;
import java.util.Collection;
import java.util.ResourceBundle;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class ModeloLocal implements Modelo {

    private String nombreApp;
    private String tipo;
    private CarreraDAO carreraDAO;
    private AlumnoDAO alumnoDAO;

    public ModeloLocal(String nombreApp) {
        this.nombreApp = nombreApp;
        cargarModelo();       
    }
    
    private void cargarModelo() {
        cargarTipo();
        this.carreraDAO = CarreraDAOFactory.getInstance().crearCarreraDAO("CarreraDAO" + tipo);
        this.alumnoDAO = AlumnoDAOFactory.getInstance().crearAlumnoDAO("AlumnoDAO" + tipo);
        System.out.println("Modelo cargado en modo " + tipo);
    }
    
    private void cargarTipo() {
        ResourceBundle rb = ResourceBundle.getBundle(this.getClass().getPackageName() + ".config");
        this.tipo = rb.getString("tipoModelo");
    }

    @Override
    public Collection<CarreraDTO> obtenerCarreras() {
        return carreraDAO.obtenerCarreras();
    }
    
    @Override
    public CarreraDTO obtenerCarrera(int codigo) {
        return carreraDAO.obtenerCarrera(codigo);
    }

    @Override
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) {
        return alumnoDAO.obtenerAlumnos(codCarrera);
    }

    public String getNombreApp() {
        return nombreApp;
    }
}

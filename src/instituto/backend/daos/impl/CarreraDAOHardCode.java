package instituto.backend.daos.impl;

import instituto.backend.daos.CarreraDAO;
import instituto.backend.dtos.CarreraDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class CarreraDAOHardCode implements CarreraDAO {

    private Collection<CarreraDTO> carreras;

    public CarreraDAOHardCode() {
        this.carreras = new ArrayList<>();
        cargarCarreras();
    }
    
    private void cargarCarreras() {
        carreras.add(new CarreraDTO(60, "Informática Aplicada"));
        carreras.add(new CarreraDTO(61, "Control Eléctrico y Accionamientos"));
        carreras.add(new CarreraDTO(62, "Mecánica, Automotores y Máquinas Térmicas"));
        carreras.add(new CarreraDTO(63, "Automatización y Robótica"));
        carreras.add(new CarreraDTO(64, "Electrónica"));
        carreras.add(new CarreraDTO(65, "Química y Química Aplicada"));
        carreras.add(new CarreraDTO(66, "Física y Física Aplicada"));
        carreras.add(new CarreraDTO(67, "Diseño Tecnológico"));
        carreras.add(new CarreraDTO(68, "Profesorado en Disciplinas Industriales"));
        carreras.add(new CarreraDTO(69, "Inglés e Inglés Técnico"));
        carreras.add(new CarreraDTO(70, "Matemática y Matemática Aplicada"));
    }
    
    public Collection<CarreraDTO> obtenerCarreras() {
        return new ArrayList<>(this.carreras); // Lista copia
    }

    @Override
    public CarreraDTO obtenerCarrera(int codigo) {
        CarreraDTO ca = null;
        Iterator<CarreraDTO> it = this.carreras.iterator();
        while(it.hasNext() && ca == null) {
            CarreraDTO aux = it.next();
            if (aux.getCodigo() == codigo) {
                ca = aux;
            }
        }
        return ca;
    }
}

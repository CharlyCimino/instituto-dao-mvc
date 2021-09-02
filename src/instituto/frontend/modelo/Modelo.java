
package instituto.frontend.modelo;

import instituto.backend.dtos.AlumnoDTO;
import instituto.backend.dtos.CarreraDTO;
import java.util.Collection;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface Modelo {
    public Collection<CarreraDTO> obtenerCarreras();
    public CarreraDTO obtenerCarrera(int codigo);
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera);
}

package instituto.backend.daos;

import instituto.backend.dtos.AlumnoDTO;
import java.util.Collection;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public interface AlumnoDAO {

    Collection<AlumnoDTO> obtenerAlumnos(int codCarrera);
}

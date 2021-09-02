package instituto.backend.daos.impl;

import instituto.backend.dtos.AlumnoDTO;
import java.util.ArrayList;
import java.util.Collection;
import instituto.backend.daos.AlumnoDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class AlumnoDAOHardCode implements AlumnoDAO {

    private Collection<AlumnoDTO> alumnos;

    public AlumnoDAOHardCode() {
        this.alumnos = new ArrayList<>();
        cargarAlumnos();
    }

    @Override
    public Collection<AlumnoDTO> obtenerAlumnos(int codCarrera) {
        Collection<AlumnoDTO> alumnosXCarrera = new ArrayList<>();
        for (AlumnoDTO alumno : this.alumnos) {
            if (alumno.getCodCarrera() == codCarrera) {
                alumnosXCarrera.add(alumno);
            }
        }        
        return alumnosXCarrera;
    }

    private void cargarAlumnos() {
        alumnos.add(new AlumnoDTO(63, 12673, "Jiménez", "Franchesca"));
        alumnos.add(new AlumnoDTO(70, 11534, "Fuentes", "Adrián"));
        alumnos.add(new AlumnoDTO(65, 10351, "Yáñez", "Maximo"));
        alumnos.add(new AlumnoDTO(65, 10534, "Fernández", "Ariela"));
        alumnos.add(new AlumnoDTO(61, 11304, "Sandoval", "Jheremy"));
        alumnos.add(new AlumnoDTO(70, 10745, "Poblete", "Amanda"));
        alumnos.add(new AlumnoDTO(62, 10904, "Flores", "Eidan"));
        alumnos.add(new AlumnoDTO(61, 10151, "Lagos", "Antonia"));
        alumnos.add(new AlumnoDTO(61, 11144, "Sánchez", "Dominic"));
        alumnos.add(new AlumnoDTO(70, 12338, "Espinoza", "Mathilda"));
        alumnos.add(new AlumnoDTO(63, 10416, "Vega", "Yolanda"));
        alumnos.add(new AlumnoDTO(62, 11832, "Bravo", "Jonas"));
        alumnos.add(new AlumnoDTO(63, 11440, "González", "Melanie"));
        alumnos.add(new AlumnoDTO(61, 12417, "Salazar", "Solange"));
        alumnos.add(new AlumnoDTO(68, 12927, "Figueroa", "Aixa"));
        alumnos.add(new AlumnoDTO(64, 11705, "Donoso", "Ruth"));
        alumnos.add(new AlumnoDTO(69, 12216, "Venegas", "Max"));
        alumnos.add(new AlumnoDTO(62, 11882, "Campos", "Diego"));
        alumnos.add(new AlumnoDTO(65, 11764, "Herrera", "Alan"));
        alumnos.add(new AlumnoDTO(60, 12163, "Rivera", "Joyce"));
        alumnos.add(new AlumnoDTO(61, 11114, "Garrido", "Ihan"));
        alumnos.add(new AlumnoDTO(60, 11032, "Cárdenas", "Alann"));
        alumnos.add(new AlumnoDTO(70, 12436, "Carvajal", "Milton"));
        alumnos.add(new AlumnoDTO(62, 11098, "Miranda", "Makarena"));
        alumnos.add(new AlumnoDTO(62, 11130, "Espinoza", "Aliro"));
        alumnos.add(new AlumnoDTO(70, 11239, "Alvarado", "Yazmin"));
        alumnos.add(new AlumnoDTO(66, 12815, "Carvajal", "Linda"));
        alumnos.add(new AlumnoDTO(70, 11970, "Farías", "Matías"));
        alumnos.add(new AlumnoDTO(70, 12767, "López", "Aurora"));
        alumnos.add(new AlumnoDTO(60, 12275, "Henríquez", "Robert"));
        alumnos.add(new AlumnoDTO(61, 11672, "Vera", "Jacobo"));
        alumnos.add(new AlumnoDTO(61, 12411, "Paredes", "Ivania"));
        alumnos.add(new AlumnoDTO(65, 12282, "Lagos", "Cristhian"));
        alumnos.add(new AlumnoDTO(64, 12941, "Rodríguez", "Mercedes"));
        alumnos.add(new AlumnoDTO(62, 12402, "Carvajal", "Edwards"));
        alumnos.add(new AlumnoDTO(66, 12632, "Fernández", "Natanael"));
        alumnos.add(new AlumnoDTO(65, 12100, "Flores", "Martin"));
        alumnos.add(new AlumnoDTO(69, 12839, "Yáñez", "Gary"));
        alumnos.add(new AlumnoDTO(69, 11041, "Moreno", "Aarón"));
        alumnos.add(new AlumnoDTO(68, 10967, "Carvajal", "Gabriel"));
        alumnos.add(new AlumnoDTO(61, 12178, "Núñez", "Maximiliano"));
        alumnos.add(new AlumnoDTO(69, 11416, "García", "Milton"));
        alumnos.add(new AlumnoDTO(63, 12355, "Gómez", "Mical"));
        alumnos.add(new AlumnoDTO(63, 11940, "Pérez", "Aymar"));
        alumnos.add(new AlumnoDTO(61, 11741, "Moreno", "Bruno"));
        alumnos.add(new AlumnoDTO(61, 11327, "Gallardo", "Joakin"));
        alumnos.add(new AlumnoDTO(68, 12486, "Vargas", "Yazid"));
        alumnos.add(new AlumnoDTO(65, 12902, "Peña", "Erik"));
        alumnos.add(new AlumnoDTO(64, 10499, "Ortiz", "Benjamín"));
        alumnos.add(new AlumnoDTO(67, 12704, "Cárdenas", "Franklin"));
        alumnos.add(new AlumnoDTO(66, 12279, "González", "Mayda"));
        alumnos.add(new AlumnoDTO(63, 10034, "Valdés", "Sophie"));
        alumnos.add(new AlumnoDTO(67, 10026, "Bustamante", "Benjamín"));
        alumnos.add(new AlumnoDTO(65, 12297, "Castro", "Pascale"));
        alumnos.add(new AlumnoDTO(61, 12180, "Morales", "Aynara"));
        alumnos.add(new AlumnoDTO(69, 12120, "Hernández", "Raphael"));
        alumnos.add(new AlumnoDTO(61, 11876, "Bravo", "Agatha"));
        alumnos.add(new AlumnoDTO(62, 11855, "Yáñez", "Eva"));
        alumnos.add(new AlumnoDTO(68, 10000, "Palma", "Francoise"));
        alumnos.add(new AlumnoDTO(62, 12048, "Aguilera", "Natasha"));
        alumnos.add(new AlumnoDTO(70, 11799, "Díaz", "Flor"));
        alumnos.add(new AlumnoDTO(65, 10290, "Reyes", "Consuelo"));
        alumnos.add(new AlumnoDTO(62, 10325, "Sánchez", "Abraham"));
        alumnos.add(new AlumnoDTO(63, 10659, "Gutiérrez", "Verónica"));
        alumnos.add(new AlumnoDTO(64, 10037, "Venegas", "Chris"));
        alumnos.add(new AlumnoDTO(68, 12367, "Parra", "Milena"));
        alumnos.add(new AlumnoDTO(62, 10339, "Guzmán", "Nancy"));
        alumnos.add(new AlumnoDTO(70, 12008, "Flores", "Priscilla"));
        alumnos.add(new AlumnoDTO(70, 12235, "Gutiérrez", "Yendelyn"));
        alumnos.add(new AlumnoDTO(65, 10083, "Ortiz", "Aurora"));
        alumnos.add(new AlumnoDTO(64, 10504, "Ramírez", "Amaia"));
        alumnos.add(new AlumnoDTO(62, 12619, "Jiménez", "Stevens"));
        alumnos.add(new AlumnoDTO(62, 12136, "Jiménez", "Luz"));
        alumnos.add(new AlumnoDTO(69, 12974, "Jara", "Eithan"));
        alumnos.add(new AlumnoDTO(65, 11591, "Hernández", "Maríajosé"));
        alumnos.add(new AlumnoDTO(65, 12839, "Torres", "Joakin"));
        alumnos.add(new AlumnoDTO(70, 10901, "López", "Betsabé"));
        alumnos.add(new AlumnoDTO(67, 10639, "Guzmán", "Ever"));
        alumnos.add(new AlumnoDTO(70, 12661, "Jara", "Marianela"));
        alumnos.add(new AlumnoDTO(70, 11953, "Pizarro", "Deivy"));
        alumnos.add(new AlumnoDTO(63, 12781, "Salinas", "Ander"));
        alumnos.add(new AlumnoDTO(70, 10068, "Castro", "Richard"));
        alumnos.add(new AlumnoDTO(66, 12987, "Alvarado", "Valentín"));
        alumnos.add(new AlumnoDTO(60, 12906, "Guzmán", "Cathalina"));
        alumnos.add(new AlumnoDTO(64, 11350, "Vera", "Cesar"));
        alumnos.add(new AlumnoDTO(69, 11318, "Rodríguez", "Isaias"));
        alumnos.add(new AlumnoDTO(61, 11120, "Alarcón", "Yamilet"));
        alumnos.add(new AlumnoDTO(61, 10326, "Rodríguez", "Teresa"));
        alumnos.add(new AlumnoDTO(68, 11951, "Vega", "Noemí"));
        alumnos.add(new AlumnoDTO(66, 11217, "Flores", "Richard"));
        alumnos.add(new AlumnoDTO(62, 12796, "Maldonado", "Viktor"));
        alumnos.add(new AlumnoDTO(60, 12112, "Pino", "Jovany"));
        alumnos.add(new AlumnoDTO(61, 10588, "Torres", "Gerard"));
        alumnos.add(new AlumnoDTO(65, 10516, "Figueroa", "León"));
        alumnos.add(new AlumnoDTO(66, 11807, "Bravo", "Jair"));
        alumnos.add(new AlumnoDTO(66, 10623, "Vidal", "Siomara"));
        alumnos.add(new AlumnoDTO(64, 12989, "Pino", "Dante"));
        alumnos.add(new AlumnoDTO(60, 10754, "Peña", "Hellen"));
        alumnos.add(new AlumnoDTO(60, 11282, "Vega", "Michel"));
        alumnos.add(new AlumnoDTO(65, 11016, "Toro", "Marthyna"));
    }
}

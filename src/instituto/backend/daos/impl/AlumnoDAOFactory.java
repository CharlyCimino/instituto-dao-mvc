package instituto.backend.daos.impl;

import instituto.backend.daos.AlumnoDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class AlumnoDAOFactory {

    private static AlumnoDAOFactory f = null;

    private AlumnoDAOFactory() {
    }

    public static AlumnoDAOFactory getInstance() {
        if (f == null) {
            f = new AlumnoDAOFactory();
        }
        return f;
    }

    public AlumnoDAO crearAlumnoDAO(String tipo) {
        try {
            return (AlumnoDAO) Class.forName(f.getClass().getPackage()
                    .getName() + "." + tipo).getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}

package instituto.backend.daos.impl;

import instituto.backend.daos.CarreraDAO;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class CarreraDAOFactory {

    private static CarreraDAOFactory f = null;

    private CarreraDAOFactory() {
    }

    public static CarreraDAOFactory getInstance() {
        if (f == null) {
            f = new CarreraDAOFactory();
        }
        return f;
    }

    public CarreraDAO crearCarreraDAO(String tipo) {
        try {
            return (CarreraDAO) Class.forName(f.getClass().getPackage()
                    .getName() + "." + tipo).getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

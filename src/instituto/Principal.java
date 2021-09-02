package instituto;

import instituto.frontend.controlador.Controlador;
import instituto.frontend.modelo.Modelo;
import instituto.frontend.modelo.ModeloLocal;
import instituto.frontend.vista.VistaCarreras;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

public class Principal {

    public static void main(String[] args) {
        Modelo m = new ModeloLocal("Instituto");
        VistaCarreras vC = new VistaCarreras(m);
        Controlador c = new Controlador(m, vC);
        c.iniciar();
    }
}

package instituto.frontend.controlador;

import instituto.frontend.modelo.Modelo;
import instituto.frontend.vista.VistaAlumnos;
import instituto.frontend.vista.VistaCarreras;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Controlador {

    private Modelo m;
    private VistaCarreras vCarreras;
    private VistaAlumnos vAlumnos;

    public Controlador(Modelo m, VistaCarreras vCarreras) {
        this.m = m;
        this.vCarreras = vCarreras;
    }

    public void iniciar() {
        vCarreras.addConsultarAlumnosListener(new ConsultarAlumnosListener());
        try {
            vCarreras.agregarCarreras(m.obtenerCarreras());
            vCarreras.mostrar();
        } catch (Exception e) {
            mostrarError(e.getMessage());
            System.exit(0);
        }
    }

    private void mostrarError(String msg) {
        vCarreras.mostrarError(msg);
    }

    private class ConsultarAlumnosListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) { // Doble click ?
                try {
                    int cod = vCarreras.getCodCarreraSeleccionado();
                    vAlumnos = new VistaAlumnos(m);
                    vAlumnos.agregarAlumnos(m.obtenerAlumnos(cod));
                    vAlumnos.setTitle("Alumnos de " + m.obtenerCarrera(cod).getNombre());
                    vAlumnos.mostrar(vCarreras);
                } catch (Exception ex) {
                    mostrarError(ex.getMessage());
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}

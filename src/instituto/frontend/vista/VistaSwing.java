
package instituto.frontend.vista;

import instituto.frontend.modelo.Modelo;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class VistaSwing extends JFrame {
    
    private Modelo m;

    public VistaSwing(Modelo m) {
        this.m = m;
    }

    public Modelo getM() {
        return m;
    }
    
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error...", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mostrar(Component parent) {
        setLocationRelativeTo(parent);
        setVisible(true);
    }
    
    public void mostrar() {
        mostrar(null);
    }
    
}

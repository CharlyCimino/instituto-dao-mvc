package instituto.backend.dtos;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class CarreraDTO {

    private int codigo;
    private String nombre;

    public CarreraDTO() {} 

    public CarreraDTO(int codigo, String nombre) {
        setCodigo(codigo);
        setNombre(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new RuntimeException("Código de carrera '" + codigo + "' inválido");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new RuntimeException("Nombre de carrera '" + nombre + "' inválido");
        }
        this.nombre = nombre;
    }
}

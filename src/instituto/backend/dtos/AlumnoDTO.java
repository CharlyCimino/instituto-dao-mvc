package instituto.backend.dtos;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class AlumnoDTO {

    private int codCarrera;
    private int legajo;
    private String apellido;
    private String nombre;
    
    public AlumnoDTO() {}

    public AlumnoDTO(int codCarrera, int legajo, String apellido, String nombre) {
        setLegajo(legajo);
        setCodCarrera(codCarrera);
        setApellido(apellido);
        setNombre(nombre);
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        if (legajo <= 0) {
            throw new RuntimeException("Legajo " + legajo + " inválido");
        }
        this.legajo = legajo;
    }

    public int getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(int codCarrera) {
        if (legajo <= 0) {
            throw new RuntimeException("Código de carrera " + codCarrera + " inválido");
        }
        this.codCarrera = codCarrera;
    }    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null) {
            throw new RuntimeException("Apellido de alumno '" + apellido + "' inválido");
        }
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new RuntimeException("Nombre de alumno '" + nombre + "' inválido");
        }
        this.nombre = nombre;
    }
}

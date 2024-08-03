package modelo;

/**
 *
 * @author
 */
public class Autor {

    private String nombre;
    private String apellido;
    private String fechaNace;

    public Autor() {
    }

    public Autor(String nombre, String apellido, String fechaNace) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNace = fechaNace;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNace() {
        return fechaNace;
    }

    public void setFechaNace(String fechaNace) {
        this.fechaNace = fechaNace;
    }

    public String imprimir() {
        return "-------DATOS DEL AUTOR-----------\n"
                + "Nombre:" + getNombre()+ "\n"
                + "Apellido:" + getApellido()+ "\n"
                + "Fecha de Nacimiento:" + getFechaNace();
    }
}

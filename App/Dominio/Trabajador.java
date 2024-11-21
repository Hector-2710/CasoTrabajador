package Dominio;

public class Trabajador extends Persona {

    private Isapre isapre;
    private AFP afp;
    private String nombre;
    private String apellido;
    private String rut;

    public Trabajador(Isapre isapre, AFP afp, String nombre, String apellido, String rut) {
        this.isapre = isapre;
        this.afp = afp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    // Métodos para cambiar el nombre, RUT y apellido
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    // Métodos para obtener el nombre, RUT y apellido
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }
}
public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private String estdocivil;

    public Persona(String nombre, String apellido, String DNI, String estdocivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estdocivil = estdocivil;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEstdocivil() {
        return estdocivil;
    }

    public void setEstdocivil(String estdocivil) {
        this.estdocivil = estdocivil;
    }
}

public class Servicio extends Persona {
 private String seccion;

    public Servicio(String nombre, String apellido, String DNI, String estdocivil, String seccion) {
        super(nombre, apellido, DNI, estdocivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}

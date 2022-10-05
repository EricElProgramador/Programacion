public class Profesores extends Persona {
    private String nDespachos;
    private String aCorporacion;
    private String departamento;

    public Profesores(String nombre, String apellido, String DNI, String estdocivil, String nDespachos, String aCorporacion, String departamento) {
        super(nombre, apellido, DNI, estdocivil);
        this.nDespachos = nDespachos;
        this.aCorporacion = aCorporacion;
        this.departamento = departamento;
    }

    public String getnDespachos() {
        return nDespachos;
    }

    public void setnDespachos(String nDespachos) {
        this.nDespachos = nDespachos;
    }

    public String getaCorporacion() {
        return aCorporacion;
    }

    public void setaCorporacion(String aCorporacion) {
        this.aCorporacion = aCorporacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
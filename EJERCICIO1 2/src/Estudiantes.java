public class Estudiantes extends Persona {

    private String curso;
    private String matricula;

    public Estudiantes(String nombre, String apellido, String DNI, String estdocivil, String curso, String matricula) {
        super(nombre, apellido, DNI, estdocivil);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
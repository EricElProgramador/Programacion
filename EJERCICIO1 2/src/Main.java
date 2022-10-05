public class Main {
    public static void main(String[] arg){

        Profesores pp =new Profesores("Gonzalo", "Blanca","123456789A","soltero","10","1999","Informatica");
        Estudiantes ee =new Estudiantes("Pepito","Palotes","987654321A","soltero","2Bachi","123");
        Servicio ss =new Servicio("Manuel","Perez","213465879A","casado","69");

        System.out.println(pp.getNombre());
        System.out.println(pp.getApellido());
        System.out.println(pp.getDNI());
        System.out.println(pp.getEstdocivil());
        System.out.println(pp.getnDespachos());
        System.out.println(pp.getaCorporacion());
        System.out.println(pp.getDepartamento());

        System.out.println("-------------------------");

        System.out.println(ee.getNombre());
        System.out.println(ee.getApellido());
        System.out.println(ee.getDNI());
        System.out.println(ee.getEstdocivil());
        System.out.println(ee.getCurso());
        System.out.println(ee.getMatricula());

        System.out.println("-------------------------");

        System.out.println(ss.getNombre());
        System.out.println(ss.getApellido());
        System.out.println(ss.getDNI());
        System.out.println(ss.getEstdocivil());
        System.out.println(ss.getSeccion());

    }

}

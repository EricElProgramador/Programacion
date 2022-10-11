public class Cadntxt {
    String nombre_completo = "Eric Ortiz Pacios";


    public static void main(String[] args){
        Cadntxt app = new Cadntxt();
        app.Apellidos();
    }

    public void Apellidos (){

        String[] apellidos = nombre_completo.split(" ");
        String apellido = apellidos[1];
        String apellido2 = apellidos[2];
        String nombre = apellidos[0];

        char inicial = nombre.charAt(0);

        System.out.println(apellido + " " + apellido2 + " " + inicial);

    }

}
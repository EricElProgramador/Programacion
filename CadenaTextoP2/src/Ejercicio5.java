import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

    String contra = "520?i&k8U3xR";
    Integer fuerza = 0;

    public static void main(String[] args){
        Ejercicio5 app = new Ejercicio5();
        app.contraseña();
    }
    public void contraseña(){

        //char[] contra_arr = contra.toCharArray();
        String contra1 = contra;
        int frase_lenght = contra1.length();

        if(frase_lenght >= 8){

            System.out.println("Tu contraseña tiene una buena longitud");

            fuerza = fuerza + 1;

        }else{

            System.out.println("Tu contraseña no cumple con la longitud mínima.");
        }

        if (contra1!=contra1.toLowerCase()){

            System.out.println("Tu contraseña tiene mayúsculas y minuscúlas.");
            fuerza = fuerza + 1;

        }else{

            System.out.println("Tu contraseña tiene minsuculas y mayusculas.");
        }

        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*\\W)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("520#i&k8U3xR:");
        boolean contiene_digitos_simbolos = matcher.find();

        if(contiene_digitos_simbolos) {
            System.out.println("Tu contraseña tiene tanto digítos y símbolos.");
            fuerza = fuerza + 1;
        } else {
            System.out.println("Tu contaraseña no cumple con los parametros de seguridad");

        }

        System.out.println();

        if(fuerza == 3){

            System.out.println("Tu contraseña que has introducido es fuerte.");
        }else{

            System.out.println("Tu contraseña no es lo suficientemente fuerte.");
        }

    }
}

import java.util.Scanner;

public class Ejercicio3 {

    Scanner v1 = new Scanner(System.in);
    Scanner v2 = new Scanner(System.in);

    public static void main(String[] args){
        Ejercicio3 app = new Ejercicio3();
        app.Contador();
    }

    public void Contador(){

        System.out.println("Introduzca una palabra aleatoria: ");
        String palabra = v1.nextLine();
        System.out.println("Introduzca un caracter que se encuentre en la palabra: ");
        char caracter = v2.nextLine().charAt(0);
        String posiciones = "";
        for (int i = 0; i < palabra.length(); i++) {

            if(palabra.charAt(i) == caracter){

                posiciones+=i + ", ";
            }

        }

        System.out.println("La posición de tu caracte selecionado  es:" + posiciones);

    }
}
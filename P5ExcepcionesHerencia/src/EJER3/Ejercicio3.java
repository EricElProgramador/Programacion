package EJER3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[] array;
        array = new int[10];

        try {
            System.out.println("Introducir el valor que deese para el array: ");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 20; i++) {
                array[i]=sc.nextInt();
            }

        } catch (Exception MaxLengthArr) {

            System.out.println("ERROR: El límite del array a sido superado.");

            Scanner sc2 = new Scanner(System.in);
            String finalizado;
            finalizado = sc2.nextLine();

            if (finalizado.equals("sí")) {
                array = new int[20];

                for (int i = 0; i < 20; i++) {
                    array[i]=sc2.nextInt();
                }

                System.out.println("El array a superado su maxima amplitud, no es posible hacer una mayor ampliación. ");

            } else {
                System.out.println("PROGRAMA FINALIZADO");
            }
        }
    }
}
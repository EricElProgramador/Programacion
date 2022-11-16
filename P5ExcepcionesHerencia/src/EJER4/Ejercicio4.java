package EJER4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        boolean error = false;
        Scanner sc = new Scanner(System.in);
        while(!error) {
            try {

                System.out.println("Introduzca un número para saber su cuadrado:");
                String numeroEscogido = sc.nextLine();

                int NumeroIntroducido = Integer.parseInt(numeroEscogido);
                int Operacion_Cuadrado;

                Operacion_Cuadrado = NumeroIntroducido * NumeroIntroducido;

                System.out.println("El cuadrado de el numero --> " + NumeroIntroducido + " es: " + Operacion_Cuadrado);


            } catch (Exception FormatError) {

                System.out.println("El valor introducido es incorrecto, porfavor introduce sólamente números, no esta permitido introducir letras y/o símbulos");

            }
        }
    }
}
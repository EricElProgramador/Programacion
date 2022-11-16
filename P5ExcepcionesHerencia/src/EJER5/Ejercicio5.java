package EJER5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabraclave = "Empezar";
        do {
            try {

                System.out.println("Se han detectado anomalias en su cuenta, vamos a proceder con unas preguntas para verificar que eres tú");
                System.out.println("--------------------------------------------------------");
                System.out.println("Cual es tu nombre completo?");
                palabraclave = sc.nextLine();

                if (palabraclave.equals("Eric Ortiz Pacios")) {

                    System.out.println("Nombre correcto");
                    System.out.println("-------------------------");
                    System.out.println("Introduce tu fecha de nacimiento");
                    palabraclave = sc.nextLine();

                    if (palabraclave.equals("25/01/2003")) {

                        System.out.println("Correcto.");
                        System.out.println("----------------------------------------.");
                        System.out.println("Introducza el nombre y primer apellido de tus padres separados con una Y");
                        palabraclave = sc.nextLine();

                        if (palabraclave.equals("Miguel Ortiz y Rosa Maria Pacios")) {

                            System.out.println("Correcto");
                            System.out.println("--------------------------");
                            System.out.println("Introduce la contraseña de seguirad extra");
                            palabraclave = sc.nextLine();

                            if (palabraclave.equals("123456789987654321ABC")) {

                                System.out.println("Validación correcta puede introducir su nueva contraseña atraves dek correo");
                            }
                        }
                    }

                }
            }catch (Exception e){

            }
        }while(true);
    }
}
import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Ejercicio8 app = new Ejercicio8();
        app.function_lambda();
    }

    public void function_lambda() {


        ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
        Jugadores.add(new Jugador("Messi", 35));
        Jugadores.add(new Jugador("Haalalnd", 22));
        Jugadores.add(new Jugador("Foden", 22));
        Jugadores.add(new Jugador("Ibrahimovic", 41));
        Jugadores.add(new Jugador("Neymar", 30));
        Jugadores.removeIf(Jugador -> (Jugador.edad >= 35));
        System.out.println("La lista de Jugadores es: ");


        for (Jugador Jugador : Jugadores) {
            System.out.println(Jugador.nombre);
        }
    }

    private static class Jugador {
        private String nombre;
        private int edad;

        public Jugador(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
    public class lista {
        public static void main(String args[]) {

            List<Integer> lista1 = new ArrayList();

            lista1.add(1);
            lista1.add(2);

            int[] array = new int[lista1.size()];

            for(int i = 0; i < lista1.size(); i++)
                array[i] = lista1.get(i);
        }
    }
}
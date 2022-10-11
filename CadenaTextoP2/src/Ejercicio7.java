import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio7 {

    public static void main(String[] args){
        Ejercicio7 app = new Ejercicio7();
        app.iteracion();
    }

    public void iteracion(){

        ArrayList<String> Equipos_Champions = new ArrayList<String>();
        Equipos_Champions.add("FCBarcelona");
        Equipos_Champions.add("Manchester City");
        Equipos_Champions.add("Real Madrid");
        Equipos_Champions.add("FCBayer Munich");
        Equipos_Champions.add("SevillaFC");

        Iterator<String> it = Equipos_Champions.iterator();

        for (int i = 0; i < Equipos_Champions.size(); i++) {

            System.out.println(it.next());
        }
    }
}
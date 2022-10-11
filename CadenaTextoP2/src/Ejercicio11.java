import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio11 {

    public static void main(String[] args){
        Ejercicio11 app = new Ejercicio11();
        app.ordenar();
    }

    public void ordenar(){

        final Map<String, Integer> ordenar = new HashMap<>();
        ordenar.put("C", 4);
        ordenar.put("l", 1);
        ordenar.put("a", 2);
        ordenar.put("u", 3);
        ordenar.put("d", 7);
        ordenar.put("i", 9);
        ordenar.put("e", 6);
        ordenar.put("r", 5);
        ordenar.put("f", 8);

        final Map<String, Integer> sortedByCount = ordenar.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByCount);
    }
}
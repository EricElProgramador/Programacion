
public class Ejercicio1 {
    public static void main(String[] args) {

        segundo<String> stackList = new segundo<>();

        System.out.println();

        System.out.println("Puedes ver contenido en tu lista");

        if (stackList.isEmpty() == true ){
            System.out.println("Tu lista se encuentra vacia.");
        }else{
            System.out.println("Tu lista se encuentra llena!");
        }
        System.out.println();


        stackList.addFirst("Eric");
        stackList.addFirst("Messi");
        stackList.addFirst("Neymar");

        System.out.println("Contenido de la lista: "+stackList);

        stackList.getFirst();


        stackList.removeFirst();


        stackList.addFirst("Cristiano");
        System.out.println("El resultado de tu lista seria el siguiente: "+stackList);

    }
}

public class tercero {
    public static void main(String[] args){

        segundo<String> array = new segundo<>();

        System.out.println();

        System.out.println("Puedes ver contenido en tu lista");

        if (array.isEmpty() == true ){
            System.out.println("Tu lista se encuentra vacia.");
        }else{
            System.out.println("Tu lista se encuentra llena!");
        }
        System.out.println();


        array.addFirst("Eric") ;
        array.addFirst("Messi");
        array.addFirst("Neymar");
        array.addFirst("Halaand");

        System.out.println("Contenido de la lista: " + array.toString());


        array.removeFirst();

        System.out.println("Eliminamos el primer valor que contiene tu lista: "+array.toString());


        array.addFirst("Cristinao");
        System.out.println("Añadimos un valor a la primera posición de tu lista:"+array);


        String string = array.toString();
        System.out.println("Pasaremos el array a String"+ string);

    }
}
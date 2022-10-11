import java.util.*;

class GFG {
    public static <T> List<T> convertArrayToList(T array[])
    {


        List<T> list = new ArrayList<>();


        for (T t : array) {

            list.add(t);
        }


        return list;
    }

    public static void main(String args[])
    {
        // Create an Array
        String array[] = { "Futbol", "Club",
                "Barcelona le le le le le le" };

        // Print the Array
        System.out.println("Array: "
                + Arrays.toString(array));

        // convert the Array to List
        List<String>
                list = convertArrayToList(array);

        // Print the List
        System.out.println("List: " + list);
    }
}
package EX_02;
import java.util.ArrayList;
import java.util.Arrays;

public class cuarto <T>{
    private T data;
    private T array[];
    private int numOfItems;



    public cuarto() {
        this.array = (T[]) new Object[4];
        this.numOfItems = 0; }

    public boolean isEmpty() { return this.numOfItems == 0; }

    public void removeFirst() {
        T value = this.array[3];

        for(int i= 0; i<this.array.length-1; i++)
            this.array[i] = this.array[i+1];
    }
    public void addFirst(T item) {
        array[0] = item;
        for(int i= 3; i>0; i--){
            array[i] = array[i-1];
        }
    }
    public String toString() {

        String nuevoString = Arrays.toString(this.array);
        return nuevoString;
    }
}
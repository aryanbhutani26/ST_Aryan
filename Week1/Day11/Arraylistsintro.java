package Week1.Day11;
import java.util.*;

public class Arraylistsintro {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> arr = new ArrayList<>(2);
        System.out.println(arr.size());
        
        // inserting an element
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        // accesing an element
        System.out.println(arr.get(0)); // prints 10
        System.out.println(arr.get(1)); // prints 20
        System.out.println(arr.get(2)); // prints 30
        System.out.println(arr.get(3)); // prints 40
        System.out.println(arr.get(4)); // prints 50
        
        // removing an element 
        System.out.println( arr.remove(0));
        System.out.println(arr.get(0));
        
        //    updating an index
        arr.set(0, 100);
        System.out.println(arr.get(0));
        
        // Sorting an array 
        Collections.sort(arr);
        System.out.println(arr);

        
    }
}

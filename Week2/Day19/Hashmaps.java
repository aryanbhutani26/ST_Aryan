package Week2.Day19;
import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer,Integer> Mp= new HashMap<>();

        int[] arr={1,2,3,1,4,2 , 5 ,5};
        // // Adding the value into the map 
        Mp.put(1,0);
        Mp.put(2, 0);
        Mp.put(3, 0);
        Mp.put(4, 0);

        // Removing a Value 
        Mp.remove(1);
        
        // Mp.put(1,0); //Added back the value

        // Display the Map
        System.out.println(Mp);
        
        
        // Check if the Map contains an element 
        //  Mp.containsKey
        System.out.println(Mp.containsKey(2));

        // Access an element 
        System.out.println(Mp.get(2));

        // Iterate the map 
        for(Map.Entry m : Mp.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());

        }

        // Map<Integer><Integer> mp = new Hashmaps<>()

        
        // Check the number of keys in the array
        for(int i=0 ; i<arr.length;i++){
            if(Mp.containsKey(arr[i])){
                Mp.put(arr[i], Mp.get(arr[i])+1);
            }
            else{
                Mp.put(arr[i], 1);}
            
        }

        // New function to do the above task
        for(int i=0; i<arr.length;i++){
            Mp.put(i , Mp.getOrDefault(i, 1));
        }

        
        System.out.println(Mp);
        

    } 
}

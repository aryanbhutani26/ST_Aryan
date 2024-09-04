package Week2.Day20;

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {

        //Initialisation
        Queue <Integer> queue= new LinkedList<>();

        // Adding an element
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // if the queue is of fixed size 
        //queue.add(6); // will throw an exception
        //  so we will use another function

        queue.offer(6);


        // Removing an element
        queue.remove(2);

        // Checking an element
        queue.peek(); 

        // popping a value just like stack
        queue.poll(); // we can also use queue.element(); but it throws exception if the statck is empty

        System.out.println(queue.poll());
        System.out.println(queue);
    }

}

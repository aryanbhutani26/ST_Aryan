import java.util.*;
public class stacks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk=new Stack<>();
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int a=sc.nextInt();
        //     stk.push(a);

        // }
        // while(sc.hasNextInt()){
        //     int a= sc.nextInt();
        //     stk.push(a);
        //     // System.out.println(stk.peek());

        // }

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);

        System.out.println(stk.size());
        System.out.println(stk.size() - stk.search(20));
        int n=0;
        int min=Math.min(stk.elementAt(n), stk.elementAt(n+1));
        n++;
        System.out.println(min);

    //     while( !stk.isEmpty()){
    //         System.out.println(stk.pop());


    //     }

    // //    System.out.println( stk.peek()); //View the top element
    // //    System.out.println(stk.pop()); // pop the top element 
    // //     System.out.println("Stack elements: "+stk); //View the elements
    }
}

import java.util.*;

public class LLFunction {
    private static node tail = null;

    private static node head = null;

    public LLFunction() {
    }

    public static void add(int data) {
        node newNode = new node(data);
        
        newNode.next = head;
        head = newNode;
        
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void InsertAtend(int data){
       
        node temp = head;
        if(head==null){
            add(data);
            return;
        }
        while( temp!=null){
            temp= temp.next;
            // newNode.next = null;
        }
        node newNode = new node(data);
        temp.next= newNode;
        

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLFunction ll = new LLFunction();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element");
            int data = sc.nextInt();
            add(data);
        }
        InsertAtend(10);

        ll.display();
        // ll.display();

    }
}

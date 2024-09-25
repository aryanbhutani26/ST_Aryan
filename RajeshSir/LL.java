public class LL {
    public static void main(String[] args) {
        node first = new node(10);
        node second = new node(20);
        node third = new node(30);
        node fourth = new node(40);
        node fifth = new node(50);
        first.next = second;
        second.next = third;
        node head = first ;
        node temp = second ;
        temp = second.next;  // Shifting of name
      

        System.out.println(head);
        System.out.println(first);
        System.out.println(second);
    }
}

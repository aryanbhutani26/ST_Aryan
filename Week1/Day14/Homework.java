package Week1.Day14;
public class Homework {
    static void towerofHanoi(int n , String A , String B , String C){
        if(n==1){
            System.out.println(" Move disk 1 from " + A +" to " + B);
            return;
        }
        towerofHanoi(n-1, A, C, B);
        System.out.println(" Move disk " + n + " from " + A + " to " + B);
        towerofHanoi(n-1, C, B , A);
    }
    public static void main(String[] args) {
        towerofHanoi(3, "A", "B", "C");
    }
}

package PatternHW;

public class Question28 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Question 28");
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");

                num++;
            }
            num -= 2;
            for (int j = 2; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}

package PatternHW;

public class Question19 {

    // Not solved properly
    public static void main(String[] args) {
        int n = 7;
        for (int i = n - 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 4; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int k = 4; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
        

        for (int i = 1; i <= n - 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 4; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int k = 4; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
        
    }
    }


package PatternHW;

public class Question27 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int i = 1; i <= n; i++) {

            for (int k = n; k > i; k--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

}

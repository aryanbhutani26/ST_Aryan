import java.util.*;

public class Ques1 {
    static int[][] enter(int r, int c) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the value at " + i + " " + j);
                arr[i][j] = sc.nextInt();

            }

        }
        return arr;
    }

    static void traverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.err.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.err.print(arr[i][j]+ " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int i = sc.nextInt();
        int j = sc.nextInt();

        traverse(enter(i, j));
    }
}

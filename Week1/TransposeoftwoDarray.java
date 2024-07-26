// package Week1;

// import java.util.Scanner;

// public class TransposeoftwoDarray {
//     static void insert(int[][] arr) {
//         int count = 1;
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 arr[i][j] = count++;

//             }
//         }
//     }

//     static void display(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void transpose(int[][] arr) {
//         int[][] nums = new int[5][6];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 nums[j][i] = arr[i][j];
//             }
//         }
//         display(nums);
//     }

//     public static void main(String[] args) {
        
//         int[][] arr = new int[5][6];
//         System.out.println(arr[0][2]);
//         insert(arr);
//         display(arr);
//          System.out.println("The transpose of the array is ");
//         transpose(arr);

//     }
// }

package Week1;

import java.util.Scanner;

public class TransposeoftwoDarray {
    static void insert(int[][] arr) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = count++;

            }
        }
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] arr) {
        int[][] nums = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                nums[j][i] = arr[i][j];
            }
        }
        display(nums);
    }

    public static void main(String[] args) {
        
        int[][] arr = new int[3][5];
        System.out.println(arr[0][2]);
        insert(arr);
        display(arr);
         System.out.println("The transpose of the array is ");
        transpose(arr);

    }
}


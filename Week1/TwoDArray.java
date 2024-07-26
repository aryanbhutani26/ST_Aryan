package Week1;

import java.util.Scanner;

// Create a function to search an element in an array which return the index of the element that is found in the array 

public class TwoDArray {
    public static int[] search(int[][] arr, int num) {
        int[] searcharr = new int[2];
        searcharr[0] = -1;
        searcharr[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    searcharr[0] = i;
                    searcharr[1] = j;
                   
                }
            }
        }
        return searcharr;

        // System.out.println(searcharr[0] + " " + searcharr[1]); can be used to print if its void return type
       


        

        

    }

    

    

    static void insert(int[][] arr) {
        int count=1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // System.out.println("Enter the value of arr[ " + i + "]  and arr[ " + j + "]");
                arr[i][j] = count++;
                
            }
        }
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int [][][][] arr= new int [5][6][8][4];

        // How to declare a 2D array

        // datatpe [] [] nameof2Darray = new datatpe [rows][column];

        int[][] arr = new int[5][6];
        System.out.println(arr[0][2]);
        insert(arr);
        display(arr);
        int[] nums= search(arr, 12);
        // search(arr, 5);
        
        System.out.println(nums[0] + " " + nums[1]); 

    }

}

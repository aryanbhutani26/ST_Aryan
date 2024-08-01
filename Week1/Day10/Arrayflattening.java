package Week1.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayflattening {
    public static void flatten(int arr[][]){
        int []nums = new int[arr.length*arr[0].length];

            for (int i=0;i<arr.length;i++){
                for (int j=0; j<arr[0].length;j++){
                    nums[arr[0].length * i + j]=arr[i][j];
                }
            }
            Arrays.sort(nums);
           print(nums);
           System.out.println(); 
           for(int i=0;i<nums.length;i++){

            arr[i/arr[0].length][i%arr[0].length]=nums[i];
            
        }
        display(arr);

    }
    // static void fillArray(int[] arr , int[] nums){
    //     for(int i=0;i<nums.length;i++){
    //         arr[i/arr[0].length][j%arr[0].length]=nums[i];
    //     }

    
    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        System.out.println(arr[0][2]);
        int[][] arr1 ={{3,6,2},{4,8,3},{9,5,2}};

 
        flatten(arr1);
        
        


    }
}

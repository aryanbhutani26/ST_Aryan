package Day4;

import java.lang.reflect.Array;
import java.util.*;

public class Day4 {
    // public static int sum(int arr[]) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // }
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int[] arr = new int[4];
    // // arr[0] = 1;
    // // arr[1] = 2;
    // // arr[2] = 5;
    // // arr[3] = 4;
    // for (int i=0; i<arr.length;i++){
    // System.out.println("Enter the value of arr["+i+"] : ");
    // arr[i] = sc.nextInt();

    // }

    // int n = arr.length;
    // // int sum = sum(arr);
    // System.out.println(sum(arr));
    // }

    //

    // public static void swap(int a, int b) {
    // int temp = 0;
    // temp = a;
    // a = b;
    // b = temp;
    // System.out.println(" The swapped value of a is " + a);
    // System.out.println(" The swapped value of b is " + b);

    // }

    // public static void reverse(int[] array) {
    // int n = array.length;
    // int temp = 0;
    // for (int i = 0; i < n / 2; i++) {
    // temp = array[i];
    // array[i] = array[n - i - 1];
    // array[n - i - 1] = temp;

    // }
    // for (int i = 0; i < n; i++) {
    // System.out.println(array[i]);

    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println("The value of a is " + a + " and the value of b is " +
    // b);
    // swap(a, b);

    // int[] arr = new int[5];
    // arr[0] = 1;
    // arr[1] = 2;
    // arr[2] = 3;
    // arr[3] = 4;
    // arr[4] = 5;
    // reverse(arr);

    // }

    // Maximum value in an array
    // public static void maxNo(int[] arr) {
    // int max = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // System.out.println("The maximum value is " + max);

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // Integer[] arr = new Integer[4];
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println("Enter the value of arr[" + i + "] : ");
    // arr[i] = sc.nextInt();

    // }
    // List<Integer> numberList = Arrays.asList(arr);
    // int maximum= Collections.max(numberList);
    // // maxNo(arr);
    // System.out.println("The maximum number is: " + maximum);
    // }

    public static void bubbleSort(int[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            int temp = arr[turn];
            int j = turn - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int [] arr = new int[4];
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println("Enter the value of arr[" + i + "] : ");
                            arr[i] = sc.nextInt();
                            }
                            
                            System.out.println();
                            bubbleSort(arr);
                            }

}
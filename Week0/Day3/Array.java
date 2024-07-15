package Day3;

import java.util.*;

public class Array {
    // public static void displayArray(int [] arr){
    // for(int i=0;i<arr.length;i++){
    // System.out.print(arr[i]+" ");

    // }
    // }
    // public static void main(String[] args) {
    // int[] arr = new int[6];
    // arr[0] = 1;
    // arr[1] = 2;
    // arr[2] = 3;
    // arr[3] = 4;
    // arr[4] = 5;
    // arr[5] = 6;
    // displayArray(arr);

    // }

    // public static boolean primeNumber(int n) {
    // for (int i = 2; i < n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // int n = 19;

    // System.out.println(primeNumber(n));

    // }

    // public static int reverseNumber(int n) {
    // int temp = 0;
    // while (n != 0) {
    // temp = temp * 10 + n % 10;
    // n = n / 10;

    // }
    // return temp;
    // }

    // public static void main(String[] args) {
    // int n = 1234;
    // System.out.println(reverseNumber(n));

    // }

    public static int lengthNumber(int n) {
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }

    public static boolean armstrongNumber(int n) {
        int temp = n;
        int count = lengthNumber(n);
        int sum = 0;
        while (n != 0) {

            sum = sum + (int) Math.pow(n % 10, count);
            n = n / 10;

        }
        return sum == temp;

    }

    public static void main(String[] args) {
        int n = 371;

        System.out.println(lengthNumber(n));
        System.out.println(armstrongNumber(n));
    }
}

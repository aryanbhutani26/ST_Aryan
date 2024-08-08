package Week2.Day15;

import java.util.ArrayList;

public class Backtracking {
    static int sum = 0;
    static int recursiveSum(int[] arr, int n) {
        if (n == arr.length) {
            
            return sum;
        }
        sum += arr[n];
        recursiveSum(arr, n + 1);
        return sum;
    }

    static boolean backtrackSumarray(int[] arr, int i, int k) {
        if (i == arr.length) {
            return true;
        }
        if (sum > k) {
            return false;
        }
        sum += arr[i];
        if (!backtrackSumarray(arr, i + 1, k)) {
            sum -= arr[i];
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        
        System.out.println(recursiveSum(arr, 0));
        System.out.println(backtrackSumarray(arr, 0, 20));
        // System.out.println(sum);
    }
}
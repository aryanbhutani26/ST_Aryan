package Day5;

import java.util.Collections;
import java.util.Arrays;

import Day3.Array;

public class BinarySearch {
    static int BinarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 9, 7, 2, 28 };
        Arrays.sort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));
        System.out.println("Element found " + BinarySearch(arr, 4));
    }

}

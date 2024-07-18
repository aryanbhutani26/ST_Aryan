package Day5;

import java.util.*;

public class Upperbound {
    static int BinarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1 , answer=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                // System.out.println("Element found at index " + mid);
                answer = mid;
                start=mid+1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,3,3,3,3,4 };
        Arrays.sort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));
        System.out.println("Element found " + BinarySearch(arr, 3));
    }
    
}

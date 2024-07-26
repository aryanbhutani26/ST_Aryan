package Week1;

import java.util.*;

public class sortingintwoD {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 3 }, { 2, 6, 5 }, { 0, 70, 89, 10 } };
        
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                // Compare the rows based on the first element
                return Integer.compare(row1[0], row2[0]);
            }
        });

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Arrays.sort(arr);

    }
}

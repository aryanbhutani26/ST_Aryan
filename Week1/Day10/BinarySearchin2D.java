package Week1.Day10;

public class BinarySearchin2D {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int left = 0; 
            int right = matrix.length - 1;
            int index = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target) {
                    left = 0;
                    right = matrix[mid].length - 1;
                    index = mid;
                    break;
                }
                if (matrix[mid][0] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            // If no valid row is found, return false
            if (index == -1) {
                return false;
            }
            // Second binary search within the identified row
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[index][mid] == target) {
                    return true;
                }
                if (matrix[index][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }
   int temp= (int)Math.pow(10,9);

}

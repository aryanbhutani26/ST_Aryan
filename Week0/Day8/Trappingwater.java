package Day8;

public class Trappingwater {

    // public int trap(int[] height) {
    // if (height == null || height.length == 0) return 0;

    // int left = 0, right = height.length - 1;
    // int leftMax = 0, rightMax = 0;
    // int waterTrapped = 0;

    // while (left < right) {
    // if (height[left] < height[right]) {
    // if (height[left] >= leftMax) {
    // leftMax = height[left];
    // } else {
    // waterTrapped += leftMax - height[left];
    // }
    // left++;
    // } else {
    // if (height[right] >= rightMax) {
    // rightMax = height[right];
    // } else {
    // waterTrapped += rightMax - height[right];
    // }
    // right--;
    // }
    // }

    // return waterTrapped;
    // }

    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n-1 ] = height[n-1 ];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }
        return water;
    }

    
    

    public static void main(String[] args) {
        // Solution solution = new Solution();
        int[] height = { 1,0,0,2,3,0,2,4,0,0,1,2,6 };
        // int[] ngr = new int[height.length];
        System.out.println(trap(height)); // Output: 6
    }

}

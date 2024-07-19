package Day6;

public class Subarray {

    // generate subarrays of an array

    // public static void generateArray(int[] arr){
    // for (int i=0; i<arr.length; i++){
    // for (int j=i; j<arr.length ; j++){
    // for (int k=i ; k<=j;k++){

    // System.out.print(arr[k]);
    // // }
    // // System.out.println();
    // // }
    // // }
    // // }
    // public static void generateArray(int[] arr){
    // int maxsum=0;
    // for (int i=0; i<arr.length; i++){

    // for (int j=i; j<arr.length ; j++){
    // int sum=0;
    // for (int k=i ; k<=j;k++){
    // sum+=arr[k];
    // // System.out.println(sum);
    // maxsum= Math.max(maxsum, sum);
    // // System.out.print(arr[k]);
    // }
    // System.out.println();
    // }

    // }
    // System.out.println(maxsum);

    // }

    public static int KadaniAlgorithm(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            maxsum = Math.max(maxsum, currsum);
            if (currsum < 0) {
                currsum = 0;
            }

        }
        return maxsum;
    }

    // public static void rotateArray(int arr[], int k) {
    // for (int j = 0; j < k; j++) {
    // int temp = arr[arr.length - 1];
    // for (int i = arr.length - 1; i > 0; i--) {
    // arr[i] = arr[i - 1];

    // }
    // arr[0] = temp;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    public static void rotateArray(int arr[], int k) {
        // if (k>arr.length){
        // }

        k = k % arr.length;
        int[] new_arr = new int[arr.length];
        // int temp = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            new_arr[(i + k) % arr.length] = arr[i];

        }
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new_arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 15;
        // System.out.println(KadaniAlgorithm(arr));
        rotateArray(arr, 3);
        // rotateArray(arr);
        // rotateArray(arr);

    }
}

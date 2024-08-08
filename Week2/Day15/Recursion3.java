package Week2.Day15;

public class Recursion3 {
    // // Merge Sort
    // static void merge(int[] arr, int low, int mid, int high) {
    // int i = mid, j = high, k = mid;
    // int[] temp = new int[high - low + 1];
    // while (i >= low && j >= mid + 1) {
    // if (arr[i] > arr[j]) {
    // temp[k--] = arr[i--];
    // } else {
    // temp[k--] = arr[j--];
    // }
    // }
    // while (i >= low) {
    // temp[k--] = arr[i--];
    // }
    // while (j >= mid + 1) {
    // temp[k--] = arr[j--];
    // }
    // for (int p = 0; p < temp.length; p++) {
    // arr[p + low] = temp[p];
    // }
    // }

    // static void mergeSort(int[] arr, int low, int high) {
    // if (low < high) {
    // int mid = (low + high) / 2;
    // mergeSort(arr, low, mid);
    // mergeSort(arr, mid + 1, high);
    // merge(arr, low, mid, high);
    // }
    // }
    // static void mergeSort(int[] arr, int low, int high){

    // if(low<high){

    // int mid=(high+low)/2;

    // mergeSort(arr, 0, mid);

    // mergeSort(arr, mid+1, high);

    // merge(arr, low, mid, high);

    // }

    // }
    // public static void main(String[] args) {
    // int[] arr = { 5, 2, 8, 1, 9};
    // int low=0 , high = arr.length-1,mid = high+low/2 ;
    // merge(arr, low,mid,high);
    // mergeSort(arr, low, high);
    // for(int i:arr) System.out.print(i+" ");
    // }

    // static void merge(int[] arr, int low, int mid, int high) {
    // int[] temp = new int[high - low + 1];
    // int i = low, j = mid + 1, k = 0;

    // while (i <= mid && j <= high) {
    // if (arr[i] <= arr[j]) {
    // temp[k++] = arr[i++];
    // } else {
    // temp[k++] = arr[j++];
    // }
    // }

    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }

    // while (j <= high) {
    // temp[k++] = arr[j++];
    // }

    // for (int p = 0; p < temp.length; p++) {
    // arr[p + low] = temp[p];
    // }
    // }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = mid, j = high, k = high - low;

        while (i >= low && j > mid) {
            if (arr[i] >= arr[j]) {
                temp[k] = arr[i];
                i--;
            } else {
                temp[k] = arr[j];
                j--;
            }
            k--;
        }

        while (i >= low) {
            temp[k] = arr[i];
            k--;
            i--;
        }

        while (j > mid) {
            temp[k] = arr[j];
            j--;
            k--;
        }

        for (int p = 0; p < temp.length; p++) {
            arr[p + low] = temp[p];
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }


    static int sum=0;
    static int recursiveSum(int[] arr, int n) {
        if (n == arr.length) {
            
            return sum;
        }
        sum += arr[n];
        recursiveSum(arr, n + 1);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        
        int low = 0, high = arr.length - 1;
        mergeSort(arr, low, high);
        for (int i : arr)
            System.out.print(i + " ");
        recursiveSum(arr, 0 );
        System.out.println(sum);
        
    } 
}

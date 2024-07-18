package Day5;

public class SelectionSorting {

    public static int minimum(int[] arr, int temp) {

        int min = temp;
        for (int i = 1; i < arr.length; i++)
            if (arr[min] > arr[i])
                min = i;
        return min;

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = minimum(arr, i);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        int temp = 4;
        int[] arr = { 1, 4, 26, 5, 0 };
        System.out.println(minimum(arr, temp));
    }
}

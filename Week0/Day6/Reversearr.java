package Day6;

public class Reversearr {

    public static void reversearr( int [] arr ){
        int i=0;
        int j=arr.length-1;
        while(j>i){
        swap(arr , i++, j--);}
        
        
    }
    public static void swap(int[] array ,  int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
        // System.err.println(array);
        }

        public static void print(int arr[]){
            for (int k=0;k<arr.length;k++){
                System.out.print(arr[k] + " ");
            }
        }

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
           reversearr(arr);
           swap(arr, 2, 5);
           print(arr);
        }
    }


public class Dutchflag {
    public void sortcolors(int[] arr , int i , int j){
        int low=0,mid=0,high=arr.length-1;
        int temp = 0;
        arr[i]=arr[j];
        arr[j]=temp;
        while(mid<=high){
            if(arr[mid]==0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
                }
                else if(arr[mid]==1){
                    mid++;
                    }
                    else{
                        temp=arr[mid];
                        arr[mid]=arr[high];
                        arr[high]=temp;
                        high--;
                        }
                        

        }

    }

    // public static void main(String[] args) {
        
    // }
}

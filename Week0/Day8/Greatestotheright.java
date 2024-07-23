package Day8;

public class Greatestotheright {
    public static void Greatestotheright(int[] arr , int[] ngr) {
        // int max = arr[0];
        // int[] ngr = new int[8];
        // for (int i = arr.length - 1; i > 0; i--) {
        //     if (arr[i] > max) {
        //         max = arr[i];

        //     }
        //     ngr[i] = max;

        // }

        int maxR = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            ngr[i] = maxR; //store
            maxR = Math.max(maxR, arr[i]); //update
        }
        for (int i = 0; i < ngr.length; i++) {
            System.out.println(ngr[i]);
        }
    }

    public static void NGTL(int[] arr , int[] NGTL) {
        int maxR = 0;
        for(int i = 0; i<arr.length;i++){
            NGTL[i] = maxR; //store
            maxR = Math.max(maxR, arr[i]); //update
        }
        for (int i = 0; i < NGTL.length; i++) {
            System.out.println(NGTL[i]);
        }

    }

    public static void NSTR(int[ ] arr, int [] NSTR){
        int minL = 100;
        for(int i = arr.length-1;i>0;i--){
            NSTR[i] = minL; //store
            minL = Math.min(minL, arr[i]); //update
            }
            for (int i = 0; i < NSTR.length; i++) {
                System.out.println(NSTR[i]);
            }
    }

    public static void NSTL(int[ ] arr, int [] NSTL){
        int minL = 100;
        for(int i =0;i<arr.length;i++){
            NSTL[i] = minL; //store
            minL = Math.min(minL, arr[i]); //update
            }
            for (int i = 0; i < NSTL.length; i++) {
                System.out.println(NSTL[i]);
            }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 8, 7, 3, 4 };
        int [] ngr = new int[arr.length];
        // Greatestotheright(arr , ngr);
        NGTL(arr, ngr);
        // NSTL(arr,ngr);
    }
}

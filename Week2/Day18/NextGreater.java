import java.util.Stack;

public class NextGreater {

    static int[] nextGreater(int[] arr) {
        int[] NGE = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            // Step 1
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }
            // Step 2
            if (stk.empty()) {
                NGE[i] = -1;
            } else {
                NGE[i] = stk.peek();
            }
            // Step 3
            stk.push(arr[i]);
        }

        s.charAt()
        return NGE;
    }

    public static void main(String[] args) {
        int[] arr = { 7,3,4,5,9,2 };
        int[] result = nextGreater(arr);
        for(int n:result){
            System.out.print(n+" ");
        }
        nextGreater(arr);
        // int n = arr.length;
        // int[] nextGreater = new int[n];
        // for (int i = 0; i < n; i++) {
        // nextGreater[i] = -1;
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (arr[i] < arr[j]) {
        // nextGreater[i] = arr[j];
        // break;
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(nextGreater[i] + " ");
        // }
        // }

    }
}

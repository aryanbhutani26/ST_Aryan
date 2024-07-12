package Day2;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {

        int n = 5;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows: ");
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || i == n || j == 1 || j == n) {
        // System.out.print("* ");

        // } else {
        // System.out.print(" ");
        // }
        // }
        // // for (int k= 2 ; k<n-1; k++){
        // // System.out.print(" ");}

        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i +j == 6) {
        // System.out.print("* ");

        // } else {
        // System.out.print(" ");
        // }
        // }
        // // for (int k= 2 ; k<n-1; k++){
        // // System.out.print(" ");}

        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {

        // for (int k = 1; k <= (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j1 = 1; j1 <= i-1; j1++) {
        // System.out.print("* ");
        // }
        // for (int j2 = 1; j2 <= i - 1; j2++) {
        // System.out.print("* ");
        // }

        // System.out.println("* ");
        // }

        // for (int i = n; i >= 1; i--) {

        // for (int k = 1; k <= (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j1 = 1; j1 <= i-1; j1++) {
        // System.out.print("* ");
        // }
        // for (int j2 = 1; j2 <= i - 1; j2++) {
        // System.out.print("* ");
        // }

        // System.out.println("* ");
        // }

        // Omission

        // for (int i = 1; i <= n; i++) {

        // for (int k = 1; k <= (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j1 = 1; j1 <= i-1; j1++) {
        // System.out.print("* ");
        // }
        // for (int j2 = 1; j2 <= i - 1 && j2<n-3; j2++ ) {
        // System.out.print("* ");
        // }

        // System.out.println("* ");
        // }

        // for (int i = 1; i < n; i++) {
        //     for (int k = 1; k < n - i; k++) {
        //         System.out.print ("  ");
        //     }

        //     for (int j = 1; j < i; j++) {
        //         System.out.print ("* ");
        //     }
        //     System.out.println();

        //     }

        //     for (int i = n-2; i > 1; i--) {
        //         for (int k = 1; k < n - i; k++) {
        //             System.out.print ("  ");
        //         }
    
        //         for (int j = 1; j < i; j++) {
        //             System.out.print ("* ");
        //         }
        //         System.out.println();
    
        //         }
               
        //     }


        for (int i = n; i >= 1; i--) {
                    for (int k = 1; k <= n - i; k++) {
                        System.out.print ("    ");
                    }
        
                    for (int j = 1; j <= i; j++) {
                        System.out.print ("* ");
                    }
                    System.out.println();
        
                    }

                    
        for (int i = 2; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print ("    ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print ("* ");
            }
            System.out.println();

            }

           
        }


        

        

    
}
    // int n = 5;
    // for (int i = n; i >=1; i--) {
    // for (int k=1; k<(n-i); k++){
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println("*");
    // }

    // for (int i = n; i >=1; i--) {
    // for (int k=0; k<(n-i); k++){
    // System.out.print(" ");
    // }
    // for (int j = 1; j < i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println("*");
    // }


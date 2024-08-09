package Week2.Day17;
import java.util.*;

public class Sudokusolver {

    // static boolean sudokuSolver(int[][] sudoku, int i, int j, int n) {
    //     if (i == n) {
    //         return true;
    //     }
    //     if (j == n) {
    //         return sudokuSolver(sudoku, i + 1, 0, n);
    //     }
    //     if (sudoku[i][j] != 0) {
    //         return sudokuSolver(sudoku, i, j + 1, n);
    //     }
    //     for (int num = 1; num <= n; num++) {
    //         if (check(sudoku, i, j, n, num)) {
    //             sudoku[i][j] = num;
    //             if (sudokuSolver(sudoku, i, j + 1, n)) {
    //                 return true;
    //             } else {
    //                 sudoku[i][j] = 0;
    //                 return false;
    //             }
    //         }
    //     }
    //     return false;
    // }

    

    // static boolean check(int[][] sudoku, int i, int j, int n, int number) {
    //     // check Horizontal and vertical
    //     for (int x = 0; x < n; x++) {
    //         if (sudoku[x][j] == number || sudoku[i][x] == number) {
    //             return false;
    //         }

    //     }
    //     // check bigger box
    //     int rn = (int) Math.sqrt(n);
    //     int sx = (i / rn) * rn;
    //     int sy = (j / rn) * rn;

    //     for (int x = sx; x < sx + rn; x++) {
    //         for (int y = sy; y < sy + rn; y++) {
    //             if (sudoku[x][y] == number) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // static void display(int[][] matrix, int n, int m) {
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     int[][] sudoku = {
    //         {5, 3, 0, 0, 7, 0,
    //             0, 0, 0, 0, 0, 0,
    //             0, 0, 0, 0, 0, 0,
    //             0, 0, 0, 0, 0, 0,
    //             0, 0, 0, 0, 0, 0,
    //         }
    //         };
            
    //         System.out.println(sudokuSolver(sudoku, 0, 0, sudoku.length));
    //         display(sudoku, 5, 6);



    // }


    static boolean check(int[][] sudoku, int i, int j, int n, int number){
         //Check Vertical and Horizontal
        for(int x=0;x<n;x++)
        if(sudoku[x][j]==number || sudoku[i][x]==number)
            return false;

        //Check Bigger Box
        int rn=(int)Math.sqrt(n);
        int sx= (i/rn)*rn;
        int sy= (j/rn)*rn;

        for(int x=sx; x<sx+rn;x++)
            for(int y=sy; y<sy+rn;y++)
                if(sudoku[x][y]==number)
                    return false;
        return true;
    }

    static boolean sudokuSolver(int[][] sudoku, int i, int j, int n){
        if(i==n)    //Answer Found
            return true;
        if(j==n)    //Row Filled
            return sudokuSolver(sudoku, i+1, 0, n);
        if(sudoku[i][j]!=0) //Block Prefilled
            return sudokuSolver(sudoku, i, j+1, n);
        
        for(int number=1;number<=9;number++){
            if(check(sudoku, i, j, n, number)){
                sudoku[i][j]=number;
                if(sudokuSolver(sudoku, i, j+1, n)) return true;
            }
        }
        sudoku[i][j]=0;
        return false;
    }

    public static void main(String[] args) {
        int n=9;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[][] mat= new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        System.out.println();
        System.out.println();
        sudokuSolver(mat,0,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
/*
 * 9
5 3 0 0 7 0 0 0 0 
6 0 0 1 9 5 0 0 0 
0 9 8 0 0 0 0 6 0 
8 0 0 0 6 0 0 0 3 
4 0 0 8 0 3 0 0 1 
7 0 0 0 2 0 0 0 6 
0 6 0 0 0 0 2 8 0 
0 0 0 4 1 9 0 0 5 
0 0 0 0 8 0 0 7 9 
 */


package Multidimensional;
import java.util.Scanner;

//give an integer n ,return the first n rows of pascals triangle
   //1.p[i][j] = p[i-1][j]+p[i-1][j-1]
   //2.In every row, the first and last element is 1
   //3.Jagged Array -> ith row has (i+1) columns

public class PascalsTriangle {
    static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
    }
}
static int[][] pascal(int n){
    int[][] p = new int[n][];
    for(int i = 0; i < n; i++){
        p[i] = new int[i+1];   //ith row has (i+1) columns
        p[i][0] = 1;
        p[i][i] = 1;
        for(int j = 1; j < i; j++){
            p[i][j] = p[i-1][j] + p[i-1][j-1];
            }
            }
    return p;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] p = pascal(n);
        System.out.println("Pascal's Triangle: ");
        printArray(p);

    }

    
}

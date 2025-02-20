package Multidimensional;

import java.util.Scanner;
 
public class Transpose {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                }
    }
    static int[][] TransposeMatrices(int[][] a,int r,int c){
        
            int[][] transpose=new int[c][r];
            for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    transpose[i][j]=a[j][i];
                    }
                    }
                    System.out.println("Transpose of the matrix is:");
                    printArray(transpose);
                    return transpose;
                }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and number of columns of matrix  :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter " +r*c+ " elements in the matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the values of matrix :");
        printArray(a);
        
        TransposeMatrices(a,r,c);
    
    }
}

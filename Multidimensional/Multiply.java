package Multidimensional;

import java.util.Scanner;

public class Multiply {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                }
    }
    static void MultiplyMatrices(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
            if(c1!=r2){
                System.out.println("Matrices can't be multiplied");
                return;
            }
            int[][] Multiply = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {  //c1 times add karna ka liya
                        Multiply[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printArray(Multiply);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and number of columns of matrix 1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter " +r1*c1+ " elements in the matrix 1: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the values of matrix 1:");
        printArray(a);
        System.out.println("Enter number of rows andnumber of columns of matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter " +r2*c2+ " elements in the Matrix 2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the values of matrix 2:");
        printArray(b);

        MultiplyMatrices(a,r1,c1,b,r2,c2);
    
    }
    
}

package Multidimensional.PrefixSum;

import java.util.Scanner;

//matrix->n*m & 2 coordinates(l1,r1),(l2,r2)
// return sum->(l1,r1) to (l2,r2)
// l2 >=l1,r2 >= r1   || 0<=l1,l2 <r, 0<=r1,r2<c
// Brute Force Method

public class SumOfRectangle {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
    static int RectangleSum(int[][] a,int l1,int r1,int l2, int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=a[i][j];
            }
        }
        return sum;
        
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
        System.out.println("Matrix is : ");
        printArray(a);
        System.out.println("Enter Rectangle boundaries l1 ,r1, l2, r2:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        System.out.println("Rectangle Sum: "+RectangleSum(a,l1,r1,l2,r2));
        
    
    }
    
}

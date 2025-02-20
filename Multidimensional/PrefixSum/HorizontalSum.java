package Multidimensional.PrefixSum;

import java.util.Scanner;

public class HorizontalSum {
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
    //calculate row-wise sum
    static void findPrefixSumMatrix(int[][] a){
        int r=a.length;  //r>0
        int c=a[0].length;

        //traverse horizontally to calculate to row-wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
    }
    static int findSum(int[][] a,int l1,int r1,int l2, int r2){
        int Sum=0;
        findPrefixSumMatrix(a);
        for(int i=l1;i<=l2;i++){
            // r1 to r2 sum for row i
            if(r1>=1)
            Sum+=a[i][r2]-a[i][r1-1];
            
            else
                Sum+=a[i][r2];
            
        }

        return Sum;
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
        System.out.println("Rectangle Sum: "+findSum(a,l1,r1,l2,r2));
        
    
    }
    
}





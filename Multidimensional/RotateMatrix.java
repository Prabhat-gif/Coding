package Multidimensional;

import java.util.Scanner;

public class RotateMatrix {

    //given a Square matrix,turn it by 90 degrees in a clockwise
    // direction without using any extra space
    
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
    }


    static void printArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                }
    }
    static void TransposeMatricesInplace(int[][] a,int r,int c){
            for(int i=0;i<c;i++){
                for(int j=i;j<r;j++){     //transpose of an matrix
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
        }
    }
}
static void rotate(int[][] a,int n){
    TransposeMatricesInplace(a,n,n);
    for(int i=0;i<n;i++){
        reverseArray(a[i]);    //reverse an array
    }
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
        System.out.println("Rotation of matrix: ");
        rotate(a,r);   //r=c=n
        printArray(a);
    
    }
}





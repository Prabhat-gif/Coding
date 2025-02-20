package Multidimensional;

import java.util.Scanner;   //THIS METHOD IS VALID FOR
                            //TRANSPOSE OF ONLY SQUARE MATRIX
public class Trans {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println(); 
                }
    }
    static void TransposeMatricesInplace(int[][] a,int r,int c){
            for(int i=0;i<c;i++){
                for(int j=i;j<r;j++){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];   //j=0 pa sa start karna pa ek sa
                    a[j][i] = temp;     // jayada bar swap ho ja rha fir sa fir sa original element aa ja rha
                                       //  isi liya j=i sa start kar rha ha
        }
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
        System.out.println("Transpose matrix: ");
        TransposeMatricesInplace(a,r,c);
        printArray(a);
    
    }
}




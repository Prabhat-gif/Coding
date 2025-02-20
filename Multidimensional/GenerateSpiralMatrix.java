package Multidimensional;

import java.util.Scanner;

//given a positive integer n,generate an n*n matrix filled with elements
//from 1 to n*n in spiral order.
public class GenerateSpiralMatrix {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        }
    }
    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0,bottomRow = n-1,leftCol = 0,rightCol = n-1;
        int curr = 1;
        while (curr<=n*n) {
            // topRow->leftCol to rightCol
            for (int j = leftCol; j<= rightCol && curr<=n*n; j++) {  //3*4 mai error due to totalElements
                matrix[topRow][j]=curr;
                curr++;
            }
            topRow++;
            
            // rightCol->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--;
            
            // bottomRow->rightCol to leftCol
            for(int j=rightCol;j>=leftCol && curr<=n*n;j--){ 
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;

            
            //leftCol->bottoRow to topRow
            for(int i=bottomRow;i>=topRow && curr<=n*n;i--){
                matrix[i][leftCol] =curr;
                curr++;
            }
            leftCol++;

        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int[][] matrix = generateSpiralMatrix(n);
        System.out.println("Generate Spiral Matrix: ");
        printMatrix(matrix);
        
    }
}




    


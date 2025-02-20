package Assignment;

import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        int Squares = n * n;
        System.out.println("Square of a number: "+Squares);
        int Cubes = n * n * n;
        System.out.println("Cube of a number: "+Cubes);


    }
}

package Recursion;

import java.util.Scanner;
//f(n) = n*f(n-1)--->Recursive formula
public class Factorial {
    static int factorial(int n){  //base case
        if(n==0)return 1;
        // int smallAns = factorial(n-1);    //subproblem--->recursive work
        return n*factorial(n-1); //self work
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
}

//Time complexity-->O(n)
//Space complexity-->O(n)
package Recursion;
import java.util.Scanner;   //0,1,1,2,3,5,8,13,21,.......
//f(n) = f(n-1) + f(n-2)---->Recursive Formula
public class Fibonacci {
    static int fib(int n){
        
        if(n==0 || n==1){  //n=0,n=1--->base case
            return n;
        }
        //recursive case-->  fib(n-1) & fib(n-2)
        // int prev = fib(n-1);   //subproblem
        // int prevPrev = fib(n-2);  //subproblem
        // return prev+prevPrev;     //self work for addition
    return  fib(n-1) + fib(n-2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println(fib(i));
        }
    }
}
//Time complexity = O(2^n)
//Space complexity = O(n)

package Recursion;

import java.util.Scanner;
//f(n) = f(n/10) + n%10--->Recursive function
public class SumOfDigits {
    static int SOD(int n){
        if(n>=0 && n<=9 ) return n;  //base case
        // // recursive work
        // int smallAns = SOD(n/10);
        // //self work
        // return smallAns + n%10;
        return n%10+SOD(n/10);  // last digit ko add karna self work


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SOD(n));
    }
    
}
//Time complexity = O(d)
//Space complexity = O(d)  //d is number of digits in n



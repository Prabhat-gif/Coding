package Recursion;
import java.util.Scanner;
//f(p,q) = f(p,q-1)*p--->Recursive Function
public class Power {
    static int power(int p, int q) {
        if(q==0) return 1;  //base case

        // int smallAns = power(p,q-1);  //subproblem
        // int ans = p*power(p,q-1);     //self work
        // return ans;
        
        return p*power(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p:");
        int p = sc.nextInt();
        System.out.println("Enter q:");
        int q = sc.nextInt();

        System.out.println(power(p,q));
    }
}
//Time complexity = O(q)
//Space complexity = O(q)

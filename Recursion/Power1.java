package Recursion;

import java.util.Scanner;
//f(p,q) = f(p,q/2)*f(p,q/2)    if q is even
//       = f(p,q/2)*f(p,q/2)*p  if q is odd

public class Power1 {
    static int power1(int p, int q){
        if(q==0) return 1;

        int smallAns = power1(p,q/2);
        if(q%2==0){
            return smallAns*smallAns;  //aisa hi likha ha short code likho ga to time complexity badh jai ga O(n) ho jai ga
        }
        
        return p*smallAns*smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p:");
        int p = sc.nextInt();
        System.out.println("Enter q:");
        int q = sc.nextInt();

        System.out.println(power1(p,q));
    }
}
//Time complexity = O(log(q))
//Space complexity = O(log(q))

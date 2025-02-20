package Recursion;
import java.util.Scanner;

public class ReverseNatural { //n>=1
    static void PD(int n){
        //base case
        if(n==1){
        System.out.println(n);
        return;
        }
        //self work
        System.out.println(n);
        //recursive work
        PD(n-1);
}
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PD(n);
    }
    
}

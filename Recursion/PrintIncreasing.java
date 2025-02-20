package Recursion;
import java.util.Scanner;

public class PrintIncreasing {
    static void PI(int n){ //1,2,3.......,n
        //base case
        if(n==1){
            System.out.println(n);    //1 case ma dikkat dega to isi liya ye khud sa print kiya h
            return;
        }
        //recursive work
        PI(n-1);  // 1 2 3 .......n-1
        //self work
        System.out.println(n);  //self print n
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        PI(n);
    }
    
}

package Assignment;
import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a 3-digit number: ");
        int n = sc.nextInt();
        
        if(n>=100 && n<=999){
            int middleDigit = (n/10)%10;
            int Square = middleDigit*middleDigit;
            System.out.println("Square of the middle digit is: "+Square);
        }
        else{
            System.out.println("Invalid input");
        }

    }
    
}

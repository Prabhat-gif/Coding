package Assignment;
import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number: ");
        int n = sc.nextInt();

        if(n>=1000 && n<=9999){
            int firstDigit = n/1000;
            int secondDigit = (n/100)%10;
            int thirdDigit = (n/10)%10;
            int fourthDigit = n%10;
            System.out.println("The digits of the number are: ");
            System.out.println("Enter first digit: "+firstDigit);
            System.out.println("Enter second digit: "+secondDigit);
            System.out.println("Enter third digit: "+thirdDigit);
            System.out.println("Enter fourth digit: "+fourthDigit);
        }
        else{
            System.out.println("Invalid input. Please enter a 4-digit number.");
        }
        
        
    
}
}

package Assignment;

import java.util.Scanner;

public class sum4 {
    static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            }
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        int n = sc.nextInt();
        if(n>=100 && n<=999){
            int firstDigit = n/100;
            int thirdDigit = n % 10;

            int sum = firstDigit+thirdDigit;
            System.out.println("Sum of first and last digit is: "+sum);

        }
        else{
            System.out.println("Error: Please enter a 3-digit number");
        }
        
    }
    
}

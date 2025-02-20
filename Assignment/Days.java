package Assignment;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int totaldays = sc.nextInt();

        int daysInYear = 365;
        int daysInMonth = 30;

        int years = totaldays / 365;
        int remainingDaysAfterYears = totaldays % 365;

        int months = remainingDaysAfterYears / 30;

        int remainingDays = remainingDaysAfterYears % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remainingDays);
        

    }
    
}

package Assignment;
import java.util.Scanner;

public class RupeesAndPaisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        int rupees = sc.nextInt();
        
        int paisa = rupees *100;
        System.out.println("Total amount in paisa: " + paisa);
    }
    
}

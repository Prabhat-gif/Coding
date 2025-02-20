package Assignment;
import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p:");
        int p = sc.nextInt();
        System.out.println("Enter q:");
        int q = sc.nextInt();
        int sum = p + q;
        System.out.println("Sum of p and q is: " + sum);
    }
    
}

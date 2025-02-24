
import java.util.Scanner;
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return n>0 && 1162261467% n == 0;
    }
    public static void main(String[] args) {
        PowerOfThree p = new PowerOfThree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        boolean result=p.isPowerOfThree(n);
        System.out.println(result);

    }
}

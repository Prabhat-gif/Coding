import java.util.Scanner;
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        boolean result=p.isPowerOfTwo(n);
        System.out.println(result);

    }
    
}

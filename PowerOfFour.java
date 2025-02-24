import java.util.Scanner;
public class PowerOfFour {

    public boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && (n&0x55555555)!=0;
    }
    public static void main(String[] args) {
        PowerOfFour p = new PowerOfFour();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        boolean result=p.isPowerOfFour(n);
        System.out.println(result);

    }
    

    
}

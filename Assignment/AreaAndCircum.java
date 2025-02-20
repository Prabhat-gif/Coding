package Assignment;
import java.util.Scanner;

public class AreaAndCircum {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double  r = sc.nextDouble();
    
        double pi = 3.14;
        double area = pi*(r*r);
        System.out.println("Enter Area of Circle: "+area);
        double circum = 2*pi*r;
        System.out.println("Enter Circumference of Circle: "+circum);


    }
    
}

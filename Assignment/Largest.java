package Assignment;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();

        // int difference = p-q;
        // System.out.println("Difference of two number : " + difference);

        // if(p>q){
        //     System.out.println("Largest number is: "+p);
        // }
        // else if(q>p){
        //     System.out.println("Largest number is: "+q);
        // }
        // else{
        //     System.out.println("Both numbers are equal");
        // }
        
        //first largest using nested loop
        // if(p>q){
        //     if(p>r){
        //         System.out.println("Largest number is: "+p);}
        //         else{
        //             System.out.println("Largest number is: "+r);
        //         }
        //     }
        //     else if(q>p){
        //         if(q>r){
        //             System.out.println("Largest number is: "+q);
        //         }
        //         else{
        //             System.out.println("Largest number is: "+r);
        //         }
        //     }
        
        
        //And operator find first largest
        // if(p>q && p>r){
        //     System.out.println("Largest number is: "+p);}
        
        // else if(q>p && q>r){
        //         System.out.println("Largest number is: "+q);
        //         }
                
        // else{
        //     System.out.println("Largest number is: "+r);
        // }

        if((p>q && p<r) || (p<q && p>r)){
            System.out.println("Second Largest number is: "+p);}
            
        else if((q>p && q<r) || (q<p && q>r)){
            System.out.println("SecondLargest number is: "+q);
            }
                    
        else{
            System.out.println("Second Largest number is: "+r);
        }
    }

}




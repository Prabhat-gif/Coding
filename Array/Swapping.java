package Array;

public class Swapping {

    // a=9,b=5
    static void Swap(int a , int b){
        System.out.println("Original values before swap");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println(" Values after swap");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        //a=5,b=9

        

        }
    


    public static void main(String[] args) {
        int a=9;
        int b=5;
        int[] arr = {1,2,3,4,5};
        Swap(a,b);

    }
}
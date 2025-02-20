package Array;
import java.util.Scanner;

public class Input {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int[] arr = new int[5];
        System.out.println(" Enter " + n + "  numbers:");
        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt(); 
        }
        System.out.println("Original Array");
        printArray(arr);
        //trying to copy arr to arr_2
        System.out.println("Copied arr_2");
        int[] arr_2 = arr;      //Refernce in an array
        printArray(arr_2);

        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("Original array after changing the value of arr_2");
        printArray(arr);
        System.out.println("Copied arr_2 after changing the value of arr_2");
        printArray(arr_2);

    
}

}

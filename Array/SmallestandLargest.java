package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestandLargest {
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n =sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<arr.length;i++){
        arr[i]= sc.nextInt();
    }
    int[] ans = smallestAndLargestElement(arr);
    System.out.println("Smallest element is: "+ans[0]);
    System.out.println("Largest element is: "+ans[1]);


    
}
}
    

    


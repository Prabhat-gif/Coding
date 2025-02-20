package Array;

import java.util.Scanner;

public class RepeatingElement {
    static int countRepeating(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){  //found answer
                return arr[i];
                }
            
        }
    }
    return -1;        //not repeating then -1
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
    System.out.println("First Repeating number: "+countRepeating(arr));
    
}
}

package Array;

import java.util.Scanner;

public class Rotate {      //not created new array
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse(int[] arr,int i ,int j){
        // int i=0 , j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateInPlace(int[] arr , int k){
        int n=arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        
    
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
    System.out.println("Enter k");
    int k = sc.nextInt();
    System.out.println("Original array:");
    printArray(arr);

    
    rotateInPlace(arr,k);
    System.out.println("Rotated array:");
    printArray(arr);
    
    }
    
}

    


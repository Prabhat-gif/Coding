package Array.TwoPonters;

import java.util.Scanner;

public class SortArray {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    static void sortZeroesandOnes(int[] arr){
        int n = arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){   //Count zeroes
            if(arr[i]==0){
                zeroes++;
            }                    //two times use transversed then time 
                                // complexity increases

        }
        for(int i=0;i<n;i++){   // 0 to zeroes-1: 0 , zeroes to n-1: 1
            if(i<zeroes){
                arr[i]=0;
            }
        else{
            arr[i]=1;
            }
        }
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
    
    System.out.println("Original array:");
    printArray(arr);

    
    System.out.println("Sorted Array:");
    sortZeroesandOnes(arr);
    printArray(arr);
}
    
}

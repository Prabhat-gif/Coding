package Array.PrefixSum;

import java.util.Scanner;
// 1-based indexing
public class PrefixSumQuery {
    static void printArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] preSum(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n =sc.nextInt();
    int arr[] = new int[n+1];
    System.out.println("Enter the elements of the array:");
    for(int i=1;i<=n;i++){
        arr[i]= sc.nextInt();
    }
    
    System.out.println("Original array:");
    printArray(arr);

    System.out.println("Enter number of queries: ");
    int q = sc.nextInt();

    
    int[] prefix = preSum(arr);
    System.out.println("Sum: ");
    printArray(arr);

    while(q-- >0){
        System.out.println("Enter range: ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = prefix[r]-prefix[l-1];
        System.out.println("Sum: "+ans);
    }
    
    }
}
    


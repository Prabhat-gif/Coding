package Array;

import java.util.Scanner;

public class Triplets {
    static int TripletsSum(int[] arr , int target){
        int n = arr.length;
        int ans = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
        }

        }
            }
            }
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
    System.out.print("Enter the target sum:");
    int target = sc.nextInt(); 
    System.out.println(TripletsSum(arr,target));
    
}
}
    


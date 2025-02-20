package Array;

import java.util.Scanner;

public class ArrayManipulation {
    static int findUnique(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]= -1;
                    arr[j]= -1;
            }

            
        }
    }
    int ans= -1;
    for(int i=0;i<n;i++){
        if(arr[i]>0){     //arr[i]!= -1
            ans=arr[i];

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
    System.out.println(findUnique(arr));
    
}
    
}

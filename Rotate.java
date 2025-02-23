

import java.util.Scanner;

public class Rotate {      //not created new array
    static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    static void reverse(int[] nums,int start ,int end){
        // int i=0 , j=arr.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateInPlace(int[] nums , int k){
        int n=nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,k-1);

        
    
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n =sc.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<nums.length;i++){
        nums[i]= sc.nextInt();
    }
    System.out.println("Enter k");
    int k = sc.nextInt();
    System.out.println("Original array:");
    printArray(nums);

    
    rotateInPlace(nums,k);
    System.out.println("Rotated array:");
    printArray(nums);
    
    }
    
}

package Array.TwoPonters;

import java.util.Scanner;

public class sortSquares {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");  //sorted Array
        }
        System.out.println();
    }
    static int[] SquaresSort(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int k=n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--] =arr[left]*arr[left];
                left++;
            }
            else{
                ans[k--] = arr[right]*arr[right];
                right--;
            }
        }
        // reverse(ans);
    return ans;

}
// static void reverse(int[] arr){
//     int i=0,j=arr.length-1;
//         while(i<j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         i++;
//         j--;
//     }
// }
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

    int[] ans = SquaresSort(arr);
    System.out.println("Sorted array:");
    printArray(ans);

    }
}
    



    

    


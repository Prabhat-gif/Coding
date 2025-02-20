package Array.TwoPonters;

import java.util.Scanner;

public class Sort {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortByParity(int[] arr){   //2nd question
        int left=0 , right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
    
            left++;
            right--;
        }
    

            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
        }
    
}

    }
    
    static void SortArr(int[] arr){     //1st question
        int left=0 , right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
            int temp = arr[left];                   //swap
            arr[left] = arr[right];
            arr[right] = temp;
    
            left++;
            right--;
        }
    

            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
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
    sortByParity(arr);
    printArray(arr);
    // SortArr(arr);
    // printArray(arr);
        
    }
}
    



    

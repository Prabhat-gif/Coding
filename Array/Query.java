package Array;

import java.util.Scanner;

public class Query {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;  //freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;

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

    int[] freq = makeFrequencyArray(arr);

    System.out.println("Enter number of queries: ");
    int q = sc.nextInt();

    while(q>0){
        System.out.println("Enter number to be searched");
        int x = sc.nextInt();
        if(freq[x]>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        q--;
    }
}
}

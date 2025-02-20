package Array;

public class App {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            }
    }
    static void changeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    static void changeval(int a){
        a = 2003;
    }
    public static void main(String[] args) {
        int a = 5;
        changeval(a);
        System.out.println(a);
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        changeArray(arr);
        printArray(arr);
    }
    
}

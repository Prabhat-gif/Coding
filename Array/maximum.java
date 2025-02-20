package Array;

public class maximum {
    void maxOfArrays(){
        int[] arr1 = {1, 2, 3, 4, 5};
        int maximum=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>maximum){
                maximum=arr1[i];
                }
                }
                System.out.println("Maximum element in array is: "+maximum);
    
}
public static void main(String[] args) {
    maximum obj = new maximum();
    obj.maxOfArrays();
}
}

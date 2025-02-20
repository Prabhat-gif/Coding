package Array;

public class Sum {
    void demoArrays(){
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        //for loop
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];    //sum+=arr[i];
    }
    // //for each loop
    // for (int i : array) {
    //     sum = sum + i;
    //     }
    System.out.println("The sum of the array: " + sum);

    
}
public static void main(String[] args) {
    Sum obj = new Sum();
    obj.demoArrays();
}
}

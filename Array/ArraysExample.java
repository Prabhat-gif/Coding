package Array;

public class ArraysExample {
    void multiArrays(){
    //    int [][] array = new int[3][3];
    int[][] arr={{2,3,5},{7,8,9},{5,6,7}};
    System.out.println(arr[0][0]);
    System.out.println(arr[1][1]);
    System.out.println(arr[0][2]);
    System.out.println(arr[0][1]);
    System.out.println(arr.length);

    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        // String[] names = new String[3];
        String[] names = {"John", "Mary", "David"};

        // ages[0] = 1;
        // ages[1] = 2;
        // ages[2] = 3;
        // weights[0] = 1.1f;
        // weights[1] = 2.2f;
        // weights[2] = 3.3f;
        // names[0] = "John";
        // names[1] = "Jane";
        // names[2] = "Bob";
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        // System.out.println(weights[0]);
        // System.out.println(weights[1]);
        // System.out.println(weights[2]);
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names.length);


    }
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        obj.multiArrays();
    }
    
}

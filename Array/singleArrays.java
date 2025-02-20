package Array;

public class singleArrays {
    void demoArrays(){
    int[] ages= new int[3];
    ages[0]=1;
    ages[1]=2;
    ages[2]=3;
    //for loop
    for(int i=0;i<ages.length;i++){
        System.out.println(ages[i]);
}
//foreach loop
for(int age:ages){
    System.out.println(age);
    }
    //while loop
    int i=0;
    while(i<ages.length){
        System.out.println(ages[i]);
        i++;
}
    }
public static void main(String[] args) {
    singleArrays obj = new singleArrays();
obj.demoArrays();
}
}
    
package Array;

public class Index {
    void valueAtidx(){
        int arr[] = {1,2,3,4,5,3};
        int x=3;
        int ans= -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
    }
}
if(ans== -1){
    System.out.println("Not found");
}else{
    System.out.println(" Found " +x+ " at index " +ans);
}
    

    }
public static void main(String[] args) {
    Index obj = new Index();
    obj.valueAtidx();
}
    }




public class moveZeroes {
    public void display(int[] nums){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public void moveZeroes1(int[] nums) {
        int count = 0;
            for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i=count; i< nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes obj = new moveZeroes();
        obj.moveZeroes1(nums);
        obj.display(nums);
    }
}

public class RemoveDuplicatesFromSortedArray {
    public void display(int[] nums,int length){
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public int removeDuplicates(int[] nums) {
        int index=1;
        if(nums.length<=1){
            return nums.length;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[index-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r=new RemoveDuplicatesFromSortedArray();
        int[] nums={1,1,2,2,3,3,4,5};
        
        int length=r.removeDuplicates(nums);
        System.out.println("length of array after removing duplicates is "+length);
        r.display(nums,length);
    }
}

class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        if(nums.length==1){
            if(nums[0]==0){
                return 0;
            }
            else{
                return 1;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && nums[i]<min){
                min=nums[i];
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[i]=nums[i]-min;
            }
        }
        count++;
        //checking whether every element in nums equal to 0 or not
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count+=minimumOperations(nums);
                break;
            }
        }
        return count;
    }
}
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int start=0;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==original){
                original=findFinalValue(nums,2*original);
                break;
            }
        }
        return original;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return 1;
            }
        }
        int mini=Integer.MAX_VALUE,j=0;
        for(int i=0;i<nums.length;i++){
            target-=nums[i];
            while(target<=0){
                mini=Math.min(mini,i-j+1);
                target+=nums[j];
                j++;
            }
        }
        if(mini==Integer.MAX_VALUE){
            return 0;
        }
        return mini;
    }
}
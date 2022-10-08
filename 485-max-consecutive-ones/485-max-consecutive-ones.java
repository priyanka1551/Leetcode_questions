class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1){
            if(nums[0]==1){
                return 1;
            }
            else{
                return 0;
            }
        }
        int mx=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if((i==nums.length-1) || (nums[i]==1 && nums[i+1]==0 && i<nums.length-2 ) ){
                 mx=Math.max(mx,count);
            }
            else if(nums[i]==0){
                count=0;
            }
        }
        return mx;
    }
}
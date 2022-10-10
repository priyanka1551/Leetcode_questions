class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int even=-2,odd=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even=even+2;
                res[even]=nums[i];
            }
            else{
                odd=odd+2;
                res[odd]=nums[i];
            }
        }
        return res;
    }
}
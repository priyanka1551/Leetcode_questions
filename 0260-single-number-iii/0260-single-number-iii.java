class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[2];
        for(int i=1;i<nums.length;i+=2){
            if(nums[i]!=nums[i-1]){
                ans[0]=nums[i-1];
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j-=2){
            if(nums[j]!=nums[j-1]){
                ans[1]=nums[j];
                break;
            }
        }
        return ans;
    }
}
class Solution {
    public int maxRotateFunction(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sum1+=i*nums[i];
        }
        for(int j=0;j<nums.length;j++){
            sum1=sum1-sum+(nums.length)*nums[j];                                                             maxi=Math.max(sum1,maxi) ;      
        }
        return maxi;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int prod1=1;
        for(int i=0;i<nums.length;i++){
            prod1=prod1*nums[i];
            ans=Math.max(ans,prod1);
            if(prod1==0){
                prod1=1;
            }
        }
        int prod2=1;
        for(int j=nums.length-1;j>=0;j--){
            prod2=prod2*nums[j];
            ans=Math.max(ans,prod2);
            if(prod2==0){
                prod2=1;
            }
        }
        return ans;
    }
}
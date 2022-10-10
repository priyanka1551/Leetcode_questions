class Solution {
    public int findGCD(int[] nums) {
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minimum){
                minimum=nums[i];
            }
            if(nums[i]>maximum){
                maximum=nums[i];
            }
        }
        if(maximum%minimum==0){
            return minimum;
        }
        int grt=1;
        for(int i=2;i<=maximum;i++){
            if(minimum%i==0 && maximum%i==0){
                grt=Math.max(grt,i);
            }
        }
        return grt;
    }
}
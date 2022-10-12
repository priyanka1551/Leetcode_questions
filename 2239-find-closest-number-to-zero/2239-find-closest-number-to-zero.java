class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int minimum=Integer.MAX_VALUE;
        int[] closest=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            closest[k]=Math.abs(nums[i]);
            k++;
        }
        for(int j=0;j<closest.length;j++){
            if(closest[j]<minimum){
                minimum=closest[j];
            }
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(minimum==closest[i]){
                idx=i;
            }
        }
        return nums[idx];
    }
}
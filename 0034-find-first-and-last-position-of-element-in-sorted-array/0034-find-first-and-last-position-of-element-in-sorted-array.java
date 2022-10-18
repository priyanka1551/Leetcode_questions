class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] out=new int[2];
        int count=0,foundAt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
                out[0]=i;
                foundAt=i;
                break;
            }
        }
        if(count==0){
            return new int[]{-1,-1};
        }
        for(int j=nums.length-1;j>=foundAt;j--){
            if(target==nums[j]){
                out[1]=j;
                break;
            }
        }
        return out;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int result=len;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(i!=nums[i]){
                result=i;
                break;
            }
        }
        return result;
    }
}
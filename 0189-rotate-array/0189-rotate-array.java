class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int[] copyNums=new int[len];
        for(int i=0;i<nums.length;i++){
            int idx=(i+k)%len;
            copyNums[idx]=nums[i];
        }
        for(int j=0;j<len;j++){
            nums[j]=copyNums[j];
        }
    }
}
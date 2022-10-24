class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            res[k]=nums[i];
            k=k+2;
        }
        k=1;
        for(int j=n;j<nums.length;j++){
            res[k]=nums[j];
            k=k+2;
        }
        return res;
    }
}
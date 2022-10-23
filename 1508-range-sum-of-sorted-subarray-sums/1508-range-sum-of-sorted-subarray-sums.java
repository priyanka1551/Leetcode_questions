class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int l=0;
        int[] res=new int[(n*(n+1))/2];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                res[l]=sum;
                l++;
            }
        }
        Arrays.sort(res);
        int reSum=0;
        int mod=(int)Math.pow(10,9)+7;
        for(int m=left-1;m<right;m++){
            reSum=reSum%mod+res[m];
        }
        return reSum;
    }
}
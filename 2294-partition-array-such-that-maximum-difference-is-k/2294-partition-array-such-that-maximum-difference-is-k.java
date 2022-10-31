class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int mini=nums[0];
        int maxi=nums[0];
        int count=1;
        for(int ele:nums){
            mini=Math.min(mini,ele);
            maxi=Math.max(maxi,ele);
            if(maxi-mini>k){
                count++;
                mini=maxi=ele;
            }
        }
        return count;
    }
}
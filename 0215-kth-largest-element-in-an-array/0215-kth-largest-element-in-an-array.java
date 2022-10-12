class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i]; 
            nums[i] = nums[n - i - 1]; 
            nums[n - i - 1] = temp; 
         }
        return nums[k-1];
    }
}
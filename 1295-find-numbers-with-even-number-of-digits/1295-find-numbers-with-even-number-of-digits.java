class Solution {
    public boolean evenDigit(int x){
        int digit=0;
        while(x!=0){
            digit++;
            x=x/10;
        }
        if(digit%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(evenDigit(nums[i])){
                count++;
            }
        }
        return count;
    }
}
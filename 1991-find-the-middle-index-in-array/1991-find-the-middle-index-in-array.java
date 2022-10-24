class Solution {
    public boolean middleIndex(int x,int[] arr){
        int leftSum=0,rightSum=0;
        for(int i=0;i<x;i++){
            leftSum+=arr[i];
        }
        for(int j=x+1;j<arr.length;j++){
            rightSum+=arr[j];
        }
        if(leftSum==rightSum){
            return true;
        }
        return false;
    }
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(middleIndex(i,nums)){
                return i;
            }
        }
        return -1;
    }
}
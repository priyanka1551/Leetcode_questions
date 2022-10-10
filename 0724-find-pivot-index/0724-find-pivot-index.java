class Solution {
    public boolean isPivot(int x,int[] arr){
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
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(isPivot(i,nums)){
                return i;
            }
        }
        return -1;
    }
}
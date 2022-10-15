class Solution {
    public int countFunc(int x,int[] arr,int ky){
        int cnt=0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==ky){
                if(arr[j+1]==x){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public int mostFrequent(int[] nums, int key) {
        int target=0,maximumOcc=Integer.MIN_VALUE,count,res=-1;
        for(int i=0;i<nums.length;i++){
            target=nums[i];
            count=countFunc(target,nums,key);
            if(count>maximumOcc){
                maximumOcc=count;
                res=target;
            }
        }
        return res;
    }
}
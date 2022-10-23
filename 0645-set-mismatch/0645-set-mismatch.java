class Solution {
    public int occurTwice(int[] nums){
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count==2){
                res=nums[i];
                break;
            }
        }
        return res;
    }
    public int missingNum(int[] nums){
        int x=nums.length,res2=0;
        while(x!=0){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==x){
                    count++;
                }
            }
            if(count==0){
                res2=x;
                break;
            }
            x--;
        }
        return res2;
    }
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res=new int[2];
        res[0]=occurTwice(nums);
        res[1]=missingNum(nums);
        return res;
    }
}
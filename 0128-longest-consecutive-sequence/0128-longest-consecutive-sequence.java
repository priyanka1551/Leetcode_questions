class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        ArrayList<Integer> ls=new ArrayList<>();
        Arrays.sort(nums);
        int k=0;
        ls.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(ls.get(k)!=nums[i]){
                ls.add(nums[i]);
                k++;
            }
        }
        int maxi=0,count=0;
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i+1)==ls.get(i)+1){
                count++;
            }
            else{
                count=0;
            }
            maxi=Math.max(count,maxi);
        }
        return maxi+1;
    }
}
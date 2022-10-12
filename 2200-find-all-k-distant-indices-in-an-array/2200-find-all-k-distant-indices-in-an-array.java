class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ls=new ArrayList<>();
        int[] lst=new int[nums.length];
        int j;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                j=i;
                lst[m]=j;
                m++;
            }
        }
        int count;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(j=0;j<m;j++){
                if(Math.abs(i-lst[j])<=k){
                    count++;
                    break;
                }
            }
            if(count>=1){
                ls.add(i);
            }
        }
        return ls;
    }
}
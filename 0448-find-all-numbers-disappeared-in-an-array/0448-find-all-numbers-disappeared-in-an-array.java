class Solution {
    public boolean disappearedArray(int x,int[] arr){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
             int mid=l+(h-l)/2;
             if(arr[mid]==x){
                 return true;
             }
             else if(x>arr[mid]){
                l=mid+1;
             }
             else{
                h=mid-1;
             }
        }
        return false;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
            if(!disappearedArray(i,nums)){
                ls.add(i);
            }
        }
        return ls;
    }
}
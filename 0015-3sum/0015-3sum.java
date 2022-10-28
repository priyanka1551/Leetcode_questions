class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int first=nums[i];
            for(int j=i;j<nums.length;j++){
                if (i == j) continue;
                int second=nums[j];
                int third=0-first-second;
                int thirdIdx=Arrays.binarySearch(nums,third);
                if(thirdIdx>=0 && thirdIdx!=i && thirdIdx!=j){
                    List< Integer> ls=new ArrayList<>();
                    if(third<=first){
                        ls.add(third);
                        ls.add(first);
                        ls.add(second);
                    }
                    else if(third<=second){
                        ls.add(first);
                        ls.add(third);
                        ls.add(second);
                    }
                    else{
                        ls.add(first);
                        ls.add(second);
                        ls.add(third);
                    }
                    set.add(ls);
                }
            }
        }
        return new ArrayList<>(set);
    }
}

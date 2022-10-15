class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        Set<Integer> set1=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }
        ls.add(new ArrayList<>());
		ls.add(new ArrayList<>());
        
        for(int num:set1){
            if(!set2.contains(num)){
                ls.get(0).add(num);
            }
        }
        for(int num:set2){
            if(!set1.contains(num)){
                ls.get(1).add(num);
            }
        }
        return ls;
    }
}

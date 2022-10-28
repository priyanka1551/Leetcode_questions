class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)==1 && !map.containsKey(x-1) && !map.containsKey(x+1)){
                ls.add(x);
            }
        }
        return ls;
    }
}

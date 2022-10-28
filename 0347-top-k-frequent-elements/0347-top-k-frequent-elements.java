class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<nums.length;i++){
          hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int i = 0;
        while (i < k) {
            int max = findMax(hm);
            res[i] = max;
            hm.remove(max);
            i++;
        }
        return res;
    }
    static int findMax(HashMap<Integer, Integer> map) {
        int val = -1;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue()>max) {
                val = key.getKey();
                max = key.getValue();
            }
        }
        return val;
    }
}
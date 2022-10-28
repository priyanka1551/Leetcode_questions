class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        List<String> ls=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(hm.containsKey(str)){
                hm.get(str).add(strs[i]);
            }
            else{
                hm.put(str,new ArrayList<>());
                hm.get(str).add(strs[i]);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
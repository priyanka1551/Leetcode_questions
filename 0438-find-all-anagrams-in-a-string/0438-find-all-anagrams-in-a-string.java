class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        int sLen=s.length();
        int pLen=p.length();
        char[] arrp=p.toCharArray();
        Arrays.sort(arrp);
        String pSort=new String(arrp);
        for(int i=0;i<sLen-pLen+1;i++){
            String str=s.substring(i,i+pLen);
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String strSort=new String(arr);
            if(strSort.equals(pSort)){
                ls.add(i);
            }
        }
        return ls;
    }
}
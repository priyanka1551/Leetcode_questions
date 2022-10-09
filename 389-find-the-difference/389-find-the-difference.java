class Solution {
    public char findTheDifference(String s, String t) {
        int ssum=0,tsum=0;
        for(int i=0;i<t.length();i++){
            tsum+=(int) t.charAt(i);
        }
         for(int j=0;j<s.length();j++){
            ssum+=(int) s.charAt(j);
        }
        return (char) (tsum-ssum);
    }
}
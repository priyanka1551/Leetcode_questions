class Solution {
    public int minSteps(String s, String t) {
        int p=s.length();
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        int count=0;
        int [] diff = new int[26];
        for(int i=0;i<26;i++){
          diff[i]=0;   
        }
        for(int i=0;i<p;i++){
          diff[sArr[i]-'a']++;   
        }
        for(int i=0;i<p;i++){
         diff[tArr[i]-'a']--;
        }
        for(int i=0;i<26;i++){
            count+=Math.abs(diff[i]);
        }
        return count/2;
    }
}
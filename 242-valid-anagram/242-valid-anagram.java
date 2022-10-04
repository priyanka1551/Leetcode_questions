class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count_array=new int [26];
        for(int i=0;i<s.length();i++){
            count_array[s.charAt(i)-'a']++;
            count_array[t.charAt(i)-'a']--;
        }
        for(int element:count_array){
            if(element!=0){
                return false;
            }
        }
        return true;
    }
}
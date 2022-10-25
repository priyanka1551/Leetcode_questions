class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        for(int i=0;i<word1.length;i++){
            str1+=word1[i];
        }
        String str2="";
        for(int j=0;j<word2.length;j++){
            str2+=word2[j];
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int k=0;k<str1.length();k++){
            if(str1.charAt(k)!=str2.charAt(k)){
                return false;
            }
        }
        return true;
    }
}
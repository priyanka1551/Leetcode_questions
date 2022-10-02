class Solution {
    public String longestCommonPrefix(String[] strs) {
        String start=strs[0];
        for(int i=1;i<strs.length;i++){
            start=lcp(start,strs[i]);
        }
        if(start.length()>0){
            return start;
        }
        return "";
    }
    public static String lcp(String string1,String string2){
        int num1=string1.length();
        int num2=string2.length();
        String result="";
        for(int i=0,j=0;i<num1 && j<num2;i++,j++){
            if(string1.charAt(i)!=string2.charAt(j)){
                break;
            }
            result+=string1.charAt(i);
        }
        return result;
    }
}
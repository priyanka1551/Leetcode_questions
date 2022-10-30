class Solution {
    public int findSub(int x,String str){
        String st="";
        while(x<str.length() && !st.contains(Character.toString(str.charAt(x)))){
            st+=Character.toString(str.charAt(x));
            x++;
        }
        return st.length();
    }
    
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        else if(s.length()==1){
            return 1;
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int len=findSub(i,s);
            maxi=Math.max(len,maxi);
        }
        return maxi;
    }
}
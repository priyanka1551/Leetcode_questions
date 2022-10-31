class Solution {
    public boolean isPalindrome(int x,int y,String s){
        while(x<=y){
            if(s.charAt(x)!=s.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(isPalindrome(0,s.length()-1,s)){
            return s;
        }
        int maxi=Integer.MIN_VALUE;
        String res="";
        int len=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                len=j-i+1;
                if(isPalindrome(i,j,s) && len>maxi){
                    maxi=len;
                    res=s.substring(i,i+len);
                }
            }
        }
        return res;
    }
}
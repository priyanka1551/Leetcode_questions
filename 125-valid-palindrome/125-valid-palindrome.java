class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        int length=str.length()-1;
        for(int k=0;k<str.length()/2;k++){
            if(str.charAt(k)!=str.charAt(length-k)){
                return false;
            }
        }
        return true;
    }
}


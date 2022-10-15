class Solution {
    public boolean repeatChar(char ch,int idx,String str){
        for(int i=0;i<str.length();i++){
            if(i==idx){
                continue;
            }
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            if(!repeatChar(s.charAt(i),i,s)){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    StringBuilder res=new StringBuilder();
    public char shift(char c,char x){
        int r1=(int)c;
        int r2=x-'0';
        char ch=(char)(r1+r2); 
        return ch;
    }
    public String replaceDigits(String s) {
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                res.append(s.charAt(i));
            }
            if(i%2!=0){
                res.append(shift(s.charAt(i-1),s.charAt(i)));
            }
        }
        return res.toString();
    }
}
class Solution {
    public int isCount(int n,String num){
        int count=0;
        for(int j=0;j<num.length();j++){
            if(num.charAt(j)-'0'==n){
                count++;
            }
        }
        return count;
    }
    public boolean digitCount(String num) {
        int len=num.length();
        for(int i=0;i<len;i++){
            if(num.charAt(i)-'0'!=isCount(i,num)){
                return false;
            }
        }
        return true;
    }
}
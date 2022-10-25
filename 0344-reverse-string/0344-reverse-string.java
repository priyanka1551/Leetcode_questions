class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int h=s.length-1;
        int mid=l+(h-l+1)/2;
        char temp;
        for(int i=0;i<mid;i++){
            temp=s[i];
            s[i]=s[h-i];
            s[h-i]=temp;
        }
    }
}
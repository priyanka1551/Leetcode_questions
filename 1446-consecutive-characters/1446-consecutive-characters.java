class Solution {
    public int maxPower(String s) {
        if(s.length()==1){
            return 1;
        }
        int mx=Integer.MIN_VALUE;
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            char curr=s.charAt(i);
            if(curr==s.charAt(i+1)){
                count++;
            }
            else{
                count=1;
            }
            mx=Math.max(mx,count);
        }
        return mx;
    }
}
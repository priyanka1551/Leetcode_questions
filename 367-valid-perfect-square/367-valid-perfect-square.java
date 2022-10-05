class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int n=num/2;
        boolean ans=false;
        for(int i=2;i<=n;i++){
            if(i*i==num){
                ans=true;
                break;
            }
        }
       return ans;
    }
}
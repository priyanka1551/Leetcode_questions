class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        if(n<7){
            return false;
        }
        int sum=0,key=0;
        while(n!=0){
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        if(sum==1){
            return true;
        }
        return isHappy(sum);
    }
}
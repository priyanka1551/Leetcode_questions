class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        boolean count;
        if(n==1){
            return true;
        }
        else if(n%2==0){
            n=n/2;
            count=isUgly(n);
        }
         else if(n%3==0){
            n=n/3;
            count=isUgly(n);
        }
         else if(n%5==0){
            n=n/5;
            count=isUgly(n);
        }
        else{
            count=false;
        }
        return count;
    }
}
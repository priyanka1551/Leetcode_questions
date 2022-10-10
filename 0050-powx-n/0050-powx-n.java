class Solution {
    public double myPow(double x, int n) {
        double res;
        if(n==0){
            res=1;
        }
        else{
            res=Math.pow(x,n);
        }
        return res;
    }
}
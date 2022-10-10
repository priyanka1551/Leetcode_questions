class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pdt=1;
        int r;
        while(n!=0){
            r=n%10;
            pdt*=r;
            sum+=r;
            n=n/10;
        }
        return pdt-sum;
    }
}
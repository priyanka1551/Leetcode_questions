class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            int r=n/5;
            count+=r;
            n=n/5;
        }
        return count;
    }
}
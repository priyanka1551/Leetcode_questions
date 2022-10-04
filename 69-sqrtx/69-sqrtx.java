class Solution {
    public int mySqrt(int x) {
        int sq=1;
        while(sq<=x/sq){
            sq++;
        }
        return sq-1;
    }
}
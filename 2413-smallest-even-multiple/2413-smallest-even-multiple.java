class Solution {
    public int lcmFunc(int n){
        if(n%2!=0){
            return 2*n;
        }
        else{
            return n;
        }
    }
    public int smallestEvenMultiple(int n) {
        return lcmFunc(n);
    }
}
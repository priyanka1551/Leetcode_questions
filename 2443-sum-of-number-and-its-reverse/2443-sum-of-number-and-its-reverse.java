class Solution {
    public int reverse(int x){
            if(x<10){
                return x;
            }
            int reverse=0,r;
            while(x!=0){
                r=x%10;
                reverse=reverse*10+r;
                x=x/10;
            }
        return reverse;
    }
    public boolean sumOfNumberAndReverse(int num) {
        int i=num/2;
        while(i<=num){
            if(i+reverse(i)==num){
                return true;
            }
            i++;
        }
        return false;
    }
}
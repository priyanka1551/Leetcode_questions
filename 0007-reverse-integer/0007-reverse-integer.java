class Solution {
    public int reverse(int x) {
        long res=0;
        int r;
        while(x!=0){
            r=x%10;
            x=x/10;
            res=res*10+r;
        }
        if(res>2147483647 || res<-2147483648){
            return 0;
        }
        int ans=(int)res;
        return ans;
    }
}

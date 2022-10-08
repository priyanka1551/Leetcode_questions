class Solution {

    public int bitwiseComplement(int n) {
        if(n==0) return 1;
      int i=0,ans=0;
        while(n!=0){
            int r = n%2;
            r = (r+1)%2; 
            ans += r* Math.pow(2,i); 
            i++;
            n /= 2;
        }
        return ans;
    }
}
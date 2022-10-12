class Solution {
    public boolean townJudge(int x,int[][] arr,int t){
        int count=0,i,chanceTrust=0;
        for(i=0;i<arr.length;i++){
            if(arr[i][0]==x ){
                return false;
            }
            chanceTrust=x;
        }
        for(int m=0;m<arr.length;m++){
            if(arr[m][1]==chanceTrust){
                count++;
            }
        }
        if(count!=t-1){
            return false;
        }
        return true;
    }
    public int findJudge(int n, int[][] trust) {
        int res=0;
        for(int i=1;i<=n;i++){
            if(townJudge(i,trust,n)){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public boolean luckyNumber(int x,int[] array){
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(x==array[i]){
                cnt++;
            }
        }
        if(x==cnt){
            return true;
        }
        return false;
    }
    public int findLucky(int[] arr) {
        int maxi=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(luckyNumber(arr[i],arr)){
                count++;
                maxi=Math.max(maxi,arr[i]);
            }
        }
        if(count==0){
            return -1;
        }
         return maxi;
    }
}
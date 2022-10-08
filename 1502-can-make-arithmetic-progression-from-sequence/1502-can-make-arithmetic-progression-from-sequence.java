class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int diff,j;
        Arrays.sort(arr);
        diff=arr[1]-arr[0];
        int count=1;
        for(int i=1;i<arr.length-1;i++){
            j=i+1;
            if((arr[j]-arr[i])==diff){
                count++;
            }
        }if(count==arr.length-1){
            return true;
        }
        return false;
    }
}
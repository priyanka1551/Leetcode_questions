class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id,end,start=0,returnedid=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<logs.length;i++){
            id=logs[i][0];
            end=logs[i][1];
            if(Math.abs(start-end)>maximum){
                maximum=Math.abs(start-end);
                returnedid=id;
            }
            else if(Math.abs(start-end)==maximum){
                 returnedid=Math.min(returnedid,id);
            }
            start=end;
        }
        return returnedid;
    }
}
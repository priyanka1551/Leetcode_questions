class Solution {
    public int afterDis(int x,int[] arry){
        int price=arry[x];
        for(int j=x+1;j<arry.length;j++){
             if(arry[j]<=arry[x]){
                    price=arry[x]-arry[j];
                    break;
             }
        }
        return price;
    }
    public int[] finalPrices(int[] prices) {
        int[] res=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            res[i]=afterDis(i,prices);
        }
        return res;
    }
}
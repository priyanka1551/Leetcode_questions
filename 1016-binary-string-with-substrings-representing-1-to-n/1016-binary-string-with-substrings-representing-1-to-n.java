class Solution {
    public String covertToBinary(int x){
        String binRep="";
        StringBuilder str=new StringBuilder();
        int r;
        int n=x;
         while(n!=0){
            r=n%2;
            str.append(r);
            n=n/2;
        }
        binRep=str.reverse().toString();
        return binRep;
    }
    public boolean queryString(String s, int n) {
        String str="";
        for(int i=1;i<=n;i++){
           str=covertToBinary(i);
           if(!s.contains(str)){
              return false;
           }
        }
        return true;
    }
}
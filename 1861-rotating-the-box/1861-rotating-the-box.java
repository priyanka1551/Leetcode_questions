class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int rLen=box.length;
        int cLen=box[0].length;
        char[][] res=new char[cLen][rLen];
        int m=rLen-1;
        for(int i=0;i<rLen;i++){
            for(int j=0;j<cLen;j++){
                res[j][m]=box[i][j];
            }
            m--;
        }
        int j=0;
        while(j<res[0].length){
            for(int i=0;i<res.length-1;i++){
                if(res[i][j]=='#' && res[i+1][j]=='.'){
                    int k=i+1;
                    while(k>0 && res[k-1][j]=='#'){
                        res[k][j]='#';
                        res[k-1][j]='.';
                        k--;
                    }
                }
            }
            j++;
        }
        return res;
    }
}
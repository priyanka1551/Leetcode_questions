class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][]res=new int[k][2];
        double[] d=new double[points.length];
        for(int i=0;i<points.length;i++){
            d[i]=Math.sqrt(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
        }
        double temp1;
        int temp2,temp3;
        for(int i=0;i<d.length-1;i++){
            for(int j=0;j<d.length-i-1;j++){
              if(d[j+1]<d[j]){
                temp1=d[j+1];
                temp2=points[j+1][0];
                temp3=points[j+1][1];
                d[j+1]=d[j];
                points[j+1][0]=points[j][0];
                points[j+1][1]=points[j][1];
                d[j]=temp1;
                points[j][0]=temp2;
                points[j][1]=temp3;
              }
            }
        }
        for(int l=0;l<k;l++){
            res[l][0]=points[l][0];
            res[l][1]=points[l][1];
        }
        return res;
    }
}
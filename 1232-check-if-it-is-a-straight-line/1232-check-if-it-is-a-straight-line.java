class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int y2=coordinates[1][1],y1=coordinates[0][1];
        int x2=coordinates[1][0],x1=coordinates[0][0];
        for(int i=2;i<coordinates.length;i++){
            int x3=coordinates[i][0];
            int y3=coordinates[i][1];
            if((y2-y1)*(x3-x2) != (y3-y2)*(x2-x1)){
                  return false;
            }
        }
        return true;
    }
}
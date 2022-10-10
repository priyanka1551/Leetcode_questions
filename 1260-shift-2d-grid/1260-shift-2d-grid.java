class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int temp,temp1;
        int m=grid.length;
        int n=grid[0].length;
        int[][] ls=grid;
        while(k>0){
            ls=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=1;j<n;j++){
                    ls[i][j]=grid[i][j-1];
                }
            }
             for(int i=1;i<m;i++){  
                ls[i][0]=grid[i-1][n-1];
            }
            ls[0][0]=grid[m-1][n-1];
            k--;
            grid=ls;
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : ls) {
             List<Integer> list = new ArrayList<>();
             for (int i : ints) {
                 list.add(i);
             }
             lists.add(list);
         }
        return lists;
    }
}



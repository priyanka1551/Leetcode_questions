// class Solution {
//     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//         int temp,temp1;
//         int m=grid.length;
//         int n=grid[0].length;
//         int[][] ls=new int[m][n];
//         while(k>0){
//             class Solution {
//     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//         int n = grid.length, m = grid[0].length;
//         int[][] temp = grid;
//             for(int i=0;i<m;i++){
//                 for(int j=1;j<n;j++){
//                     ls[i][j]=grid[i][j-1];
//                 }
//             }
//              for(int i=1;i<m;i++){  
//                 ls[i][0]=grid[i-1][n-1];
//             }
//             grid[0][0]=ls[m-1][n-1];
//             k--;
//         }
//         List<List<Integer>> lists = new ArrayList<>();
//         for (int[] ints : ls) {
//              List<Integer> list = new ArrayList<>();
//              for (int i : ints) {
//                  list.add(i);
//              }
//              lists.add(list);
//          }
//         return lists;
//     }
// }

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int[][] temp = grid;
        
        while (k-- > 0) {
            // init for each loop
            temp = new int[n][m];
            
            // 1. shift right
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    temp[i][j] = grid[i][j - 1];
                }
            }
            
            // 2. move last one in this row to the next row
            for (int i = 1; i < n; i++) {
                temp[i][0] = grid[i - 1][m - 1];
            }
            
            // 3. move the last one to the first place
            temp[0][0] = grid[n - 1][m - 1];
            
            // repeat
            grid = temp;
        }
        
        return (List)Arrays.asList(temp);
    }
}


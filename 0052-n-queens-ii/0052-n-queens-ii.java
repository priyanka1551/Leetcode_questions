class Solution {
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upperleft
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //upper right
        r=row;
        for(int c=col;c>=0 &&r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower right
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void saveBoard(char[][] board,List<List<String>> ls){
        String row="";
        List<String> newls=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newls.add(row);
        }
        ls.add(newls);
    }
    
    public void helper(char[][] board,List<List<String>> ls,int col){
        if(col==board.length){
            saveBoard(board,ls);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,ls,col+1);
                board[row][col]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ls=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board,ls,0);
        return ls.size();
    }
}
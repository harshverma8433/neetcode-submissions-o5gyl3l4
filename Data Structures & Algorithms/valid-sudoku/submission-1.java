class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            ArrayList<Character> list = new ArrayList<>();
            for(int j=0;j<9;j++){
                if(board[row][j] == '.'){
                    continue;
                }else if(list.contains(board[row][j])){
                    return false;
                }else{
                    list.add(board[row][j]);
                }
            }
        }

        for(int col=0;col<9;col++){
            ArrayList<Character> list = new ArrayList<>();
            for(int j=0;j<9;j++){
                if(board[j][col] == '.'){
                    continue;
                }else if(list.contains(board[j][col])){
                    return false;
                }else{
                    list.add(board[j][col]);
                }
            }
        }

        for(int k=0;k<9;k++){
            ArrayList<Character> list = new ArrayList<>();

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int r = (k/3)*3+i;
                    int c = (k%3)*3+j;
                    if(board[r][c] == '.'){
                    continue;
                }else if(list.contains(board[r][c])){
                    return false;
                }else{
                    list.add(board[r][c]);
                }
                }
            }


        }

return true;
    }
}

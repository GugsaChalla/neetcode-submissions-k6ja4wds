class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checks next box to the right
        for(int i=0;i<9;i=i+3){
            //checks next box below
            for(int j=0;j<9;j=j+3){
                HashSet<Character> box = new HashSet<>();
                //checks a box
                for(int k=i;k<3;k++){
                    for(int l=j;l<3;l++){
                        if(box.contains(board[k][l])) return false;
                        if(board[k][l] == '.') continue;
                        box.add(board[k][l]);
                    }
                }
            }
        }

        //column
        for(int i=0;i<board.length;i++){
            HashSet<Character> column = new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(column.contains(board[i][j])) return false;
                if(board[i][j] == '.') continue;  
                column.add(board[i][j]);             
            }
        }

                //row
        for(int i=0;i<board.length;i++){
            HashSet<Character> row = new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(row.contains(board[j][i])) return false;
                if(board[j][i] == '.') continue;  
                row.add(board[j][i]);             
            }
        }
        return true;
    }
}

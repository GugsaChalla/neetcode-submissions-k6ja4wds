class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>(); 
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){continue;}
                String boxNum = i/3+","+j/3;
                String rowNum = i + "";
                String colNum = j + "";
                rows.putIfAbsent(rowNum,new HashSet<>());
                cols.putIfAbsent(colNum,new HashSet<>());
                squares.putIfAbsent(boxNum,new HashSet<>());
                if(rows.get(rowNum).contains(board[i][j])|| cols.get(colNum).contains(board[i][j]) ||squares.get(boxNum).contains(board[i][j])){
                    return false;    
                }
                
                rows.get(rowNum).add(board[i][j]);
                
                cols.get(colNum).add(board[i][j]);
                
                squares.get(boxNum).add(board[i][j]);
            
            }
        }
        
        return true;
    }
}
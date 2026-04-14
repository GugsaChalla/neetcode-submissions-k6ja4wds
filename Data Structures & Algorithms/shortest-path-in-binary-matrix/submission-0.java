class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        if(grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;
        int count =1;
        Queue<int[]> queue = new LinkedList<>();
        int[][] dir = new int[][]{
            {0,1},{0,-1},{1,0},{-1,0},
            {1,1},{-1,1},{1,-1},{-1,-1}
        };
        int[] dest = new int[]{m-1,n-1};

        queue.add(new int[]{0,0});
        //BFS
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++) {
                int[] curr = queue.remove();
                if(dest[0] == curr[0] && dest[1] == curr[1]) return count;
                //mark as visited
                grid[curr[0]][curr[1]] = 1;
                for(int[] direction: dir) {
                    int row = curr[0]+direction[0];
                    int col = curr[1]+direction[1];
                    //Out of Bounds
                    if(row < 0|| row == m || col < 0 || col == n) continue;
                    //Blocked
                    if(grid[row][col] == 1) continue;
                    queue.add(new int[]{row,col});
                }
            }
            count++;
        }
        


        return -1;
    }
}
/**


[1,0,0],
[1,1,0],
[1,1,0]]
Clarify
only 1s and 0s?
max/min size of array

Testcases

Approach
BFS
add start coordinates to queue
while queue is not empty
    for the size of the queue
        remove element
        mark element as visited
        add 8 directionally adjacent coordinates that are NOT 1
    add to count

return count;

T/C: O(M*N)  where m is rows and n is cols
S/C: O(M*N) where m is rows and n is cols

 */
// Link : https://leetcode.com/problems/number-of-islands/description/
// Last practice on : 5-Feb-2024

class Solution {
    //Approach 2: DFS
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int numIslands = 0;
        for(int r =0;r<nr;r++){
            for(int c =0;c<nc;c++){
                if(grid[r][c] == '1'){
                    numIslands++;
                    dfs(grid,r,c);
                }
            }
        }
        return numIslands;
    }
    void dfs(char[][] grid, int r, int c){
        int nr = grid.length;
        int nc = grid[0].length;
        if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c] == '0') return;
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    //TC - O(m * n)
    //SC - O(m * n)



    /*
    // Approach 1: BFS
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    grid[r][c] = '0'; // mark as visited
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(r * nc + c);
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            neighbors.add((row - 1) * nc + col);
                            grid[row - 1][col] = '0';
                        }
                        if (row + 1 < nr && grid[row + 1][col] == '1') {
                            neighbors.add((row + 1) * nc + col);
                            grid[row + 1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            neighbors.add(row * nc + col - 1);
                            grid[row][col - 1] = '0';
                        }
                        if (col + 1 < nc && grid[row][col + 1] == '1') {
                            neighbors.add(row * nc + col + 1);
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }
        }

        return num_islands;
    }
    // TC - O(m * n), m = number of rows and n = number of cols
    // SC - O(min(m,n)), because in worst case where the
grid is filled with lands, the size of queue can grow up to min(M,N).
    */
}

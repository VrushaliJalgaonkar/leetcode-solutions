// Link : https://leetcode.com/problems/walls-and-gates/description/
// Last Practice on : 29-Jan-2024

class Solution {
    static final int EMPTY = Integer.MAX_VALUE;
    static final int GATE = 0;
    static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] {1, 0},
        new int[] {-1, 0},
        new int[] {0, 1},
        new int[] {0, -1}
    );
    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        if (m == 0) return;
        int n = rooms[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j<n;j++){
                if(rooms[i][j] == GATE){
                    q.add(new int[] {i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] point = q.poll();
            int row = point[0];
            int col = point[1];
            for(int[] direction : DIRECTIONS){
                int r = row + direction[0];
                int c = col + direction[1];
                if(r < 0 || r >= m || c < 0 || c >= n || rooms[r][c] != EMPTY){
                    continue;
                }
                rooms[r][c] = rooms[row][col] + 1;
                q.add(new int[] {r,c});
            }
        }        
    }
    //TC = O(m * n)
    //SC - O(m * n)
}

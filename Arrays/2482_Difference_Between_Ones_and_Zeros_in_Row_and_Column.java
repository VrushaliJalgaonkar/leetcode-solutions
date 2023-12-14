class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] oneRow = new int[m];
        int[] oneCol = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                oneRow[i] +=grid[i][j];
                oneCol[j] += grid[i][j];
            }
        }
        int[][] diff = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j] = 2 * oneRow[i] + 2 * oneCol[j] - n - m;
            }
        }
        return diff;
    }
}
//TC - O(m * n)
//SC - O(m + n)

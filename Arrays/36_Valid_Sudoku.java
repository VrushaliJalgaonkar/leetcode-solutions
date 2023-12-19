class Solution {
   // Approach-2: Using array of fixed length
    public boolean isValidSudoku(char[][] board) {
        int N =9;
        int[][] rows = new int[N][N];
        int[][] cols = new int[N][N];
        int[][] boxes = new int[N][N];
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                if(board[r][c] == '.') continue;
                int pos = board[r][c] - '1';
                if(rows[r][pos] == 1) return false;
                rows[r][pos] = 1;
                if(cols[c][pos] == 1) return false;
                cols[c][pos] = 1;
                int index = r/3 * 3 + c/3;
                if(boxes[index][pos] == 1) return false;
                boxes[index][pos] = 1;
            }
        }
        return true;
    }
    //TC - O(N^2), SC - O(N^2)


    /**
    Approach -1 : Using HashSet
        public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
        for(int r=0;r<N;r++){
            rows[r] = new HashSet<>();
            cols[r] = new HashSet<>();
            boxes[r] = new HashSet<>();
        }
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                char val = board[r][c];
                if(val == '.'){
                    continue;
                }
                if(rows[r].contains(val)) return false;
                rows[r].add(val);
                if(cols[c].contains(val)) return false;
                cols[c].add(val);
                int index = r/3 * 3 + c/3;
                if(boxes[index].contains(val)) return false;
                boxes[index].add(val);
            }
        }
        return true;
    }
    //TC - O(N^2), SC - O(N^2)
     */
}

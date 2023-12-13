class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int counter = 0;
        int[] expectedHeights = new int[n];
        for(int i=0;i<n;i++){
            expectedHeights[i] = heights[i];
        }
        Arrays.sort(expectedHeights);
        for(int i=0;i<n;i++){
            if(Math.abs(expectedHeights[i] - heights[i]) != 0)
                counter++;
        }
        return counter;
    }
}
//TC - O(n) and SC - O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n-1;
        int[] res = new int[n];
        for(int k = n-1; k >=0; k--){
            int square;
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                square = nums[j];
                j--;
            } else {
                square = nums[i];
                i++;
            }
            res[k] = square * square;
        }
        return res;
    }
}
// TC - O(n) and SC - O(n)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0, numZeros = 0, longestSeq = 0;
        while(j < nums.length){
            if(nums[j] == 0)
                numZeros++;
            while(numZeros == 2){
                if(nums[i] == 0)
                    numZeros--;
                i++;
            }
            longestSeq = Math.max(longestSeq, j-i+1);
            j++;
        }
        return longestSeq;
    }
}
// Sliding window approach
//TC - O(n) and SC - O(1)

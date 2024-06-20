// Link : https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
// Last Practice on : 5-Jan-2024

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int currMax = 1, max = 1;
        for(int i=1; i< nums.length;i++){
            if(nums[i] > nums[i-1]){
                currMax++;
                max = Math.max(max, currMax);
            } else{
                currMax = 1;
            }
        }
        return max;
    }
}
//TC - O(n), n = length of nums because we need to perform one loop through nums
//SC - O(1)

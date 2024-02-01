// Link : https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/
// Last practice on : 1-Feb-2024

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length/3][3];
        for(int i=0;i<nums.length;i+=3){
            if(nums[i+2] - nums[i] > k){
                return new int[0][0];
            }
            ans[i/3] = new int[]{nums[i], nums[i+1], nums[i+2]};
        }
        return ans;
    }
}
//TC - O(n log n), because of sorting
//SC - O(log n), as sorting in java takes O(log n) space

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for(int n : nums){
            sum = sum + n;
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum == (sum - nums[i] - leftSum))
                return i;
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
// TC - O(n) and SC - O(1)

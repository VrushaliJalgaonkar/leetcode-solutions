class Solution {
    public void moveZeroes(int[] nums) {
        for(int lastZeroFoundAt = 0, curr = 0; curr < nums.length;curr++){
            if(nums[curr] != 0){
                int temp = nums[lastZeroFoundAt];
                nums[lastZeroFoundAt] = nums[curr];
                nums[curr] = temp;
                lastZeroFoundAt++;
            } 
        }
    }
}
//TC - O(n) and SC - O(1)

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int evenPos = 0, curr = 0; curr < nums.length; curr++){
            if(nums[curr] % 2 == 0){
                int temp = nums[evenPos];
                nums[evenPos] = nums[curr];
                nums[curr] = temp;
                evenPos++;
            }
        }
        return nums;
    }
}
//TC - O(n) and SC - O(1)

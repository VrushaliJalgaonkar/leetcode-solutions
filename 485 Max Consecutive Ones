485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,cnt =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                cnt++;
            } else if(nums[i] == 0){
                max = Math.max(cnt,max);
                cnt = 0;
            }
        }
        return Math.max(cnt,max);
    }
}
//TC - O(n)
//SC - O(1)

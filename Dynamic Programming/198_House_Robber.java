//Link : https://leetcode.com/problems/house-robber/
//Last Practice on : 21-Jan-2024

class Solution {
    //Approach 3: Optimized DP
    public int rob(int[] nums) {
        int N = nums.length;
        if(N == 0) return 0;
        int robNext, robNextPlusOne;
        robNextPlusOne = 0;
        robNext = nums[N-1];
        for(int i = N - 2; i >= 0; i--){
            int current = Math.max(robNext, robNextPlusOne + nums[i]);
            robNextPlusOne = robNext;
            robNext = current;
        }
        return robNext;
    }
    //TC - O(n), SC - O(1)


    /*
        //Approach 2: Dynamic Programming
        public int rob(int[] nums) {
            int N = nums.length;
            if(N == 0) return 0;
            int[] maxRobbedAmount = new int[N + 1];
            maxRobbedAmount[N] = 0;
            maxRobbedAmount[N-1] = nums[N-1];
            for(int i = N - 2; i >= 0; i--){
                maxRobbedAmount[i] = Math.max(maxRobbedAmount[i+1], maxRobbedAmount[i+2] + nums[i]);
            }
            return maxRobbedAmount[0];
        }
        //TC - O(n), SC - O(n)
    */


  
    /*
        //Approach 1: Recursion with Memoization
        private int[] memo;
        public int rob(int[] nums) {
            this.memo = new int[100];
            Arrays.fill(this.memo, -1);
            return this.robFrom(0, nums);
        }

        private int robFrom(int pos, int[] nums){
            if(pos >= nums.length) return 0;
            if(this.memo[pos] > -1) return this.memo[pos];
            int ans = Math.max(robFrom(pos + 1, nums), robFrom(pos + 2, nums) + nums[pos]);
            this.memo[pos]  = ans;
            return ans;
        }
        //TC - O(n), SC - O(n)
    */
}

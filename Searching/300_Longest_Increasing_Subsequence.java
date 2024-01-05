// Link : https://leetcode.com/problems/longest-increasing-subsequence/
// Last Practice on : 5-Jan-2024

class Solution {
    private int binarySearch(ArrayList<Integer> sub, int num){
        int left = 0;
        int right = sub.size() - 1;
        int mid = (left + right) / 2;
        while(left < right){
            mid = (left + right) / 2;
            if(sub.get(mid) == num){
                return mid;
            }

            if(sub.get(mid) < num){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public int lengthOfLIS(int[] nums) {

        //Approach-3: Binary search
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        for(int i = 1; i< nums.length;i++){
            int num = nums[i];
            if(num > sub.get(sub.size() - 1)){
                sub.add(num);
            } else {
                int j = binarySearch(sub, num);
                sub.set(j, num);
            }
        }
        return sub.size();

        //TC - O(n log n), binary search uses O(log n) time complexity as opposed to linear search [uses O(n) time complexity]
        //SC - O(n), because used sub arraylist which may grow to n elements


        /*
            //Approach - 2: Intelligently Build a Subsequence
            ArrayList<Integer> sub = new ArrayList<>();
            sub.add(nums[0]);
            for(int i = 1; i< nums.length;i++){
                int num = nums[i];
                if(num > sub.get(sub.size() - 1)){
                    sub.add(num);
                } else {
                    int j =0;
                    while(num > sub.get(j)){
                        j++;
                    }
                    sub.set(j, num);
                }

            }
            return sub.size();
            
            //TC - O(n^2). here liner search is used. which adds O(n) time complexity
            //SC - O(n)
        */

        



        /*
            //Approach-1: DP
            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);
            for(int i=1; i<nums.length; i++){
                for(int j = 0; j< i; j++){
                    if(nums[i] > nums[j]){
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            int longest = 0;
            for(int d : dp){
                longest = Math.max(longest, d);
            }
            return longest;

            //TC - O(n^2), where n = nums length and used two nested loops
            //SC - O(n), because used dp array of size n
        */
        
    }

}

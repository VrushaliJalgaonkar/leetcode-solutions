// Link : https://leetcode.com/problems/climbing-stairs/
// Last Practice on : 18-Jan-2024

class Solution {
    
    //Approach-4 : Fibonacci number
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int first = 1;
        int second = 2;
        for(int i =3; i<= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    //TC - O(n), SC - O(1)



    /*
    //Approach-3 : DP
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        //TC - O(n), SC - O(n)
    }
    */
    


    /*
    //Approach-2 : Recursion with memoization
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        return helper(0, n, memo);
    }
    public int helper(int i, int n, int[] memo){
        if(i > n) return 0;
        if(i == n) return 1;
        if(memo[i] > 0) return memo[i];
        memo[i] = helper(i+1, n, memo) + helper(i+2, n, memo);
        return memo[i];
    }
    //TC - O(n), SC - O(n)
    */



    /*
    //Approach-1 : Brute force
    public int climbStairs(int n) {
        return helper(0, n);
    }
    public int helper(int i, int n){
        if(i > n) return 0;
        if(i == n) return 1;
        return helper(i+1, n) + helper(i+2, n);
    }
    //TC - O(2^n), SC - O(n)
    */
}

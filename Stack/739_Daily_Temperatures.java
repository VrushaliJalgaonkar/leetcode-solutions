//Link : https://leetcode.com/problems/daily-temperatures/
//Last Practice on : 31-Jan-2024

class Solution {
    // Approach-1 : Monotonic stack
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int currDay = 0; currDay < n; currDay++) {
            int currTemp = temperatures[currDay];
            while (!st.isEmpty() && temperatures[st.peek()] < currTemp) {
                int prevDay = st.pop();
                ans[prevDay] = currDay - prevDay;
            }
            st.push(currDay);
        }
        return ans;
    }
    // TC - O(n), SC - O(n)
}

class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        Map<Integer,Integer> counter = new HashMap<>();
        for(int n : nums){
            counter.put(n, counter.getOrDefault(n,0) + 1);
        }
        for(int c : counter.values()){
            if(c == 1){
                return -1;
            } else {
                ans += Math.ceil((double)c/3);
            }
        }
        return ans;
    }
}
//TC - O(n), where n = number of elements in nums
//SC - O(n), in worst scenario, the map (counter) will have at most n elements stored

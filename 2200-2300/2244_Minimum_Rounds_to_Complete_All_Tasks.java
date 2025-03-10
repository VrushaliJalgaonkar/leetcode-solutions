class Solution {
    public int minimumRounds(int[] tasks) {
        int ans = 0;
        Map<Integer,Integer> counter = new HashMap<>();
        for(int t : tasks){
            counter.put(t, counter.getOrDefault(t, 0) + 1);
        }
        for(int c : counter.values()){
            if(c == 1){
                return -1;
            } else {
                ans += Math.ceil((double) c/3);
            }
        }
        return ans;
    }
}
//TC - O(n), n = number of elements in tasks
//SC - O(n), in worst case, we need to store n intgers frequency into map (counter)

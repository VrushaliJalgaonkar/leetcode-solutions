//Link : https://leetcode.com/problems/set-mismatch/
//Last practice on : 22-Jan-2024

class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dup = -1, missing = -1;
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(int i = 1; i<= nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    dup = i;
                }
            } else{
                missing = i;
            }
        }
        return new int[] {dup, missing};
    }
}
//TC - O(n), SC - O(n)

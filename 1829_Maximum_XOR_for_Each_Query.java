// Link : https://leetcode.com/problems/maximum-xor-for-each-query/?envType=daily-question&envId=2024-11-08
// Last Practice on : 8-Nov-2024


class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        //Approach 2: Optimized Calculation + Bit Masking
        int xorProduct = 0;
        for(int i=0;i<nums.length;i++){
            xorProduct = xorProduct ^ nums[i];
        }
        int mask = (1 << maximumBit) - 1;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = xorProduct ^ mask;
            xorProduct = xorProduct ^ nums[nums.length - 1 - i];
        }
        return ans;

        //TC - O(n)
        //SC - O(1)




        //Approach 1: Prefix Array + Bit Masking
        /*
        int[] prefixXOR = new int[nums.length];
        prefixXOR[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixXOR[i] = prefixXOR[i-1] ^ nums[i];
        }
        int mask = (1 << maximumBit) - 1;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int currentXOR = prefixXOR[prefixXOR.length - 1 - i];
            ans[i] = currentXOR ^ mask;
        }
        return ans;

        TC - O(n)
        SC - O(n), because prefix array is used.
        */
    }
}

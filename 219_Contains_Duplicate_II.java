class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                System.out.println("Value = "+nums[i - k]);
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
//TC - O(n)
//SC - O(min(n,k))

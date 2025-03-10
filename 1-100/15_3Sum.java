class Solution {
    //Approach - No sort
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
    //TC - O(n^2), SC - O(n)

    /**
        //Approach - Using HashSet

        public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length && nums[i] <= 0;i++){
            if(i == 0 || nums[i-1] != nums[i]){
                twoSum(nums,i,result);
            }
        }
        return result;
    }
    void twoSum(int[] nums, int i, List<List<Integer>> result){
        Set<Integer> seen = new HashSet<>();
        for(int j= i+1;j<nums.length;j++){
            int complement = -nums[i] - nums[j];
            if(seen.contains(complement)){
                result.add(Arrays.asList(nums[i], nums[j], complement));
                while(j+1 < nums.length && nums[j] == nums[j+1]){
                    j++;
                }
            }
            seen.add(nums[j]);
        }
    }
    //TC - O(n^2), SC - O(n)
     */




    /**
        //Approach - Two pointer
        public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length && nums[i] <= 0;i++){
            if(i == 0 || nums[i-1] != nums[i]){
                twoSumII(nums,i,result);
            }
        }
        return result;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> result){
        int low = i+1, high = nums.length-1;
        while(low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if(sum < 0){
                low++;
            } else if(sum > 0){
                high--;
            } else {
                result.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                while(low < high && nums[low] == nums[low-1]){
                    low++;
                }
            }
        }
    }
    //TC - O(n^2), SC - O(logn) to O(n)
     */
}

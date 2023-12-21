class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //Approach-2 : HashSet
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }

    public List<List<Integer>> kSum(int[] nums, long target, int start, int k){
        List<List<Integer>> res = new ArrayList<>();
        if(start == nums.length){
            return res;
        }
        long averageVal = target/k;
        if(nums[start] > averageVal || nums[nums.length - 1] < averageVal){
            return res;
        }
        if(k == 2){
            return twoSum(nums,target,start);
        }
        for (int i = start; i < nums.length; ++i) {
            if (i == start || nums[i - 1] != nums[i]) {
                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    res.get(res.size() - 1).addAll(subset);
                }
            }
        }
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Long> s = new HashSet<>();
    
        for (int i = start; i < nums.length; ++i) {
            if (res.isEmpty() || res.get(res.size() - 1).get(1) != nums[i]) {
                if (s.contains(target - nums[i])) {
                    res.add(Arrays.asList((int)target - nums[i], nums[i]));
                }
            }
            s.add((long)nums[i]);
        }
                                                  
        return res;
    }
}

//TC - For kSum = O(n ^ (k-1)) and For 4Sum = O(n ^ 3). We have k−2k - 2k−2 loops, and twoSum is O(n).
//SC - O(n)


    /**
        public List<List<Integer>> fourSum(int[] nums, int target) {
        //Approach-1 : Two pointers
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }

    public List<List<Integer>> kSum(int[] nums, long target, int start, int k){
        List<List<Integer>> res = new ArrayList<>();
        if(start == nums.length){
            return res;
        }
        long averageVal = target/k;
        if(nums[start] > averageVal || nums[nums.length - 1] < averageVal){
            return res;
        }
        if(k == 2){
            return twoSum(nums,target,start);
        }
        for (int i = start; i < nums.length; ++i) {
            if (i == start || nums[i - 1] != nums[i]) {
                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    res.get(res.size() - 1).addAll(subset);
                }
            }
        }
    
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, long target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        int lo = start, hi = nums.length - 1;
    
        while (lo < hi) {
            int currSum = nums[lo] + nums[hi];
            if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
                ++lo;
            } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[lo++], nums[hi--]));
            }
        }
                                                          
        return res;
}

//TC - For kSum = O(n ^ (k-1)) and For 4Sum = O(n ^ 3). We have k−2k - 2k−2 loops, and twoSum is O(n).
//SC - O(n)
     */

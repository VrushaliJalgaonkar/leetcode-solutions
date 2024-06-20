class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1] = Math.abs(nums[Math.abs(nums[i])-1]) * (-1);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1] > 0){
                res.add(i);
            }
        }
        return res;
    }
}
//TC - O(n) and SC - O(1)

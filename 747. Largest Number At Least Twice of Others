class Solution {
    public int dominantIndex(int[] nums) {
        int greatest=Integer.MIN_VALUE, secGreatest=Integer.MIN_VALUE, mIndex=-1;
				for(int i=0; i<nums.length; i++)
					if(nums[i] > greatest) {
						secGreatest = greatest;
						greatest = nums[i];
						mIndex=i;
					}
					else if(nums[i]>secGreatest & nums[i]<greatest){
							secGreatest=nums[i];
					}
				return greatest>=(secGreatest*2) ? mIndex : -1;	
    }
}
// TC - O(n) and SC - O(1)

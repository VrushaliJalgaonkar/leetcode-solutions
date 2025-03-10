class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> m = new HashMap<>();
        for(int n : nums1){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int k =0;
        for(int n2 : nums2){
            int count = m.getOrDefault(n2,0);
            if(count > 0){
                nums1[k++] = n2;
                m.put(n2,count-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
//TC - O(n + m)
//SC - O(min(n,m))

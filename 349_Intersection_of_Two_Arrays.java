class Solution {
    //Approach 2: Built-in Set Intersection
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int n1 : nums1){
            set1.add(n1);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int n2 : nums2){
            set2.add(n2);
        }
        set1.retainAll(set2);
        int[] output = new int[set1.size()];
        int index =0;
        for(int s : set1){
            output[index++] = s;
        }
        return output;
    }
    //TC - O(n + m), SC - O(n + m)

    /**
    Aprroach - 1 : Using two sets
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        int i =0;
        for(int n1 : nums1){
            set1.add(n1);
        }

        for(int n2 : nums2){
            if(set1.contains(n2)){
                set2.add(n2);
            }
        }

        int[] res = new int[set2.size()];

        for(int e : set2){
            res[i] = e;
            i++;
        }

        return res;
    }
    //TC - O(m+n), SC - O(m + n)
     */
}

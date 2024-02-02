//Link :https://leetcode.com/problems/sequential-digits/description/
//Last practice on : 2-Feb-2024

class Seq{
    public List<Integer> nums = new ArrayList<>();
    Seq(){
        String sample = "123456789";
        int n = 10;
        for(int len = 2; len < n; ++len){
            for(int start = 0;start< n-len;start++){
                int num = Integer.parseInt(sample.substring(start,start+len));
                nums.add(num);
            }
        }
    }
}

class Solution {
    public static Seq seq = new Seq();

    // Approach 2: Precomputation
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for(int num : seq.nums){
            if(num >= low && num<=high){
                res.add(num);
            }
        }
        return res;
    }
    // TC - O(1), sample string len = 9, low and high length is in between 2 and 9.
    // Nested loop tc is (8 * 8) = 64 times.
    // SC - O(1)

    /*
    // Approach 1: Sliding Window
    public List<Integer> sequentialDigits(int low, int high) {
        String sample = "123456789";
        int n = 10;
        List<Integer> nums = new ArrayList<>();
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();
        for (int len = lowLen; len <= highLen; len++) {
            for (int start = 0; start < n - len; start++) {
                int num = Integer.parseInt(sample.substring(start, start + len));
                if (num >= low && num <= high) {
                    nums.add(num);
                }
            }
        }
        return nums;
    }
    // TC - O(1), sample string len = 9, low and high length is in between 2 and 9.
    // Nested loop tc is (8 * 8) = 64 times.
    // SC - O(1)
    */
}

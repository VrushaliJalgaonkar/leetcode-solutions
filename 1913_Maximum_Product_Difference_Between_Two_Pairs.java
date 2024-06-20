class Solution {
    public int maxProductDifference(int[] nums) {
        int biggest = 0, secondBiggest = 0; 
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > biggest){
                secondBiggest = biggest;
                biggest = num;
            } else {
                secondBiggest = Math.max(secondBiggest,num);
            }

            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else {
                secondSmallest = Math.min(secondSmallest,num);
            }
        }
        return biggest * secondBiggest - smallest * secondSmallest;
    }
}
//TC - O(n), SC - O(1)

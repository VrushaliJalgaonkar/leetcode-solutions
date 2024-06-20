class Solution {
    public int maxProduct(int[] nums) {
        int biggest = 0, secondBiggest = 0;
        for(int num : nums){
            if(num > biggest){
                secondBiggest = biggest;
                biggest = num;
            } else {
                secondBiggest = Math.max(secondBiggest, num);
            }
        }
        return (biggest - 1) * (secondBiggest - 1);
    }
}
//TC - O(n)
//SC - O(1) 

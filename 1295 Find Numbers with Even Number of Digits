1295. Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
        int cnt =0;
        for(int i=0;i<nums.length;i++){
            if(isEvenDigit(nums[i])){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean isEvenDigit(int n){
        int digits = 0;
        while(n > 0){
            n = n/10;
            digits++;
        }
        return (digits & 1) == 0;
    }
}
// TC - O(N * log M) and SC - O(1)

// Link :https://leetcode.com/problems/armstrong-number/
// Last Practice on : 15-Apr-2025

class Solution {
    public boolean isArmstrong(int n) {

        int length = String.valueOf(n).length();
        return getSumOfKthPowerOfDigits(n, length) == n;
    }
    int getSumOfKthPowerOfDigits(int n, int k){
        int result = 0;
        while(n != 0){
            result = result + (int) Math.pow(n % 10, k);
            n = n/10;
        }
        return result;
    }

    //TC = O(n)
    //SC = O(1)
}

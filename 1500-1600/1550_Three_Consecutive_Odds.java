// Link : https://leetcode.com/problems/three-consecutive-odds/description/
// Last Practice on : 02-Jul-2024

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        //Approach 2: Counting
        int consecutiveOdds = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 1){
                consecutiveOdds++;
            } else {
                consecutiveOdds = 0;
            }

            if(consecutiveOdds == 3){
                return true;
            }

        }
        return false;

        //TC - O(n)
        //SC - O(1)


        //Approach 1: Brute Force
        /*
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;

        TC - O(n - 2) ~ O(n)
        SC - O(n)
        */
    }
}

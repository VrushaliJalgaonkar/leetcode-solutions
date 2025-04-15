// Link : https://leetcode.com/problems/reverse-integer/
// Last Practice on : 15-Apr-2025

class Solution {
    public int reverse(int x) {
        int reverseNum = 0;
        while (x != 0){
            int pop = x %10;
            x = x/10;
            if(reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && pop > 7))
                return 0;
            if(reverseNum < Integer.MIN_VALUE/10 || (reverseNum == Integer.MIN_VALUE/10 && pop < -8))
                return 0;
            reverseNum = reverseNum*10 + pop;
        }
        return reverseNum;
    }

    //TC = O(log x)
    // SC = O(1)
    
}

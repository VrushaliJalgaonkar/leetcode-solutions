// Link : https://leetcode.com/problems/palindrome-number/
// Last Practice on : 15-Apr-2025
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseNumber = 0;
        while(x > reverseNumber){
            reverseNumber = reverseNumber * 10 + (x %10);
            x = x/10;
        }
        return x == reverseNumber || x == reverseNumber/10;   
    }

    //TC = O(log x)
    //SC = O(1)
}

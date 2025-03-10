// Link : https://leetcode.com/problems/determine-if-string-halves-are-alike/
// Last Practice on : 12-Jan-2024

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        return countVowel(0, n/2, s) == countVowel(n/2, n, s);
    }

    int countVowel(int start, int end, String s){
        String vowels = "aeiouAEIOU";
        int ans = 0;
        for(int i=start; i<end;i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                ans++;
            }
        }
        return ans;
    }
    //TC - O(n)
    //SC - O(1)
}

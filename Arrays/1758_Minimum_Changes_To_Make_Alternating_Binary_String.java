class Solution {
    public int minOperations(String s) {
        int startZero = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '1'){
                    startZero++;
                }
            } else {
                if(s.charAt(i) == '0'){
                    startZero++;
                }
            }

        }
        return Math.min(startZero, n - startZero);
    }
}
//TC - O(n), SC - O(1)

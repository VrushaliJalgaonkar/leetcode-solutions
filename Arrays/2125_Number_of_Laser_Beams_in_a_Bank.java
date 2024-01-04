class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, ans = 0;
        for(String b : bank){
            int count = 0;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i) == '1'){
                    count++;
                }
            }
            if(count > 0){
                ans += prev * count;
                prev = count;
            }
        }
        return ans;
    }
}
//TC - O(m * n), where m = number of strings in bank and n = average length of strings 
//SC - O(1)

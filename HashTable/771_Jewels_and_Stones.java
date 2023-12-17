class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int counter = 0;
        for(char j : jewels.toCharArray()){
            set.add(j);
        } 
        for(char s : stones.toCharArray()){
            if(set.contains(s)){
                counter++;
            }
        }
        return counter;
    }
}
//TC - O(J + S), J = jewels length, S = stones length
//SC - O(J), J = jewels length

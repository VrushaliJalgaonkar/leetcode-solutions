// Link : https://leetcode.com/problems/determine-if-two-strings-are-close/
// Last practice on : 14-Jan-2024

class Solution {

    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int[] word1Map = new int[26];
        int[] word2Map = new int[26];
        int word1Bit = 0;
        int word2Bit = 0;
        for(char ch : word1.toCharArray()){
            word1Map[ch - 'a']++;
            word1Bit = word1Bit | (1 << (ch - 'a'));
        }
        for(char ch : word2.toCharArray()){
            word2Map[ch - 'a']++;
            word2Bit = word2Bit | (1 << (ch - 'a'));
        }
        if(word1Bit != word2Bit) return false;
        Arrays.sort(word1Map);
        Arrays.sort(word2Map);
        return Arrays.equals(word1Map, word2Map);
    }
    //TC - O(n), n = word length
    //SC - O(1), constant space for size 26 to store freq map



    /*
        //Approach-1 : HashMap
        public boolean closeStrings(String word1, String word2) {
            if(word1.length() != word2.length()){
                return false;
            }
            Map<Character, Integer> word1Map = new HashMap<>();
            Map<Character, Integer> word2Map = new HashMap<>();
            for(char ch : word1.toCharArray()){
                word1Map.put(ch, word1Map.getOrDefault(ch, 0) + 1);
            }
            for(char ch : word2.toCharArray()){
                word2Map.put(ch, word2Map.getOrDefault(ch, 0) + 1);
            }
            if(!word1Map.keySet().equals(word2Map.keySet())){
                return false;
            }
            List<Integer> word1FreqList = new ArrayList<>(word1Map.values());
            List<Integer> word2FreqList = new ArrayList<>(word2Map.values());
            Collections.sort(word1FreqList);
            Collections.sort(word2FreqList);
            return word1FreqList.equals(word2FreqList);
        }
        //TC - O(n), n = word length + as hasmap would have max [a-z] keys so sorting would take O(26 log26) ~ O(1) 
        //SC - O(1), as max hashmap size would be 26(constant extra space)
    */

}

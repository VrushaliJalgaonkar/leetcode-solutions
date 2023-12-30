class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        Map<Character,Integer> counts = new HashMap<>();
        for(String w : words){
            for(int i = 0;i<w.length();i++){
                counts.put(w.charAt(i), counts.getOrDefault(w.charAt(i), 0) + 1);
            }
        }
        for(Character c : counts.keySet()){
            int val = counts.get(c);
            if(val % n != 0){
                return false;
            }
        }
        return true;
    }
    //TC - O(n * k), where n = words length and k = average length of elements in words
    //SC - O(1), Extra space is used by map. But the input only has lower case englisg characters, so map never grows larger than a size of 26
}

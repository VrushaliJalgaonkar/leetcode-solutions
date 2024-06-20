// Link : https://leetcode.com/problems/sort-characters-by-frequency/
// Last practice on : 7-Feb-2024

class Solution {
    //Approach 3: Multiset and Bucket Sort
    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for(char ch : s.toCharArray()){
            counts.put(ch, counts.getOrDefault(ch,0) + 1);
        }
        int maxFreq = Collections.max(counts.values());
        List<List<Character>> buckets = new ArrayList<>();
        for(int i=0;i<= maxFreq;i++){
            buckets.add(new ArrayList<Character>());
        }
        for(Character key : counts.keySet()){
            int freq = counts.get(key);
            buckets.get(freq).add(key);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = buckets.size()-1;i>=1;i--){
            for(Character ch : buckets.get(i)){
                for(int j=0;j<i;j++){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    //TC - O(n)
    //SC - O(n)


    /*
    //Approach 2: HashMap and Sort
    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for(char ch : s.toCharArray()){
            counts.put(ch, counts.getOrDefault(ch,0) + 1);
        }
        List<Character> characters = new ArrayList<>(counts.keySet());
        Collections.sort(characters, (a,b) -> counts.get(b) - counts.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch : characters){
            int copies = counts.get(ch);
            for(int i=0;i<copies;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    //TC - O(n log n)
    //SC - O(n)
    */


    /*
    //Approach 1: Arrays and Sorting
    public String frequencySort(String s) {
        if(s == null || s.isEmpty()) return s;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        List<String> charStrings = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();
        currentString.append(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(chars[i-1] != chars[i]){
                charStrings.add(currentString.toString());
                currentString = new StringBuilder();
            }
            currentString.append(chars[i]);
        }
        charStrings.add(currentString.toString());
        Collections.sort(charStrings, (a,b) -> b.length() - a.length());
        StringBuilder sb = new StringBuilder();
        for(String str : charStrings) sb.append(str);
        return sb.toString();
    }
    //TC - O(n log n)
    //SC - O(n)
    */
}

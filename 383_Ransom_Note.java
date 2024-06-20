383. Ransom Note


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<ransomNote.length();j++){
            char m = ransomNote.charAt(j);
            int charCount = hm.getOrDefault(m,0);
            if(charCount == 0){
                return false;
            }
            hm.put(m,charCount - 1);
        }
        return true;
    }
}
// TC - O(m)
// SC - O(k), where k is number of distinct characters in magazine

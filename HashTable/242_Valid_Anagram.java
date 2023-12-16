class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            int count = map.getOrDefault(t.charAt(i),0);
            if(count <= 0){
                return false;
            }
            map.put(t.charAt(i), count - 1);
        }
        return true;
    }
}

class Solution {
    //Approach-2: Categorize by count
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
            Map<String,List> result = new HashMap<>();
            int[] count = new int[26];
            for(String s : strs){
                Arrays.fill(count,0);
                for(char c : s.toCharArray()){
                    count[c - 'a']++;
                }
                StringBuilder sb = new StringBuilder("");
                for(int i =0;i<26;i++){
                    sb.append('#');
                    sb.append(count[i]);

                }
                String key = sb.toString();
                result.putIfAbsent(key,new ArrayList<>());
                result.get(key).add(s);
            }
            return new ArrayList(result.values());
    }
    //TC - O(N * K), N = strs length, K = Max length of strings in strs
    //SC - O(N * K)

    /**
        //Approach-1: Categorize by sorted string
        public List<List<String>> groupAnagrams(String[] strs) {
            if(strs.length == 0) return new ArrayList<>();
            Map<String,List> result = new HashMap<>();
            for(String s : strs){
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String key = String.valueOf(ca);
                result.putIfAbsent(key,new ArrayList<>());
                result.get(key).add(s);
            }
            return new ArrayList(result.values());
        }
        //TC - O(N * k * logK), N = strs length, K = Max length of strings in strs
        //SC - O(N * K)
     */
}

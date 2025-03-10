class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List> map = new HashMap<>();
        for(String s : strings){
            String hashKey = getHash(s);
            map.putIfAbsent(hashKey,new ArrayList<>());
            map.get(hashKey).add(s);
        }
        return new ArrayList(map.values());
    }
    String getHash(String s){
        char[] ca = s.toCharArray();
        StringBuilder hashKey = new StringBuilder();
        for(int i=1;i<ca.length;i++){
            hashKey.append((char) ((ca[i] - ca[i-1] + 26) % 26 + 'a'));
        }
        return hashKey.toString();
    }
}
//TC - O(N * K), N = strings length, K = each string in strings length
//SC - O(N * K)

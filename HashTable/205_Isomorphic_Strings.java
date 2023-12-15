class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Approach: First occurence transformation
        return transformString(s).equals(transformString(t));
    }

    public String transformString(String s){
        Map<Character,Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!indexMapping.containsKey(ch)){
                indexMapping.put(ch,i);
            }
            builder.append(Integer.toString(indexMapping.get(ch)));
            builder.append(" ");
        }
        return builder.toString();
    }
}
//TC - O(n)
//SC - O(n)

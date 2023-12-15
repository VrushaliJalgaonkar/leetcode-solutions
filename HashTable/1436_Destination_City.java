class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> hashOutgoing = new HashSet<>();
        for(int i=0;i<paths.size();i++){
            hashOutgoing.add(paths.get(i).get(0));
        }
        for(int i=0;i<paths.size();i++){
            String candidate = paths.get(i).get(1);
            if(!hashOutgoing.contains(candidate)){
                return candidate;
            }
        }
        return "";
    }
}
//TC - O(n)
//SC - O(1)

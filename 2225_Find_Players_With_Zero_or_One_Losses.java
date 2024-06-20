// Link: https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/
// Last practice on: 15-Jan-2024

class Solution {

    //Approach-2: Counting with array
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] count = new int[100001];
        Arrays.fill(count,-1);
        for(int[] m : matches){
            int winner = m[0], loser = m[1];
            if(count[winner] == -1){
                count[winner] = 0;
            }
            if(count[loser] == -1){
                count[loser] = 1;
            } else {
                count[loser] += 1; 
            }
        }
        List<List<Integer>> result = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int i=0; i<100001; i++){
            if(count[i] == 0){
                result.get(0).add(i);
            } else if(count[i] == 1){
                result.get(1).add(i);
            }
        }
        return result;
        
    }
    //TC - O(n + k)
    //SC - O(k)


    /*
        //Approach-1: HashMap
        public List<List<Integer>> findWinners(int[][] matches) {
            Map<Integer,Integer> count = new HashMap<>();
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> ans1 = new ArrayList<>();
            List<Integer> ans2 = new ArrayList<>();
            for(int[] m : matches ){
                int winner = m[0], loser = m[1];
                count.put(winner, count.getOrDefault(winner, 0));
                count.put(loser, count.getOrDefault(loser, 0) + 1);
            }
            for(int k : count.keySet()){
                System.out.println(count.get(k));
            }
            for(int k : count.keySet()){
                if(count.get(k) == 0){
                    ans1.add(k);
                }
                if(count.get(k) == 1){
                    ans2.add(k);
                }
            }
            Collections.sort(ans1);
            Collections.sort(ans2);
            result.add(ans1);
            result.add(ans2);
            return result;
        }
        //TC - O(n logn)
        //SC - O(n)
    */
    
}

// Link : https://leetcode.com/problems/minimum-window-substring/
// Last practice on : 5-Feb-2024

class Solution {
    //Approach 2: Optimized Sliding Window
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0){
            return "";
        }
        Map<Character, Integer> dict = new HashMap<>();
        for(int i=0;i<t.length();i++){
            dict.put(t.charAt(i), dict.getOrDefault(t.charAt(i), 0)+1);
        }
        int required = dict.size();
        List<Pair<Integer, Character>> filteredS = new ArrayList<Pair<Integer, Character>>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dict.containsKey(c)) {
                filteredS.add(new Pair<Integer, Character>(i, c));
            }
        }
        int l =0,r=0;
        int formed = 0;
        Map<Character,Integer> windowCounts = new HashMap<>();
        int ans[] = {-1,0,0};
        while(r < s.length()){
            char ch = s.charAt(r);
            int count = windowCounts.getOrDefault(ch, 0);
            windowCounts.put(ch, count + 1);
            if(dict.containsKey(ch) && windowCounts.get(ch).intValue() == dict.get(ch).intValue()){
                formed++;
            }
            while(l <= r && formed == required){
                ch = s.charAt(l);
                if(ans[0] == -1 || r - l + 1 < ans[0]){
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                windowCounts.put(ch, windowCounts.get(ch) - 1);
                if(dict.containsKey(ch) && windowCounts.get(ch).intValue() < dict.get(ch).intValue()){
                    formed--;
                }
                l++;
            }
            r++;

        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        //TC - O(|S| + |T|), |S| = s length, |T| = t length. But in certain cases where ∣filtered_S∣ <<< ∣S∣, the complexity would reduce because the number of iterations would be 2∗∣filtered_S∣+∣S∣+∣T∣.
        //SC - O(|S| + |T|), ∣S∣ when the window size is equal to the entire string S. ∣T∣ when T has all unique characters.
    }

    /*
    //Approach 1: Sliding Window
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0){
            return "";
        }
        Map<Character, Integer> dict = new HashMap<>();
        for(int i=0;i<t.length();i++){
            dict.put(t.charAt(i), dict.getOrDefault(t.charAt(i), 0)+1);
        }
        int required = dict.size();
        int l =0,r=0;
        int formed = 0;
        Map<Character,Integer> windowCounts = new HashMap<>();
        int ans[] = {-1,0,0};
        while(r < s.length()){
            char ch = s.charAt(r);
            int count = windowCounts.getOrDefault(ch, 0);
            windowCounts.put(ch, count + 1);
            if(dict.containsKey(ch) && windowCounts.get(ch).intValue() == dict.get(ch).intValue()){
                formed++;
            }
            while(l <= r && formed == required){
                ch = s.charAt(l);
                if(ans[0] == -1 || r - l + 1 < ans[0]){
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                windowCounts.put(ch, windowCounts.get(ch) - 1);
                if(dict.containsKey(ch) && windowCounts.get(ch).intValue() < dict.get(ch).intValue()){
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        //TC - O(|S| + |T|), |S| = s length, |T| = t length
        //SC - O(|S| + |T|), ∣S∣ when the window size is equal to the entire string S. ∣T∣ when T has all unique characters.
    }
    */
    
}

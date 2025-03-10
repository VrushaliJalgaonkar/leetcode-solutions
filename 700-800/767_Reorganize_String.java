// Link : https://leetcode.com/problems/reorganize-string/description/
// Last Practice on : 10-Mar-2025

class Solution {
    public String reorganizeString(String s) {

        //Approach 2: Counting and Odd/Even [Optimal]
        int[] charCounts = new int[26];
        for(char ch : s.toCharArray()){
            charCounts[ch - 'a']++;
        }
        int maxCount = 0, maxCharCountIndex = 0;
        for(int i=0;i<26;i++){
            if(charCounts[i] > maxCount){
                maxCount = charCounts[i];
                maxCharCountIndex = i;
            }
        }

        if(maxCount > (s.length() + 1)/2){
            return "";
        }
        char[] ans = new char[s.length()];
        int index = 0;

        //Place most frequent letter
        while(charCounts[maxCharCountIndex] != 0){
            ans[index] = (char) (maxCharCountIndex + 'a');
            index += 2;
            charCounts[maxCharCountIndex]--;
        }

        //Place rest of the letters

        for(int i=0;i<26;i++){
            while(charCounts[i] != 0){
                if(index >= s.length()){
                    index = 1;
                }
                ans[index] = (char) (i + 'a');
                index += 2;
                charCounts[i]--;
            }
        }

        return String.valueOf(ans);
        //n is total characters in string, k = total unique characters in string
        //TC - O(n)
        //SC - O(k) 



        //Approach 1: Counting and Priority Queue
        // int[] charCounts = new int[26];
        // for(char ch : s.toCharArray()){
        //     charCounts[ch - 'a']++;
        // }

        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
        // for(int i=0;i<26;i++){
        //     if(charCounts[i] > 0){
        //         pq.offer(new int[] {i + 'a', charCounts[i]});
        //     }
        // }

        // StringBuilder sb = new StringBuilder();
        // while(!pq.isEmpty()){
        //     int[] first = pq.poll();
        //     if(sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1)){
        //         sb.append((char) first[0]);
        //         if(--first[1] > 0){
        //             pq.offer(first);
        //         }

        //     } else {
        //         if(pq.isEmpty()){
        //             return "";
        //         } 
        //         int[] second = pq.poll();
        //         sb.append((char) second[0]);
        //         if(--second[1] > 0){
        //             pq.offer(second);
        //         }
        //         pq.offer(first);
        //     }
        // }
        // return sb.toString();   
        //TC - O(n log k), n is total characters in string, k = total unique characters in string
        //SC - O(k) 
    }
}


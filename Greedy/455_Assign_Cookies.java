class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(j < s.length && i< g.length){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}
//TC - O(n log n + m log m)
//SC - O(log n + log m), Because Arrays.sort() takes O(log n + log m) for sorting two arrays

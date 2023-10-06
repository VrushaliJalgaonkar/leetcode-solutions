class Solution {
    public boolean checkIfExist(int[] arr) {
      Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            map.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(2 * arr[i]) &&
                map.get(2 * arr[i]) != i) {
                return true;
            }
        }

        return false;
    }
}

// TC - O(n) and SC - O(n)

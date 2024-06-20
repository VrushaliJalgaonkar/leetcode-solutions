class Solution {
    int[] unique;
    Map<Integer,Integer> count;

    public void swap(int a, int b){
        int temp = unique[a];
        unique[a] = unique[b];
        unique[b] = temp;
    }

    public int partition(int left, int right, int pivotIndex){
        int pivotFrequency = count.get(unique[pivotIndex]);
        swap(pivotIndex,right);
        int storeIndex = left;
        for(int i=left;i <= right;i++){
            if(count.get(unique[i]) < pivotFrequency){
                swap(storeIndex,i);
                storeIndex++;
            }
        }
        swap(storeIndex,right);
        return storeIndex;
    }

    public void quickSelect(int left, int right, int kSmallest){
        if(left == right) return;
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right-left);
        pivotIndex = partition(left, right, pivotIndex);
        if(kSmallest == pivotIndex){
            return;
        } else if(kSmallest < pivotIndex){
            quickSelect(left, pivotIndex-1, kSmallest);
        } else {
            quickSelect(pivotIndex+1, right, kSmallest);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        count = new HashMap<>();
        for(int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        int n = count.size();
        unique = new int[n];
        int i = 0;
        for(int num : count.keySet()){
            unique[i++] = num;
        }
        quickSelect(0,n-1,n-k);
        return Arrays.copyOfRange(unique,n-k,n);
    }
}
//TC - O(n), SC - O(n)
